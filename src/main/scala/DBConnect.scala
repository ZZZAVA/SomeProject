import slick.jdbc.PostgresProfile.api._
object DBConnect  {


  val db = Database.forConfig("postgres")
}