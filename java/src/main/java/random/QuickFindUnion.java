package random;

public class QuickFindUnion {
    private int[] id;

    public QuickFindUnion(int N){
        id = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    private int root(int i){
        while(i != id[i]){
            i = id[i];
        }
        return i;
    }

    public boolean connected(int a, int b){
        return root(a) == root(b);
    }

    public void union(int a, int b){
        int i = root(a);
        int j = root(b);
        id[i] = j;
    }
}
