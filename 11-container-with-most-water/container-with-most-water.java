class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;

        int res = 0;

        while(start < end){
            int width =end -start;
            int height = Math.min(heights[start], heights[end]);

            res = Math.max(res, (width * height));

            if(heights[start] > heights[end]){
                end--;
            }else{
                start++;
            }
        }
        return res;
    }
}