/**
 * Created by Administrator on 2017/12/4 0004.
 */
public class QuickUnionUF {
    private int[] id;
    public QuickUnionUF(int x){
        id = new int[x];
        for (int i = 0; i < x; i ++){
            id[i] = i;
        }
    }
    private int root(int i){
        while (i != id[i]){
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
    public int find(int a ){
        int max = id[a];
        while (a != id[a]){
            if (max < id[a])
                max = id[a];
            a = id[a];
        }
        return max;
    }

}
