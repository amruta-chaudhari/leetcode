/**
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function(n) {
    const result = [];
    backtrack("", 0, 0, n, result);
    return result;
};


function backtrack(s, open, close, max, result) {
    if (s.length === max * 2) {
        result.push(s);
        return;
    }

    if (open < max) 
        backtrack(s + "(", open + 1, close, max, result);
    if (close < open) 
        backtrack(s + ")", open, close + 1, max, result);
}