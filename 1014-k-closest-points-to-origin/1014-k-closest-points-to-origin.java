class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (p1, p2) -> Double.compare((Math.pow(p1[0], 2) + Math.pow(p1[1], 2)), (Math.pow(p2[0], 2) + Math.pow(p2[1], 2))));
        int[][] ans = new int[k][2];

        for(int i=0; i<k; i++){
            ans[i] = points[i];
        }

        return ans;
    }
}