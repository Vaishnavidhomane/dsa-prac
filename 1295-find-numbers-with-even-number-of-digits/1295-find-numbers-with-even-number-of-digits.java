class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        
        
for(int num:nums){
int max=0;

        while( num!=0){
             num=num/10;
    max++;


        }
        if(max%2==0){
            count++;
        }

}
return count;
    }
}