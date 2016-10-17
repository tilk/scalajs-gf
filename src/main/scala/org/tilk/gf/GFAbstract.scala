package org.tilk.gf

import scala.scalajs.js

@js.native
class GFAbstract extends js.Object {
  def this(startcat : String, types : js.Dictionary[Type]) = this()
  val startcat : String = js.native
  val types : js.Dictionary[Type] = js.native
  def getArgs(fun : String) : js.Array[Type] = js.native
  def getCat(fun : String) : String = js.native
  def annotate(tree : Fun, tp : Type) : Fun = js.native
  def handleLiterals(tree : Fun, tp : Type) : Fun = js.native
  def parseTree(str : String, tp : Type) : Fun = js.native
}