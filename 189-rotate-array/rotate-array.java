class Solution {
    public void rotate(int[] nums, int k) {

       //First way
       
       int n=nums.length;
       k=k%n;
       ArrayList<Integer> ans=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
            if(i>=n-k){
                ans.add(nums[i]);
            }
       }

       for(int i=0;i<n-k;i++){
        ans.add(nums[i]);
       }

       for(int i=0;i<ans.size();i++){
        nums[i]=ans.get(i);
       } 

       
    }
}