package org.scalajs.dom.pixijs

import utest.*
import scala.scalajs.js.*
import org.scalajs.dom.document
import org.scalajs.dom.pixijs.*
object MainTest extends TestSuite {
  val paragraph = document.createElement("p")
  paragraph.textContent = "This is a test paragraph."
  document.body.appendChild(paragraph)
  val tests = Tests {
    test("test working?") {
      val paragraphs2 = document.querySelectorAll("p")
      val paragraphsWithText = paragraphs2.count(_.textContent == "This is a test paragraph.")
      assert(paragraphsWithText == 1)
    }
    test("test2") {
      //val app = new PIXI.Application()
      1
    }
  }

}
