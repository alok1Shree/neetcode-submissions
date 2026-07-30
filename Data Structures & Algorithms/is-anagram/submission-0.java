class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        if(ss.length != tt.length){
            return false;
        }
        return Arrays.equals(ss,tt);
    }
}
