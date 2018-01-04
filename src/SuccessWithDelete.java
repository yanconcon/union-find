/**
 * Created by 严文聪 on 2017/12/4 0004.
 */
public class SuccessWithDelete {
    private int[] s;
    public SuccessWithDelete(int n){
        s = new int[n];
        for (int i = 0; i < n; i++){
            s[i] = i;
        }
    }

    public int[] removeAndGet(int x){
        int[] s1 = new int[s.length-1];
        int y ;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == x){
                continue;
            }
            s1[i] = s[i];
        }
        return s1;
    }
}
