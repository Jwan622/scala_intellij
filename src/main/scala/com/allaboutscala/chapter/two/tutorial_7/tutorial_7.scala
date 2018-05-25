package com.allaboutscala.chapter.two.tutorial_7

object tutorial_7 extends App {
	println("Step 1: How to use while loop in Scala")
	var numberOfDonutsToBake = 10
	while (numberOfDonutsToBake > 0) {
		println(s"Remaining donuts to be baked = $numberOfDonutsToBake")
		numberOfDonutsToBake -= 1
	}
}
