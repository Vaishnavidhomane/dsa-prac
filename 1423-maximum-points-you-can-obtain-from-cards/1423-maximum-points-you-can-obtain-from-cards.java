class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0;
        int rightsum=0;
        int n=cardPoints.length;
        for(int i=0;i<k;i++){
            leftsum=leftsum+cardPoints[i];
           
            
        }
        int result=leftsum;
        for(int i=0;i<k;i++){
            leftsum-=cardPoints[k-i-1];
            rightsum+=cardPoints[n-i-1];
            result=Math.max(result,leftsum+rightsum);

        }
        return result;

    }
}