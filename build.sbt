name := "etcd-http-scala"

version := "0.1"

organization := "com.ruiandrebatista"

scalaVersion  := "2.11.6"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
	val akkaV = "2.3.11"
	val akkaStreamV = "1.0-RC3"
	Seq("com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-stream-experimental"             % akkaStreamV,
    "com.typesafe.akka" %% "akka-http-core-experimental"          % akkaStreamV,
    "com.typesafe.akka" %% "akka-http-experimental"         % akkaStreamV,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaStreamV,
"org.scalatest" %% "scalatest" % "2.2.4" % "test",
"com.whisk" %% "docker-it-scala" % "0.1.2" % "test")
}


seq(lsSettings :_*)
