class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set<String> mail = new HashSet<>();
        for(String email : emails){
            StringBuilder sb = new StringBuilder();
            for(char c : email.toCharArray()){
                if(c == '.') continue;
                if(c == '+' || c == '@') break;
                sb.append(c);
            }
            String curr = sb.toString() + email.substring(email.indexOf("@"));
            mail.add(curr);
        }
        return mail.size();
        
    }
}