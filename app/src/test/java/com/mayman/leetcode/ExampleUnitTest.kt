package com.mayman.leetcode

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
        val expected: IntArray = intArrayOf(1, 2, 3, 1, 2, 3)
        val actual = getConcatenation(intArrayOf(1,2,3))
        assertEquals(expected.toList(), actual.toList())
    }

    private fun getConcatenationEasy(nums: IntArray): IntArray {
        return nums.plus(nums)
    }

    fun getConcatenation(nums: IntArray): IntArray {
        val res = IntArray(nums.size.times(2))
        nums.forEachIndexed { index, item ->
            res[index] = item
            res[index.plus(nums.size)] = item
        }
        return res
    }
}