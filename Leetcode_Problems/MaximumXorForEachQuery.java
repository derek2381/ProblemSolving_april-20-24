// problem link
// https://leetcode.com/problems/maximum-xor-for-each-query/description/

class Solution {
public:
    vector<int> getMaximumXor(vector<int>& nums, int maximumBit) {
        vector<int> res;
        int n = nums.size();

        for(int i = 1;i < n;i++){
            nums[i] ^= nums[i-1];
        }

        for(int i = n-1;i >= 0;i--){
            int temp = nums[i], k = (1 << maximumBit) - 1, val = 0;
            val = temp ^ k;

            res.push_back(val);
        }
        return res;
    }
};
