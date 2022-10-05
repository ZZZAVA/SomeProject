import cats.effect.Sync
import org.http4s.dsl.Http4sDsl
import org.http4s.HttpRoutes
import org.log4s.{getLogger, Logger}

class Service[F[_]: Sync]() extends Http4sDsl[F] {
  private val logger: Logger = getLogger

  //main.start()

  val routes: HttpRoutes[F] = HttpRoutes.of[F] {
    case GET -> Root => Ok(main.readAllWorklist())
    case GET -> Root / "employee" => Ok(main.readAllEmployee())
    case GET -> Root / "company" => Ok(main.readAllCompany())
  }
}