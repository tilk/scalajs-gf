package org.tilk.gf

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
class GFGrammar extends js.Object {
  def this(abstractGrammar : GFAbstract, concreteGrammars : js.Dictionary[GFConcrete]) = this()
  
  @JSName("abstract")
  val abstractGrammar : GFAbstract = js.native
  
  @JSName("concretes")
  val concreteGrammars : js.Dictionary[GFConcrete] = js.native
  
  def translate(input : String, fromLang : String, toLang : String) : js.Array[String] = js.native
}

