import cats.effect.{ExitCode, IO, IOApp}
import org.http4s.server.blaze.BlazeServerBuilder
//import org.http4s.dsl.io.http4sKleisliResponseSyntax

object Server extends IOApp {


    def run(args: List[String]): IO[ExitCode] = {

      BlazeServerBuilder[IO]
        .bindHttp(8080, "localhost")
        .withHttpApp(new Service[IO]().routes.orNotFound)
        .serve
        .compile
        .drain
        .map(_ => ExitCode.Success)
    }


}
