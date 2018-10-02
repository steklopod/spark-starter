name := "Apache Spark example"

version := "0.1"

scalaVersion := "2.12.6"

lazy val akkaVersion = "2.5.16"
lazy val junitJupiter = "5.2.0"
lazy val junitPlatform = "5.2.0"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.1",
  "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test,
  "org.scalacheck" %% "scalacheck" % "1.13.5" % "test",
  "junit" % "junit" % "4.12" % Test,
  "org.junit.jupiter" % "junit-jupiter-api" % junitJupiter % Test,
  "org.junit.jupiter" % "junit-jupiter-engine" % junitJupiter % Test,
  "org.junit.jupiter" % "junit-jupiter-params" % junitJupiter % Test,
  "org.junit.platform" % "junit-platform-launcher" % junitPlatform % Test,
  "org.junit.platform" % "junit-platform-engine" % junitPlatform % Test,
  "org.junit.platform" % "junit-platform-runner" % junitPlatform % Test,
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion
)

testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

parallelExecution in Test := false

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sbtPluginRepo("snapshots"),
  Resolver.typesafeIvyRepo("snapshots"),
  Resolver.jcenterRepo,
  Classpaths.typesafeReleases
)
