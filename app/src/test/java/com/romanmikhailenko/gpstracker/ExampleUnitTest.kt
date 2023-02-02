package com.romanmikhailenko.gpstracker

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val a = 10
        val b = -10

        assert(Integer.valueOf(a) === Integer.valueOf(a))
        assert(Integer.valueOf(b) !== Integer.valueOf(b))
    }
}