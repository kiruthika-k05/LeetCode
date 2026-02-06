class Solution {
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();
        for(char cur : s.toCharArray()){
            if(cur == '(' || cur == '[' || cur == '{'){
                str.push(cur);
            }
            else{
                if(str.isEmpty()){
                    return false;
                }
                char c = str.pop();
                if((cur == ')' && c != '(') || (cur == '}' && c != '{') || (cur == ']' && c != '[')){
                    return false;
                }
            }
        }
        return str.isEmpty();   
    }
}