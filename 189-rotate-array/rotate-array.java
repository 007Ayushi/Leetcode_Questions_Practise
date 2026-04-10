class Solution {
    public void rotate(int[] nums, int k) {

        //tc= O(n) and sc=O(n)
       //First way
       int n=nums.length;
       k=k%n;
       ArrayList<Integer> ans=new ArrayList<>();
       for(int i=n-k;i<nums.length;i++){
                ans.add(nums[i]);
       }

       for(int i=0;i<n-k;i++){
        ans.add(nums[i]);
       }

       for(int i=0;i<ans.size();i++){
        nums[i]=ans.get(i);
       } 

       
    }
}
// This is a simple approach using extra space (O(n)).
// But we can optimize it to O(1) using the reverse method