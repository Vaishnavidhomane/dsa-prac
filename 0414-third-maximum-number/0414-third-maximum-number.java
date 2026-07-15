class Solution {
    public int thirdMax(int[] nums) {
       Long first=null;
       Long second=null;
       Long third =null;

       for(int num : nums){
        if((first!=null && num==first ) ||(second!=null && num==second)  || (third!=null && third==null)   )  {
            continue;

        }    
        if(first==null || first<num){
            third=second;
            second=first;
            first=(long)num;



        }
        else if(second==null ||  second<num){
            third=second;
            second=(long)num;

        }
        else if(third==null || third<num){
            third=(long)num;
        }
       }
        if(third==null){
            return first.intValue();
        }
        else{
            return third.intValue();
        }
    }
}
