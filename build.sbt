name := "Spark starter"
version := "0.1"

val sparkVersion = "2.3.2"
val junitJupiter = "5.3.1"
val junitPlatform = "1.3.1"
val akkaVersion = "2.5.16"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.1",
  "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test,
  "org.scalacheck" %% "scalacheck" % "1.14.0" % Test,
  "junit" % "junit" % "4.12" % Test,
  "org.junit.jupiter" % "junit-jupiter-api" % junitJupiter % Test,
  "org.junit.jupiter" % "junit-jupiter-engine" % junitJupiter % Test,
  "org.junit.jupiter" % "junit-jupiter-params" % junitJupiter % Test,
  "org.junit.platform" % "junit-platform-launcher" % junitPlatform % Test,
  "org.junit.platform" % "junit-platform-engine" % junitPlatform % Test,
  "org.junit.platform" % "junit-platform-runner" % junitPlatform % Test,
  "org.jetbrains.spek" % "spek-junit-platform-engine" % "1.1.5" % Test,
  "org.specs2" %% "specs2-junit" % "4.3.4" % Test,
  "mysql" % "mysql-connector-java" % "5.1.6",
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "org.apache.spark" %% "spark-graphx" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion
)

//testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

resolvers ++= Seq(
  Resolver.mavenLocal,
  DefaultMavenRepository
)
