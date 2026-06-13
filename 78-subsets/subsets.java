class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> arr=new ArrayList<>();
        helper(arr,nums,0);
        return ans;
        
    }
    public void helper( List<Integer> arr,int []nums,int i){

        if(i==nums.length){
            ans.add(new ArrayList<>(arr));
            return ;
        }

        helper(arr,nums,i+1);//add
        arr.add(nums[i]);
        helper(arr,nums,i+1);//skip
        arr.remove(arr.size()-1);
    }
}