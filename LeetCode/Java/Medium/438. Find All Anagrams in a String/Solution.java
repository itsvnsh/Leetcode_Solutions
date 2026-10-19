import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        Hashtable<Character, Integer> map1 = new Hashtable<>();
        Hashtable<Character, Integer> map2 = new Hashtable<>();
        int l = 0;
        if(s.length()<p.length())
        {
            return List.of(); 
        }
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
            if (i - l + 1 > p.length()) {
                char remove = s.charAt(l);
                map2.put(remove, map2.get(remove) - 1);
                if (map2.get(remove) == 0) {
                    map2.remove(remove);
                }
                l++;
            }

            if(map1.equals(map2)){
                result.add(i-(p.length()-1));

            }
        }
        return result;

    }
}

