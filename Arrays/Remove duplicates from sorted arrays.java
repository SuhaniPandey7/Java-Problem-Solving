class Solution {
    public int removeDuplicates(int[] num) {
        if(num.length==0)return 0;
        int slow=0;
        for(int fast=1;fast<num.length;fast++){
            if(num[fast]!=num[slow]){
                slow++;
                num[slow]=num[fast];
            }
        }
        return slow+1;
    }
}
