package com.vitra.hello

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object hello_world {
    
  def main(args: Array[String]) = {
        //Start the Spark context
    val conf = new SparkConf()
      .setAppName("WordCount")
      .setMaster("local")
    val sc = new SparkContext(conf)
    
    val hello = "hello World !!!"
    
    hello.split(' ').foreach(w => println(w))

    //Stop the Spark context
    sc.stop
    }
}