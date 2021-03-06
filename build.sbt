name := "spark-cassandra-example1"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
//  "org.apache.spark" %% "spark-core_2.11" % "1.6.1" % "provided",
  "org.apache.spark" % "spark-core_2.10" % "1.6.1" % "provided",
  "org.apache.spark" %% "spark-sql" % "1.6.0",
  "com.datastax.spark" %% "spark-cassandra-connector" % "1.6.0-M1",
  "com.databricks" % "spark-csv_2.10" % "1.4.0"
)
    