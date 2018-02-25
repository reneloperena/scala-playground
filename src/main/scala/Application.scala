import akka.actor.{ Actor, ActorLogging, ActorRef, ActorSystem, Props }

object Application extends App {
  val system = ActorSystem("silly-app")

  val dataset = new Dataset("hola omar")

  val printer: ActorRef = system.actorOf(ExportDataset.props, "exportDatasetActor")
  
  printer ! dataset
}
