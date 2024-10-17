class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int prof = 0;
        int minPrice = prices[0];
        for(int i = 0; i < prices.size(); i++){
            prof = max(prof, prices[i] - minPrice);
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
        }
        return prof;
    }
};