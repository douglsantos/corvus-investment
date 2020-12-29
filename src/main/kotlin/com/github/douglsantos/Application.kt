package com.github.douglsantos

import io.micronaut.runtime.Micronaut.build

fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.github.douglsantos")
		.start()
}

