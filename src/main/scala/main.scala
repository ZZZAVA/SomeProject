

import java.util.concurrent.Executors
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}


object PrivateExecutionContext{
  val executor = Executors.newFixedThreadPool(4)
  implicit val ec: ExecutionContext = ExecutionContext.fromExecutorService(executor)
}


object main {

  import PrivateExecutionContext._
  import slick.jdbc.PostgresProfile.api._

 // val wo = Seq(Worklist(1L, "SomeComp", "Ivan Ivanov"), Worklist(2L, "SomeComp", "Artem Ivanov"), Worklist(3L, "Comp", "Ivan Sidorov"))




  def insertDB(worklist: Worklist): Unit = {

    val queryDescription = SlickTables.worklistTable += worklist

    val futureId :Future[Int] =  DBConnect.db.run(queryDescription)
    futureId.onComplete{
      case Success(newWorklistId) => println(s"Add $newWorklistId")
      case Failure(exception) => println(s"Err: $exception")
    }
    Thread.sleep(10000)
  }

  def readAllDB(): Unit={
    val resFuture:Future[Seq[Worklist]] = DBConnect.db.run(SlickTables.worklistTable.result)
    resFuture.onComplete {
      case Success(worklist) => println(s"Fetched ${worklist.mkString(",")}")
      case Failure(exception) => println(s"Err: $exception")
    }
    Thread.sleep(10000)
  }

  def readOnceDB(company:String): Unit = {
    val resFuture: Future[Seq[Worklist]] = DBConnect.db.run(SlickTables.worklistTable.filter(_.company === company).result)
    resFuture.onComplete {
      case Success(worklist) => println(s"Fetched ${worklist.mkString(",")}")
      case Failure(exception) => println(s"Err: $exception")
    }
    Thread.sleep(10000)
  }



  def main(args:Array[String]): Unit = {

    insertDB(Worklist(1L, "SomeComp", "Ivan Ivanov"))

    insertDB(Worklist(2L, "SomeComp", "Artem Ivanov"))

    insertDB(Worklist(3L, "Comp", "Ivan Sidorov"))

   // readAllDB()
  }

  def start():Unit={

    insertDB(Worklist(1L, "SomeComp", "Ivan Ivanov"))

    insertDB(Worklist(2L, "SomeComp", "Artem Ivanov"))

    insertDB(Worklist(3L, "Comp", "Ivan Sidorov"))
  }
}
