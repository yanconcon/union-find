/**
 * Created by Administrator on 2017/12/4 0004.
 */
public class QuickFindUF  {
    private int[] id;
    public QuickFindUF(int x){
        id = new int[x];
        for (int i = 0; i < x; i++)
            id[i] = i;
    }

    public void union(int p, int q) {
        int idp = id[p];
        int idq = id[q];
        for (int i = 0; i < id.length; i++){
            if (id[i] == idp){
                id[i] = idq;
            }
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public int find(int q) {
        return 0;
    }
}
