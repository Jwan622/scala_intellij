package com.allaboutscala.chapter.two.tutorial_3

object tutorial_3 extends App {
	println("Step 1: Immutable variable")
	val donutsToBuy1: Int = 5
	val donutsToBuy = 5

	println("\nStep 3: Using Scala compiler to convert from one data type to another")

	// this is okay because an Int is larger than a Short.
	val numberOfDonuts: Short = 1
	val minimumDonutsToBuy: Int = numberOfDonuts
	println("\nStep 4: User driven conversion from one data type to another ")
	// NB: You cannot convert from an Int to a String
//	val minimumDonutsToSell: String = numberOfDonuts
	val minimumDonutsToSell: String = numberOfDonuts.toString()
}
