package com.anthos.rick_and_morty.factory

import java.util.Random
import java.util.UUID
import java.util.concurrent.ThreadLocalRandom

object RandomFactory {
    fun generateEmptyString(): String = ""
    fun generateString(): String = UUID.randomUUID().toString()
    fun generateInt(): Int = ThreadLocalRandom.current().nextInt(0, 1000 + 1)
    fun generateDouble(): Double = Math.random()
    fun generateFloat(): Float = Math.random().toFloat()
    fun generateBoolean(): Boolean = Math.random() < 0.5
    fun generateLong(): Long = Random().nextLong()
    fun generateMapOfStringString(count: Int = 2) =
        (1..count).associate { Pair(generateString(), generateString()) }

    fun generateMapOfIntString(count: Int = 2) =
        (1..count).associate { Pair(generateInt(), generateString()) }
}