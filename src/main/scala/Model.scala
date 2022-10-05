case class Worklist(id:Long, companyId:Long, nameId:Long)
case class Company(id:Long, company:String)

case class Employee(id:Long, name:String)
object SlickTables{
  import slick.jdbc.PostgresProfile.api._

  //TODO worklist -> keys


  class CompanyTable(tag: Tag) extends Table[Company](tag, Some("worklist"), "Company") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    def company = column[String]("company")


    override def * = (id, company) <> (Company.tupled, Company.unapply)
  }


  class EmployeeTable(tag: Tag) extends Table[Employee](tag, Some("worklist"), "Employee") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    def name = column[String]("name")

    override def * = (id, name) <> (Employee.tupled, Employee.unapply)
  }

  lazy val companyTable = TableQuery[CompanyTable]
  lazy val employeeTable = TableQuery[EmployeeTable]

  class WorklistTable(tag:Tag) extends Table[Worklist](tag, Some("worklist"), "Worklist") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    def nameId = column[Long]("name")


    def companyId = column[Long]("company")

    def company = foreignKey("company_fk", companyId, companyTable)(_.id, onDelete = ForeignKeyAction.Cascade)

    def name = foreignKey("name_fk", nameId, employeeTable)(_.id, onDelete = ForeignKeyAction.Cascade)

    override def * = (id, companyId, nameId) <> (Worklist.tupled, Worklist.unapply)
  }








  lazy val worklistTable = TableQuery[WorklistTable]

}