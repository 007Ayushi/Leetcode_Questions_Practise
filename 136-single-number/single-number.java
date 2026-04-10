class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){

            int ele=nums[i];
            if(mp.containsKey(ele)){
                int frq=mp.get(ele);
                mp.put(ele,frq+1);
            }
            else{
                mp.put(ele,1);
            }
        }

        for(int ele:mp.keySet()){
            if(mp.get(ele)==1){
                return ele;
            }
        }

        return -1;
    }
}