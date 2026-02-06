class Solution {
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(!str.isEmpty()){
                char last = str.peek();
                if(isPair(last,cur)){
                    str.pop();
                    continue;
                }
            }
            str.push(cur);
        }
        return str.isEmpty();
    }
    private boolean isPair(char last, char cur) {
        return (last == '(' && cur == ')') ||
               (last == '{' && cur == '}') ||
               (last == '[' && cur == ']');
    }
}