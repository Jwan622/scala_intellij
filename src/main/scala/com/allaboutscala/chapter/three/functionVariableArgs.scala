package com.allaboutscala.chapter.three

object functionVariableArgs extends App {
	def printReport(names: String*) {
		println(names)
		println(s"""Donut Report = ${names.mkString(", ")}""")
	}

	println("\nStep 2: How to call function which takes variable number of String arguments")
	printReport("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
	printReport("Chocolate Donut")

	println("\nStep 3: How to pass a List to a function with variable number of arguments")
	val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donutsssss")
	printReport(listDonuts: _*)

	println("\nStep 4: How to pass a Sequence to a function with variable number of arguments")
	val seqDonuts: Seq[String] = Seq("Chocolate Donut", "Plain Donutssss")
	printReport(seqDonuts     :_*)
}
