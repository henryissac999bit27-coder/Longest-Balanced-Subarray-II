# LeetCode 3721: Longest Balanced Subarray II

## Problem Description
You are given an integer array `nums`. A subarray is called **balanced** if the number of **distinct** even numbers in the subarray is equal to the number of **distinct** odd numbers.

Return the length of the longest balanced subarray.

### Examples
- **Input:** `nums = [2,5,4,3]` | **Output:** `4`
- **Input:** `nums = [3,2,2,5,4]` | **Output:** `5`
- **Input:** `nums = [1,2,3,2]` | **Output:** `3`

## Constraints
- `1 <= nums.length <= 10^5`
- `1 <= nums[i] <= 10^5`

## Complexity Analysis
- **Time Complexity:** $O(N \log N)$ using a Lazy Segment Tree to track the difference between distinct odd/even counts.
- **Space Complexity:** $O(N)$ for storing element positions and segment tree nodes.
