import Publish._

libraryDependencies ++= Seq(
  "org.typelevel" % "cats-core_2.12" % "2.0.0-RC1",
  "io.monix" %% "monix" % "3.0.0-RC4",
  "com.fasterxml" % "aalto-xml" % "1.2.1",
  "org.scalactic" %% "scalactic" % "3.0.5" % "test",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
)

publishName := "core"

sources in (Compile, doc) := Seq.empty