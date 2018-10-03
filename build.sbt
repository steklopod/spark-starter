import scalariform.formatter.preferences._

name := "Apache Spark example"

version := "0.1"

scalaVersion := "2.12.6"

val akkaVersion = "2.5.16"
val junitJupiter = "5.2.0"
val junitPlatform = "1.2.0"
val sparkVersion = "2.3.2"

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
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalariform" %% "scalariform" % "0.2.6",
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "mysql" % "mysql-connector-java" % "5.1.6"
)

testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

parallelExecution in Test := false

resolvers ++= Seq(
  DefaultMavenRepository,
  Classpaths.typesafeReleases,
//  Resolver.sonatypeRepo("snapshots"),
//  Resolver.jcenterRepo
)

scalariformPreferences := scalariformPreferences.value
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(DoubleIndentConstructorArguments, true)
  .setPreference(DanglingCloseParenthesis, Preserve)
scalariformAutoformat := true
scalariformWithBaseDirectory := true
