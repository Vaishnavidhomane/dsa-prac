class Solution {
    public int firstocc(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;

            }
            else if(target>nums[mid]){
                low=mid+1;


            }
            else{
                high=mid-1;

            }

        }
        return ans;



    }
    public int lastocc(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;

            }
            else if(target>nums[mid]){
                low=mid+1;


            }
            else{
                high=mid-1;

            }

        }
        return ans;


    }
    public int[] searchRange(int[] nums, int target) {
     int firstidx=firstocc(nums,target);
     if(firstidx==-1){
        return new int[]{
            -1,
            -1
        };
     }
int lastidx=lastocc(nums,target);
return new int[]{
    firstidx,lastidx
};
    }   
    

}