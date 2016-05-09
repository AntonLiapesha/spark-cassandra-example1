package com.aliapesha.sparkCassandraEx1

import com.datastax.spark.connector._
import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}


object SparkCassandraEx1Main {
  def main(args: Array[String]) {
    val inputFile = args(0)
    val conf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("Spark-CassandraEx1")
      .set("spark.cassandra.connection.host", "127.0.0.1")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    val df = sqlContext.read.format("com.databricks.spark.csv").option("header", "true").load(inputFile)
    val items = df.rdd.map(CountryGdp.apply)
    items.saveToCassandra("ex1", "gdp", SomeColumns("id", "rank", "name", "amount"))
    val totalGdp = sc.cassandraTable[CountryGdp]("ex1", "gdp").aggregate(0)(_ + _.amount, _ + _)
    println(s"total gdp: $totalGdp")
  }
}


