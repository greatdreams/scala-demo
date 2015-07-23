package com.greatdreams.scala.demo

/**
 * Created by greatdreams on 7/23/15.
 */
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.{BasicResponseHandler, DefaultHttpClient}

object RestClient {
  def main(args: Array[String]) = {
    println("Rest Client")
    val httpget = new HttpGet("http://bbs.byr.cn")
    val responseBody = new DefaultHttpClient().execute(httpget, new BasicResponseHandler())
    println(responseBody)
    println(Util.add(10, 20))
    println("program exit 0")
  }
}

object Util {
  def add(a :Int, b: Int) :Int = {a + b}
}