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