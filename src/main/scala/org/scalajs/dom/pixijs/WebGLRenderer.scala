package org.scalajs.dom.pixijs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

//TODO: DELETE
/**
  * The WebGLRenderer draws the scene and all its content onto a webGL enabled canvas. This renderer should be used
  * for browsers that support webGL. This Render works by automatically managing webGLBatchs. So no need for Sprite
  * Batches or Sprite Clouds. Don't forget to add the view to your DOM or you will not see anything :)
  * @param width   the width of the canvas view
  * @param height  the height of the canvas view
  * @param options The optional renderer parameters
  */
@js.native
@JSGlobal("WebGLRenderer")
class WebGLRenderer(width: Double = js.native,
                    height: Double = js.native,
                    options: WebGLRendererOptions  = js.native)
    extends AbstractRenderer
