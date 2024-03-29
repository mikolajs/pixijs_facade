package org.scalajs.dom.pixijs

import org.scalajs.dom.HTMLCanvasElement
import scala.scalajs.js

/**
  * Auto-Detect Renderer Options
  * @param view                  the canvas to use as a view, optional
  * @param transparent           If the render view is transparent, default false
  * @param antialias             sets antialias (only applicable in chrome at the moment)
  * @param preserveDrawingBuffer enables drawing buffer preservation, enable this if you need to call toDataUrl
  *                              on the webgl context
  * @param resolution            the resolution of the renderer, retina would be 2
  * @author lawrence.daniels@gmail.com
  */

class AutoDetectRendererOptions(var view: js.UndefOr[HTMLCanvasElement] = js.undefined,
                                var transparent: js.UndefOr[Boolean] = js.undefined,
                                var antialias: js.UndefOr[Boolean] = js.undefined,
                                var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
                                var resolution: js.UndefOr[Resolution] = js.undefined)
    extends js.Object
