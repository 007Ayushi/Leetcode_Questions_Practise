class Solution {
    public int maxProfit(int[] prices) {

    int maxProfit=  Integer.MIN_VALUE;
    int minBuy =Integer.MAX_VALUE;
    //  int n=prices.length;
    //  for(int i=0;i<prices.length;i++){
    //     minBuy=Math.min(prices[i],minBuy);
    //     for(int j=i;j<n;j++){
    //         maxProfit=Math.max(maxProfit,prices[j]-minBuy);
    //     }
    //  }
    //  return maxProfit;

    for(int i=0;i<prices.length;i++){
        minBuy=Math.min(minBuy,prices[i]);
        maxProfit=Math.max(maxProfit,prices[i]-minBuy);
    }
    return maxProfit;
    }

}