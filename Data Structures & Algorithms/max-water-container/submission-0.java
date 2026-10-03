class Solution {
    public int maxArea(int[] heights) {
        int low =0;
        int high = heights.length-1;
        int maxarea=0;
        while(low < high){
            int width= high-low;
            int hei = Math.min(heights[low],heights[high]);
            int area = width * hei;
            maxarea = Math.max(area, maxarea);
        if(heights[low] < heights[high]){
            low++;
        }else{
            high--;
        }
        }
        return maxarea;
    }
}
