class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length;

         //Method 1- Brute force - TC= O(N^2) and SC=O(1)
        // int cnt=0;
        // for(int i=0;i<nums.length;i++){

        //         cnt=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             cnt++;
        //         }
        //     }
        //     if(cnt>nums.length/2){
        //         return nums[i];
        //     }
        // }
        // return -1;


        // Method 2 - HashMap tc=O(N) and sc=O(N)
        // HashMap<Integer,Integer> mp=new HashMap<>();
        // for(int i=0;i<nums.length;i++){

        //     int ele=nums[i];
        //     if(mp.containsKey(ele)){
        //         int frq=mp.get(ele);
        //         mp.put(ele,frq+1);
        //     }
        //     else{
        //         mp.put(ele,1);
        //     }
        // }

        // for(int ele:mp.keySet()){
        //     if(mp.get(ele)>n/2){
        //         return ele;
        //     }
        // }

        // return -1;
        
       

        //Method-3-Boyer–Moore Voting Algorithm
       // Same = +1, Different = −1, Zero = Reset
       //TC=O(N) AND SC=O(1)
        int ele=0;
        int cnt=0;
       for(int i=0;i<n;i++){

        if(cnt==0){
            cnt=1;
            ele=nums[i];
        }
        else if(nums[i]==ele){
            cnt++;
        }
        else{
            cnt--;
        }
       }

     int cnt1=0;
    
    //verifying the majority element
     for(int i=0;i<nums.length;i++){
        if(nums[i]==ele){
            cnt1++;
        }
     }
       if(cnt1>n/2) return ele;
       return -1;
       
    }
}