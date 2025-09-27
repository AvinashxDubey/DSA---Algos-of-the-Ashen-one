class Solution {
    public int findClosest(int x, int y, int z) {
        int distX = Math.abs(x-z);
        int distY = Math.abs(y-z);

        if(distX==distY) return 0;
        else if(distX<distY) return 1;
        return 2;
    }
}