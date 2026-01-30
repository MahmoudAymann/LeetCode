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
        val expected: IntArray = intArrayOf(2,3,5,4,1,7)
        val actual = shuffle(intArrayOf(2,5,1,3,4,7), 3)
        assertEquals(expected.toList(), actual.toList())
    }

    //    Input: nums = [2,5,1,3,4,7], n = 3
//    Output: [2,3,5,4,1,7]
//    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
    fun shuffle(nums: IntArray, n: Int): IntArray {
        var i = 0
        var y = n
        var index = 0
        val result = IntArray(2.times(n))
        while (i < n) {
            result[index] = nums[i]
            index+=1
            result[index] = nums[y]
            index+=1
            i+=1
            y+=1
        }
        return result
    }
}