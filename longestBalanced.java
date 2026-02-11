class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        int maxl=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> sete=new HashSet<>();
            HashSet<Integer> seto=new HashSet<>();
            for (int j=i;j<n;j++){
                int c=nums[j];
                if(c%2==0){
                    sete.add(c);
                }
                else{
                    seto.add(c);
                }
                if(sete.size()==seto.size()){
                    maxl=Math.max(maxl,j-i+1);
                }
            }
        }
        return maxl;
    }

}


//perfect solution
class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        int maxval=0,maxl=0;
        for(int i:nums){
            if(i>maxval){
                maxval=i;
            }
        }
        boolean[] seen=new boolean[maxval+1];
        for(int i=0;i<n;i++){
            int dise=0;
            int diso=0;
            for (int j=i;j<n;j++){
                int c=nums[j];
                if(!seen[c]){
                    seen[c]=true;
                    if(c%2==0){
                        dise++;
                    }
                    else{
                        diso++;
                    }
                }               
                if(dise==diso){
                    maxl=Math.max(maxl,j-i+1);
                }
            }
            for(int j=i;j<n;j++){
                seen[nums[j]]=false;
            }
        }
        return maxl;
    }
}
