lazy val root = (project in file(".")).
  settings(
    organization := "com.typesafe.spark",
    name := "simple-streaming-app",
    version := "0.3.1",
    scalaVersion := "2.10.5",
    resolvers += "bintray-typesafe-maven-releases" at "http://dl.bintray.com/skyluc/maven",
    resolvers += "bintray-skyluc-maven" at "http://dl.bintray.com/skyluc/maven",
    resolvers += "spark-staging" at "https://repository.apache.org/content/repositories/orgapachespark-1140/",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "v1.5.0-rc3-RS-01" % "provided",
      "org.apache.spark" %% "spark-streaming" % "v1.5.0-rc3-RS-01" % "provided",
      "com.typesafe.spark" %% "toy-rs-tcp" % "0.0.1",
      "com.github.scopt" %% "scopt" % "3.3.0"
    )
  )
