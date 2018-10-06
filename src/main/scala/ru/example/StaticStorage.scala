package ru.example

import org.apache.hadoop.mapred.InvalidInputException
import org.apache.spark.SparkContext

object StaticStorage {

  //значение мастера 2-ом аргументе
  def getMaster(args: Array[String]): String = {
    val master = args.length match {
      case x: Int if x > 0 => args(0)
      case _               => "local"
    }
    master
  }

  def getSparkContext(args: Array[String], name: String): SparkContext = {
    new SparkContext(getMaster(args), name, System.getenv("SPARK_HOME"))
  }

  //TODO - пересмотреть коллекцию по умолчанию
  def defaultTextFile(sc: SparkContext, filePath: String = "defaultTextFile") =
    try {
      sc.textFile(filePath)
    } catch {
      case _: InvalidInputException ⇒
        sc.parallelize(List("1", "2", "3", "4"))
    }

  //читаем файл, переданный во 2-ом аргументе
  def getInputFile(args: Array[String], sc: SparkContext) = args.length match {
    case x: Int if x > 1 => sc.textFile(args(1))
    case _               => defaultTextFile(sc)
  }

}
