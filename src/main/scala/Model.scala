case class Worklist(id:Long, company:String, name:String)


object SlickTables{
  import slick.jdbc.PostgresProfile.api._

  class WorklistTable(tag:Tag) extends Table[Worklist](tag, Some("worklist"), "Worklist"){
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def name = column[String]("company")
    def company = column[String]("name")
    override def * = (id,company,name)<>(Worklist.tupled, Worklist.unapply)



  }
  lazy val worklistTable = TableQuery[WorklistTable]
}