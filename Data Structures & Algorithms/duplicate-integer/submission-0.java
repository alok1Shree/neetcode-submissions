class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> sameNum = new HashSet<>();
        for(int n:nums){
            if(!sameNum.add(n)){
                return true;
            }
        }
        return false;
    }
}