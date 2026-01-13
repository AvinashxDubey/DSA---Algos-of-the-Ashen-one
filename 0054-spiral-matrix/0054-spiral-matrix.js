/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    let ans = [];
    let l = 0, r = matrix[0].length-1, t = 0, b = matrix.length-1;
    while(l<=r && t<=b){
        for(let i = l; i<=r; i++){
            ans.push(matrix[t][i]);
        }
        t++;
        for(let i = t; i<=b; i++){
            ans.push(matrix[i][r]);
        }
        r--;

        if(t<=b){
            for(let i = r; i>=l; i--){
                ans.push(matrix[b][i]);
            }
        }
        b--;

        if(l<=r){
            for(let i = b; i>=t; i--){
                ans.push(matrix[i][l]);
            }
        }
        l++;
    }
    return ans;
};