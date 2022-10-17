// solution 1 using map

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        if(sentence.length() < 26)
            return false;
        
        HashMap<Character , Integer> map = new HashMap<Character , Integer>();
        map.put( 'a' , 0 );
        map.put( 'b' , 0 );
        map.put( 'c' , 0 );
        map.put( 'd' , 0 );
        map.put( 'e' , 0 );
        map.put( 'f' , 0 );
        map.put( 'g' , 0 );
        map.put( 'h' , 0 );
        map.put( 'i' , 0 );
        map.put( 'j' , 0 );
        map.put( 'k' , 0 );
        map.put( 'l' , 0 );
        map.put( 'm' , 0 );
        map.put( 'n' , 0 );
        map.put( 'o' , 0 );
        map.put( 'p' , 0 );
        map.put( 'q' , 0 );
        map.put( 'r' , 0 );
        map.put( 's' , 0 );
        map.put( 't' , 0 );
        map.put( 'u' , 0 );
        map.put( 'v' , 0 );
        map.put( 'w' , 0 );
        map.put( 'x' , 0 );
        map.put( 'y' , 0 );
        map.put( 'z' , 0 );
        
        for(char c : sentence.toCharArray()){
            map.put(c , map.get(c) + 1);
        }
        
        for(char c : map.keySet()){
            
            if(map.get(c) == 0)
                return false;
            
        }
        
        return true;
    }
}

// solution 2 using String.indexOf()

class Solution {
    public boolean checkIfPangram(String sentence) {
        // We iterate over 'sentence' for 26 times, one for each letter 'currChar'.
        for (int i = 0; i < 26; ++i) {
            char currChar = (char)('a' + i);

            // If 'sentence' doesn't contain currChar, it is not a pangram.
            if (sentence.indexOf(currChar) == -1)
                return false;
        }
        
        // If we manage to find all 26 letters, it is a pangram.
        return true;
    }
}

// solution 3 using set

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        if(sentence.length() < 26)
            return false;
        
        Set<Character> seen = new HashSet<Character>();
        
        for(char c : sentence.toCharArray()){
            seen.add(c);
        }
        
        return seen.size() == 26;
    }
}