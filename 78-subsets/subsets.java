class Solution {
    List<List<Integer>> arr=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {  
        List<Integer> ans=new ArrayList<>();
        helper(nums,ans,0);
        return arr;
    }

    public void helper(int []nums,List<Integer> ans,int i){
        
        if(i==nums.length){
            arr.add(new ArrayList<>(ans));
            return ;
        }
        
        
        ans.add(nums[i]);
        helper(nums,ans,i+1);//take
        ans.remove(ans.size()-1);
        helper(nums,ans,i+1);//not take
    }
}