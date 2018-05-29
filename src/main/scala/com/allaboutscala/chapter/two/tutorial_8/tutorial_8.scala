package com.allaboutscala.chapter.two.tutorial_8

object tutorial_8 extends App {
	println("Step 1: Pattern matching 101 - a very basic example")
	val donutType = "Glazed Donut"
	donutType match {
		case "Glazed Donut" => println("Very tasty")
		case "Plain Donut" => println("Tasty")
	}

	println("\nStep 2: Pattern matching and return the result")
	val tasteLevel = donutType match {
		case "Glazed Donut" => "Very tasty"
		case "Plain Donut" => "Tasty"
	}
	println(s"Taste level of $donutType = $tasteLevel")


	println("\nStep 3: Pattern matching using the wildcard operator")
	val tasteLevel2 = "Plain Donut" match {
		case "Glazed Donut" => "Very tasty"
		case "Plain Donut" => "Tasty"
		case _ => "Tasty"
	}
	println(s"Taste level of $donutType = $tasteLevel2")

	println("\nStep 6: Pattern matching by types")
	val priceOfDonut: Any = 2.50
	val priceType = priceOfDonut match {
		case price: Int => "Int"
		case price: Double => "Double"
		case price: Float => "Float"
		case price: String => "String"
		case price: Boolean => "Boolean"
		case price: Char => "Char"
		case price: Long => "Long"
	}
	println(s"Donut price type = $priceType")
}
