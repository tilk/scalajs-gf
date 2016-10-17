package org.tilk.gf

import scala.scalajs.js

@js.native
class Fun extends js.Object {
  def this(name : String, args : Fun*) = this()
  val name : String = js.native
  val args : js.Array[Fun] = js.native
  def show(prec : Int) : String = js.native
  def print() : String = js.native
  def getArg(i : Int) : Fun = js.native
  def isMeta() : Boolean = js.native
  def isComplete() : Boolean = js.native
  def isLiteral() : Boolean = js.native
  def isString() : Boolean = js.native
  def isInt() : Boolean = js.native
  def isFloat() : Boolean = js.native
  def isEqual(obj : Fun) : Boolean = js.native
}