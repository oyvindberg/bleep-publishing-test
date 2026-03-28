package build.bleep.test

import fansi._

object Greeting {
  def hello(name: String): String =
    Color.Green(s"Hello, $name!").render

  def version: String = "0.0.1"
}
