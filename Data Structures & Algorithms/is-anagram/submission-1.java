class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> countChar = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            countChar.put(c,countChar.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);

            if(!countChar.containsKey(c) || countChar.get(c) == 0)
                return false;
        
        countChar.put(c,countChar.get(c)-1);
        }
        return true;
    }
}
