//pattern1=010101
//pattern2=101010
//sliding windows
class Solution {
    public int minFlips(String s) {
        int n=s.length();
        String t = s+s;

        int diff1=0;
        int diff2=0;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<2*n;i++){
            //add currebt char
            char p1 = (i%2==0)?'0':'1';
            char p2 = (i%2==0)?'1':'0';
             
             if(t.charAt(i)!=p1)diff1++;
             if(t.charAt(i)!=p2)diff2++;

            if(i>=n){
                //remove old char
                char prev1=((i-n)%2==0)?'0':'1';
                char prev2=((i-n)%2==0)?'1':'0';

                if(t.charAt(i-n)!=prev1)diff1--;
                if(t.charAt(i-n)!=prev2)diff2--;

            }
            if(i>=n-1){
                //update ans
                ans=Math.min(ans,Math.min(diff1,diff2));
            }
        } 
        return ans;
        
    }
}
