class Solution {
    public int findKthPositive(int[] arr, int k) {

        int mx = Integer.MIN_VALUE;
        ArrayList<Integer> ans1 = new ArrayList<>();

        int[] ans = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            ans[arr[i]]++;
        }

        for (int i = 1; i < ans.length; i++) {
            if (ans[i] == 0) {
                ans1.add(i);
            }
        }

        for (int i = 0; i < ans1.size(); i++) {
            return ans1.get(k-1);
        } 
        return -1;

    }
}