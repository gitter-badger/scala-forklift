name := "scala-forklift-core"

libraryDependencies ++= List(
  "org.scala-lang" % "scala-compiler" % "2.11.6"
  ,"com.typesafe" % "config" % "1.3.0"
  ,"org.eclipse.jgit" % "org.eclipse.jgit" % "4.0.1.201506240215-r"
  ,"org.xerial" % "sqlite-jdbc" % "3.6.20"
  ,"org.slf4j" % "slf4j-nop" % "1.6.4" // <- disables logging
/*
// enables logging
  ,"org.slf4j" % "slf4j-api" % "1.6.4"
  ,"ch.qos.logback" % "logback-classic" % "0.9.28"
*/
/*
// Other database drivers
  "org.apache.derby" % "derby" % "10.6.1.0",
  "org.hsqldb" % "hsqldb" % "2.0.0",
  "postgresql" % "postgresql" % "8.4-701.jdbc4",
  "mysql" % "mysql-connector-java" % "5.1.13"
*/
)
