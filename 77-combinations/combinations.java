class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lst = new ArrayList<>();
        backtrack(1,n,k,new ArrayList<>(),lst);
        return lst;
    }

    public void backtrack(int start,int n, int k, List<Integer> temp, List<List<Integer>> lst){
        if(temp.size() == k){
            lst.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i <= n; i++){
            temp.add(i);
            backtrack(i + 1,n,k,temp,lst);
            temp.remove(temp.size() -1);
        }
    }   
}