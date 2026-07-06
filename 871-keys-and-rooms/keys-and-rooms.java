class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n= rooms.size();
        boolean[] visited = new boolean[n];

        dfs(0, rooms,visited);
        for(int i=0; i<n; i++){
            if(!visited[i]) return false;
        }
        return true;
    }
    private static void dfs(int node, List<List<Integer>> rooms, boolean[] visited ){
        visited[node] = true;
        for(int i: rooms.get(node)){
            if(!visited[i]){
                dfs(i, rooms, visited);
            }
        }
    }
}