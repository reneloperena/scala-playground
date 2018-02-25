import akka.actor.Actor
import akka.actor.Props
import akka.event.Logging

class ExportDataset extends Actor {
  val log = Logging(context.system, this)

  def receive = {
    case ds : Dataset ⇒ log.info(ds.message)
    case _ ⇒ log.info("received unknown message")
  }
}

object ExportDataset {
  def props: Props = Props[ExportDataset]
}
