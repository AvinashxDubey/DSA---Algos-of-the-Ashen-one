class Solution {
    // prettty cool explanation
    // we can move min(dx, dy) move diagonally
    // then move max(dx, dy) - min(dx, dy) horizonatlly or vertically depending on what we need
    // lets say dx is min then,
    // totalTime = min(dx, dy) + max(dx, dy) - min(dx, dy) = dx + dy - dx = dy, which is the max

    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;
        for(int i=1; i<points.length; i++){
            int x1 = points[i-1][0], y1 = points[i-1][1];
            int x2 = points[i][0], y2 = points[i][1];
            int dx = Math.abs(x1-x2);
            int dy = Math.abs(y1-y2);

            totalTime+=Math.max(dx, dy);
        }

        return totalTime;
    }
}