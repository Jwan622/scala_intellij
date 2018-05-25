package com.allaboutscala.chapter.two.tutorial_2

object tutorial_2 extends App {
	println("Step 1: How to escape a Json String")
	//	would not work because of the double quotes:
	//	val donutJson: String ="{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"

	println("\nStep 2: Using backslash to escape quotes")
	val donutJson2: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
	println(s"donutJson2 = $donutJson2")

	println("\nStep 3: Using triple quotes \"\"\" to escape characters")
	val donutJson3: String =
		"""
			|{
			|"donut_name":"Glazed Donut",
			|"taste_level":"Very Tasty",
			|"price":2.50
			|}
			|""".stripMargin
	println(s"donutJson3 = $donutJson3")
}
