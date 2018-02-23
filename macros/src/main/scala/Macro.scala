
package mymacros

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

class MyMacro(val c: Context) {
  import c.universe._
  def func(value: c.Tree): c.Tree = {
    q"${c.prefix.tree}.do_func($value)"
  }
}
//object MyMacro
