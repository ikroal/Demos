package com.ikroal

import org.apache.spark.sql.SparkSession
import org.apache.sysml.api.mlcontext.{MLContext, ScriptFactory}

/**
  * @author ikroal
  * @date 2019-06-09
  * @time: 22:34
  * @version: 1.0.0
  */
class Demo {

  val DML_PATH: String = "/Users/firstdream/Desktop/demo.dml"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("Demo")
      .master("local").getOrCreate()
    val ml = new MLContext(spark)
    val script = ScriptFactory.dmlFromFile(DML_PATH)
    ml.execute(script)
  }
}
