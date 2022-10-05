ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.9"

lazy val root = (project in file("."))
  .settings(
    name := "SomeProject"
  )
libraryDependencies += "org.http4s" %% "http4s-dsl" % "0.23.11"
libraryDependencies += "org.http4s" %% "http4s-core" % "0.23.11"
// https://mvnrepository.com/artifact/org.http4s/http4s-circe
libraryDependencies += "org.http4s" %% "http4s-circe" % "0.23.11"
// https://mvnrepository.com/artifact/org.http4s/http4s-blaze-client
libraryDependencies += "org.http4s" %% "http4s-blaze-client" % "0.23.11"
// https://mvnrepository.com/artifact/org.http4s/http4s-blaze-server
libraryDependencies += "org.http4s" %% "http4s-blaze-server" % "0.23.11"
// https://mvnrepository.com/artifact/org.http4s/http4s-client
libraryDependencies += "org.http4s" %% "http4s-client" % "0.23.11"
// https://mvnrepository.com/artifact/org.http4s/http4s-server
libraryDependencies += "org.http4s" %% "http4s-server" % "0.23.11"
// https://mvnrepository.com/artifact/com.softwaremill.sttp.tapir/tapir-http4s-server
libraryDependencies += "com.softwaremill.sttp.tapir" %% "tapir-http4s-server" % "0.20.2"
// https://mvnrepository.com/artifact/io.janstenpickle/trace4cats-sttp-client3
libraryDependencies += "io.janstenpickle" %% "trace4cats-sttp-client3" % "0.14.0"
libraryDependencies += "io.circe"        %% "circe-generic" %"0.14.3"
libraryDependencies +="com.softwaremill.sttp.tapir" %% "tapir-http4s-server" % "1.1.2"
libraryDependencies +="com.typesafe.slick" %% "slick" % "3.3.3"
libraryDependencies +="org.postgresql" % "postgresql" % "42.3.4"
libraryDependencies +="com.typesafe.slick" %% "slick-hikaricp" % "3.3.3"
libraryDependencies +="com.github.tminglei" %% "slick-pg" % "0.20.3"
libraryDependencies +="com.github.tminglei" %% "slick-pg_play-json" % "0.20.3"
