class Solution {
    public static void RecursiveUtility(String str,int open,int close,int n,List<String> result){
        if(open == n && close == n){
            result.add(str);
        }
        if(open < n){
            RecursiveUtility(str + "(" , open + 1, close, n, result);
        }
        if(close < open){
            RecursiveUtility(str + ")" , open, close + 1, n, result);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        RecursiveUtility("" , 0, 0, n, result);
        return result;
    }
}




