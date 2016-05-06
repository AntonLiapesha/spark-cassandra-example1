/**
 * Illustrates flatMap + countByValue for wordcount.
 */
package com.aliapesha.sparkCassandraEx1

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.sql.SQLContext

object SparkCassandraEx1Main {
    def main(args: Array[String]) {
      val inputFile = args(0)
      val conf = new SparkConf().setAppName("wordCount")
      // Create a Scala Spark Context.
      val sc = new SparkContext(conf)
      val sqlContext = new SQLContext(sc)
      // Load our input data.
      val df = sqlContext.read.format("com.databricks.spark.csv").option("header","true").load(inputFile)
//      val df = sqlContext.cv
//        read.format("com.databricks.spark.csv").option("header","true").load(inputFile)
      df.foreachPartition({
        iterator =>
          iterator.foreach(row => println(" ==1=="+row.toString))
      })
//      val input =  sc.textFile(inputFile)
//      val input =  sc.reat(inputFile)
      // Split up into words.
//      val words = input.flatMap(line => line.split(" "))
      // Transform into word and count.
//      val counts = words.map(_.toLowerCase.filter(_.isLetter)).filter(w => w.length > 3 ).map(word => (word, 1)).reduceByKey{case (x, y) => x + y}
      // Save the word count back out to a text file, causing evaluation.
//      counts.coalesce(1).sortBy(_._2).saveAsTextFile(outputFile)
//      val res = counts.coalesce(1).sortBy(_._2).collect().reverse.takeOrdered(10)(Ordering.by(_._2))
//      val res = counts.coalesce(1).sortBy(_._2, false).collect().take(10)
//      val res = counts.takeOrdered(10)(Ordering.by(-_._2))
//      println(res.mkString("\n"))

//        saveAsTextFile(outputFile)
//      counts.collect().sortBy(_._2).reverse.take(10).foreach(println)
    }
}
