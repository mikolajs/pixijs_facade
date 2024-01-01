package org.scalajs.dom.pixijs

import scala.scalajs.js
import org.scalajs.dom.{HTMLCanvasElement, console}

import scala.scalajs.js.annotation.JSName

/**
 * Application Renderer Options
 *
 * @param view                  the canvas to use as a view, optional
 * @param antialias             sets antialias. If not available natively then FXAA antialiasing is used
 * @param resolution            the resolution of the renderer retina would be 2
 * @author  
 */
object ApplicationOptions extends js.Object:
 @JSName("apply")
 def apply(view: js.UndefOr[HTMLCanvasElement] = js.undefined,
            width: js.UndefOr[Double] = js.undefined,
            height: js.UndefOr[Double] = js.undefined,
            autoStart: js.UndefOr[Boolean] = js.undefined,
            forceCanvas: js.UndefOr[Boolean] = js.undefined,
            antialiasing: js.UndefOr[Boolean] = js.undefined,
            useContextAlpha: js.UndefOr[Boolean] = js.undefined,
            autoDensity: js.UndefOr[Boolean] = js.undefined,
            preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
            resolution: js.UndefOr[Resolution] = js.undefined,
            backgroundColor: js.UndefOr[Double] = js.undefined,
            backgroundAlpha: js.UndefOr[Double] = js.undefined,
            clearBeforeRender: js.UndefOr[Boolean] = js.undefined,
            powerPreference: js.UndefOr[String] = js.undefined,
            sharedTicker: js.UndefOr[Boolean] = js.undefined,
            sharedLoader: js.UndefOr[Boolean] = js.undefined,
            resizeTo: js.UndefOr[HTMLCanvasElement] = js.undefined) =
    val amap = Seq("view" -> view , "width" -> width, "height" -> height, "autoStart" -> autoStart,
      "forceCanvas" -> forceCanvas, "antialiasing" -> antialiasing, "useContextAlpha" -> useContextAlpha,
      "autoDensity" -> autoDensity, "preserveDrawingBuffer" -> preserveDrawingBuffer,
      "resolution" -> resolution, "backgroundColor" ->  backgroundColor, "backgroundAlpha" -> backgroundAlpha,
      "clearBeforeRender" -> clearBeforeRender, "powerPreference" -> powerPreference,
      "sharedTicker" -> sharedTicker, "sharedLoader" -> sharedLoader, "resizeTo" ->resizeTo)
      .filter(t => t._2 != js.undefined).map(t => t._1 -> t._2.get.asInstanceOf[js.Any])

    js.Dynamic.literal(amap:_*)