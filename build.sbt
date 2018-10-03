name := "Apache Spark example"

version := "0.1"

scalaVersion := "2.11.12"

val akkaVersion = "2.5.16"
val junitJupiter = "5.2.0"
val junitPlatform = "1.2.0"
val sparkVersion = "2.3.0"

libraryDependencies ++= Seq(
//  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.1",
  "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test,
//  "org.scalacheck" %% "scalacheck" % "1.14.0" % "test",
  "junit" % "junit" % "4.12" % Test,
  "org.junit.jupiter" % "junit-jupiter-api" % junitJupiter % Test,
  "org.junit.jupiter" % "junit-jupiter-engine" % junitJupiter % Test,
  "org.junit.jupiter" % "junit-jupiter-params" % junitJupiter % Test,
  "org.junit.platform" % "junit-platform-launcher" % junitPlatform % Test,
  "org.junit.platform" % "junit-platform-engine" % junitPlatform % Test,
  "org.junit.platform" % "junit-platform-runner" % junitPlatform % Test,
//  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
//  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
//  "org.scalariform" %% "scalariform" % "0.2.6",
  // https://mvnrepository.com/artifact/commons-codec/commons-codec

  "org.apache.spark" %% "spark-core" % sparkVersion
//  "commons-codec" % "commons-codec" % "1.8"

  //  "org.apache.spark" %% "spark-sql" % sparkVersion,
//  "org.apache.spark" %% "spark-mllib" % sparkVersion,
//  "org.apache.spark" %% "spark-streaming" % sparkVersion,
//  "org.apache.spark" %% "spark-hive" % sparkVersion,

//  "mysql" % "mysql-connector-java" % "5.1.6"
)

testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")


resolvers ++= Seq(
  DefaultMavenRepository,
  Classpaths.typesafeReleases,
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
//  Resolver.jcenterRepo
)

//scalariformAutoformat := true
//scalariformWithBaseDirectory := true
