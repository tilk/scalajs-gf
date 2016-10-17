package org.tilk.gf

import scala.scalajs.js

@js.native
class GFConcrete extends js.Object {
  def parseString(string : String, cat : String) : js.Array[Fun] = js.native
  def linearize(tree : Fun) : String = js.native
  def linearizeAll(tree : Fun) : js.Array[String] = js.native
}