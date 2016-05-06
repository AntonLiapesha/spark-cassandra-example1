name := "spark-cassandra-example1"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
//  "org.apache.spark" %% "spark-core_2.11" % "1.6.1" % "provided",
  "org.apache.spark" % "spark-core_2.11" % "1.6.1" % "provided"
//  ,
//  "org.apache.spark" %% "spark-sql" % "1.6.0",
//  "com.datastax.spark" %% "spark-cassandra-connector" % "1.6.0-M2" withSources() withJavadoc()
)
    