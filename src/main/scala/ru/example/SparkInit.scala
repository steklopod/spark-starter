package ru.example

import ru.example.StaticStorage.getSparkContext

object SparkInit extends App {

  //  val sc = new SparkContext(master, "WordCount", System.getenv("SPARK_HOME"))
  val sc = getSparkContext(args, "BasicMap")
  val input = sc.parallelize(List(1, 2, 3, 4))
  val result = input.fold(0)((x, y) => x + y)

  println(result)

}
