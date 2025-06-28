// Problem: Return Length Of Arguments Passed
// Link: https://leetcode.com/problems/return-length-of-arguments-passed/
// Date: 2025-06-28
// Approach: Using return.length 
/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    return args.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */