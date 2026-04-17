// class Solution {
//     public boolean canReorderDoubled(int[] arr) {
        
//         ArrayList<Integer> nums=new ArrayList<>();
//         for(int ele:arr){
//             nums.add(ele);
//         }
      
//         Collections.sort(nums,(a,b)->Math.abs(a)-Math.abs(b));
//         for(int ele:nums){
//             System.out.print(ele+" ");
//         }

//         HashMap<Integer,Integer> mp=new HashMap<>();
//         for(int i=0;i<nums.size();i++){
            
//             int ele=nums.get(i);
//             if(mp.containsKey(ele)){
//                 int frq=mp.get(ele);
//                 mp.put(ele,frq+1);
//             }
//             else{
//                 mp.put(ele,1);
//             }
//         }

//         int size=mp.size();
//         int len=0;
//         for(int ele:mp.keySet()){
//             if(mp.containsKey(ele*2)){
//                 int cnt=mp.get(ele);
//                 mp.put(ele,cnt-1);
//             }
//             else{
//                 return false;
//             }
//             len++;
//             if(len==size/2)break;
//         }
//         return true;
//     }
// }
class Solution {
    public boolean canReorderDoubled(int[] arr) {
        
        ArrayList<Integer> nums = new ArrayList<>();
        for(int ele : arr){
            nums.add(ele);
        }

        // Sort by absolute value
        Collections.sort(nums, (a, b) -> Math.abs(a) - Math.abs(b));

        // Frequency map
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int ele : nums){
            mp.put(ele, mp.getOrDefault(ele, 0) + 1);
        }

        // Main logic
        for(int ele : nums){
            
            if(mp.get(ele) == 0) continue; // already used
            
            if(!mp.containsKey(ele * 2) || mp.get(ele * 2) == 0){
                return false;
            }

            // decrease both
            mp.put(ele, mp.get(ele) - 1);
            mp.put(ele * 2, mp.get(ele * 2) - 1);
        }

        return true;
    }
}