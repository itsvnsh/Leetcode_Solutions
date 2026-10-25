# 📝 34. Find First and Last Position of Element in Sorted Array (LeetCode)

🔗 [Problem Link](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/?__cf_chl_tk=1P9q7fqOiCrsuTujgXsmFTgARl86Bh0KOC5DEp4UAiY-1791705014-1.0.1.1-ZYGmXks9_d3x36gUpj3vhplDQGc4_SK4bEUp_ddN2i4)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
Array, Binary Search

### 🚀 Performance
- **Runtime:** N/A
- **Memory:** N/A

---

### 📜 Problem Description

Given an array of integers  `nums`  sorted in non-decreasing order, find the starting and ending position of a given  `target`  value.

If  `target`  is not found in the array, return  `[-1, -1]` .

You must write an algorithm with  `O(log n)`  runtime complexity.

**Example 1:**

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

```

**Example 2:**

```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

```

**Example 3:**

```
Input: nums = [], target = 0
Output: [-1,-1]

```

**Constraints:**

	
- `0 <= nums.length <= 105`
	
- `-109 <= nums[i] <= 109`
	
- `nums`  is a non-decreasing array.
	
- `-109 <= target <= 109`