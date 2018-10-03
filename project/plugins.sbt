logLevel := Level.Warn

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2") //https://github.com/sbt/sbt-scalariform

//addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")

resolvers ++= Seq( Resolver.sonatypeRepo("snapshots"), Resolver.sbtPluginRepo("snapshots") )
