/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x<0) return false;
    let num = x;
    let sum = 0;
    while(num>0){
        let rem = num % 10;
        sum = sum*10 + rem;
        console.log(sum);
        num = Math.floor(num/10);
    }
    return sum===x;
};