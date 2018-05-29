package com.allaboutscala.chapter.two.tutorial_11

object class_and_type extends App {
	println("Step 1: Declare a variable of type Any")
	val favoriteDonut: Any = "Glazed Donut"
	println(s"favoriteDonut of type Any = $favoriteDonut")

	println("\nStep 2: Declare a variable of type AnyRef")
	val donutName: AnyRef = "Glazed Donut"
	println(s"donutName of type AnyRef = $donutName")
}
