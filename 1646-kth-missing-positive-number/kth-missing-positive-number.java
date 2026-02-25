class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        //TC -> O(N) AND SC=O(1)
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }    
            else{
                break;
            }
        }
        return k;
    }
}