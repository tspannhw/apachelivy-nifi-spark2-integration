name := "Logs"
version := "1.0"
scalaVersion := "2.11.8"


libraryDependencies  += "org.apache.spark" % "spark-core_2.11" % "2.2.0" % "provided"
libraryDependencies  += "org.apache.spark" % "spark-sql_2.11" % "2.2.0" % "provided"
libraryDependencies  += "org.apache.spark" %% "spark-hive" % "2.2.0" % "provided"
libraryDependencies  += "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.13"
libraryDependencies  += "com.google.code.gson" % "gson" % "2.8.2"

