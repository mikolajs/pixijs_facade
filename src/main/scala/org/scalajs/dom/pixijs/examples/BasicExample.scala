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

  def createStars(n: Int, star: Sprite): List[Sprite] =
    val list = for i <- 0 until n yield
      val sprite = Sprite.from(star.texture)
      sprite.anchor.set(0.5)
      sprite.x = js.Math.floor(js.Math.random() * W)
      sprite.y = js.Math.floor(js.Math.random() * (H/2 - 50) + 50)
      sprite.rotation = Math.floor(Math.random())
      sprite
    list.toList

  def moveFlakes(flakes: List[Sprite]): Unit =
    for flake <- flakes do
      flake.y += 1
      if flake.y > H then flake.y = 50
      if flake.rotation > js.Math.PI then flake.rotation = 0
      else flake.rotation += 0.01

  @JSExportTopLevel("basic")
  def main() =
    var step = 0
    val typeBackground = if !PIXI.utils.isWebGLSupported() then "canvas" else "WebGL"
    console.log(typeBackground)
    val config = ApplicationOptions(width = W, height = H, backgroundColor = 0x040388)
    console.log(config)
    val app = new Application(config)
    document.body.appendChild(app.view)
    val mainContainer = new Container()
    app.stage.addChild(mainContainer)
    val ground = Sprite.from("img/ground.png")
    ground.anchor.set(0, 1)
    ground.x = 0
    ground.y = 600
    mainContainer.addChild(ground)
    val star = Sprite.from("img/star.png")
    val stars = createStars(50, star)
    for s <- stars do
      mainContainer.addChild(s)
    val cloud = Sprite.from("img/clouds.png")
    cloud.anchor.set(0,0)
    cloud.x = 0
    cloud.y = 0
    mainContainer.addChild(cloud)
    val tree = Sprite.from("img/tree.png")
    tree.anchor.set(0.5, 1)
    tree.x = 500
    tree.y = 600
    mainContainer.addChild(tree)
    val snowContainer = new Container()
    val snowImg = Sprite.from("img/snowflake.png")
    val snowflakes = createSnows(50, snowImg)
    for snowflake <- snowflakes do
      //console.log(snowflake)
      snowContainer.addChild(snowflake)
    app.stage.addChild(snowContainer)
    val starContainer = new Container()
    //val tickerFun: js.Function[Double] = tickerF
    app.ticker.add((delta:Double)=>{
      step += 1
      step %= 1000000000
      if step % 5 == 0 then moveFlakes(snowflakes)
    })
    ""

