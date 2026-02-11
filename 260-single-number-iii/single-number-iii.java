class Solution {
    public int[] singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        int []ans=new int[2];
        int idx=0;
        for(int i=0;i<nums.length;i++){

            if(mp.containsKey(nums[i])){
                int frq=mp.get(nums[i]);
                mp.put(nums[i],frq+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }

        for(int ele:mp.keySet()){
            if(mp.get(ele)==1){
                ans[idx++]=ele;
            }
        }
        return ans;
    }
}