package org.scalajs.dom.pixijs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("PIXI.Sprite")
object Sprite extends js.Object:
  def from(url:String):Sprite = js.native
  def from(texture:Texture):Sprite = js.native
@js.native
@JSGlobal("PIXI.Sprite")
class Sprite extends Container:
  def texture:Texture = js.native
  