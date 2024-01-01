package org.scalajs.dom.pixijs.examples

import org.scalajs.dom.pixijs.{Application, ApplicationOptions, Container, PIXI, Sprite, Texture}

import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.dom.*

import scala.scalajs.js
object BasicExample:
  val W = 1000
  val H = 600
  def createSnows(n: Int, snow: Sprite): List[Sprite] =
    val list = for i <- 0 until n yield
      val sprite = Sprite.from(snow.texture)
      sprite.anchor.set(0.5)
      sprite.x = js.Math.floor(js.Math.random() * W)
      sprite.y = js.Math.floor(js.Math.random() * (H - 50) + 50)
      sprite.rotation = Math.floor(Math.random())
      sprite
    list.toList

  @JSExportTopLevel("basic")
  def main() =
    val typeBackground = if !PIXI.utils.isWebGLSupported() then "canvas" else "WebGL"
    console.log(typeBackground)
    val config = ApplicationOptions(width = W, height = H, backgroundColor = 0x040388)
    console.log(config)
    val app = new Application(config)
    document.body.appendChild(app.view)
    val mainContainer = new Container()
    app.stage.addChild(mainContainer)
    val tree = Sprite.from("img/tree.png")
    tree.anchor.set(0.5, 1)
    tree.x = 500
    tree.y = 600
    mainContainer.addChild(tree)
    val snowContainer = new Container()
    val snowImg = Sprite.from("img/snowflake.png")
    val snowflakes = createSnows(50, snowImg)
    for snowflake <- snowflakes do
      console.log(snowflake)
      snowContainer.addChild(snowflake)
    app.stage.addChild(snowContainer)
    val starContainer = new Container()
    ""

