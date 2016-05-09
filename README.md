# spark-cassandra-example1
Simple Example of using Spark and Cassandra(DataStax)

# To launch:  

```
sbt assembly
```
```
spark-submit --class com.aliapesha.sparkCassandraEx1.SparkCassandraEx1Main \
./target/scala-2.10/sparkCassandraEx1.jar \
./data/GDP.csv
```