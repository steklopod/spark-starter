package ru.example

import org.scalatest.{FunSpec, FunSuite, Matchers}

class InitTest extends FunSpec with Matchers {

  describe("running a test") {

    println("0. in describe")

    it("should do something") {
      println("2. in my test")
    }
  }

}