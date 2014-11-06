name := "angular-seed-play"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" % "angularjs" % "1.3.0-beta.2",
  "org.webjars" % "requirejs" % "2.1.11-1"
)     

lazy val root = (project in file(".")).enablePlugins(PlayScala, JavaAppPackaging)

pipelineStages := Seq(rjs, digest, gzip)
