class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length;
        // Method 1 - HashMap tc=O(N) and sc=O(N)
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
            if(mp.get(ele)>n/2){
                return ele;
            }
        }

        return -1;

    }
}