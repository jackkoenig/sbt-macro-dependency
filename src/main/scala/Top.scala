
import scala.language.experimental.macros
import mymacros.MyMacro

object Top extends App {
  def func(value: Int): Unit = macro MyMacro.func
  def do_func(value: Int): Unit = println(s"do_func($value)")

  func(3)
}
