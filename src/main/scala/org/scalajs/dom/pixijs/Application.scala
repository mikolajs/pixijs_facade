package org.scalajs.dom.pixijs


import scala.scalajs.js
import org.scalajs.dom.{console, html}

import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("PIXI.Application")
class Application(options: js.Object = js.native) extends js.Object {
   var view: html.Canvas = js.native
   var stage: Container = js.native
   var ticker: Ticker = js.native
}
