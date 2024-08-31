package com.learn.leetcode;
/**
 * 
Given an integer n represented as a string, return the smallest good base of n.

We call k >= 2 a good base of n, if all digits of n base k are 1's.

Example 1:

Input: n = "13"
Output: "3"
Explanation: 13 base 3 is 111.
Example 2:

Input: n = "4681"
Output: "8"
Explanation: 4681 base 8 is 11111.
Example 3:

Input: n = "1000000000000000000"
Output: "999999999999999999"
Explanation: 1000000000000000000 base 999999999999999999 is 11.
 

Constraints:

n is an integer in the range [3, 1018].
n does not contain any leading zeros. 
*/

/**
 * Solution: 
 *  set the base is k, the number of 1 is m+1
 *  then k+1 > m-th root of n > k
 *  k^m < n = k^m + k^(m-1) + ... + k + 1 < (k+1)^m => k^(m+1)>n>k^m => k+1 > m-th root of n > k
 *  so m-th root of n is the only candidate
 */
public class _0483_SmallestGoodBase {

    public String smallestGoodBase(String n) {
        return "";
    }


    public static void main(String[] args){
        System.out.println("hello word");
    }
}
