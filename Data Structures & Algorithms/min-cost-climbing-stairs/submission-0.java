class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        int[] minarr=new int[n+1];
        for(int i=2;i<=n;  i++){
            minarr[i]= Math.min(cost[i-1]+minarr[i-1], cost[i-2]+minarr[i-2]);
        }
            return minarr[n];
    }

}
