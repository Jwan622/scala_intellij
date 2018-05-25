package com.allaboutscala.chapter.one.tutorial_07

object HelloWorldWithArgumentsDebug extends App {
	println("hello world with arguments scala application")
	println("command line arguments are: ")
	println(args.mkString(", "))
	val a: String = "1"
	val b = 2
}
