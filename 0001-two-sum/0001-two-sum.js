/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const map = new Map();
    for(const [idx, val] of nums.entries()){
        const complement = target-val;
        if(map.has(complement)){
            return [idx, map.get(complement)];
        }
        map.set(val, idx);
    }
    return [];
};