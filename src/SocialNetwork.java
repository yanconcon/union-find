/**
 * Created by 严文聪 on 2017/12/4 0004.
 */
public class SocialNetwork {
    private int[] personid;
    private int[] friendNum;
    public SocialNetwork(int x){
        personid = new int[x];
        friendNum = new int[x];
        for (int i = 0; i < x; i++){
            personid[i] = i;
            friendNum[i] = 1;
        }
    }

    private int baseFriend(int x) {
        while (x != personid[x]){
            x = personid[personid[personid[x]]];

        }
        return x;
    }
    public void makefriend(int p, int q) {
        int personP = baseFriend(p);
        int personQ = baseFriend(q);
        //is the same root,return;
        if (personP == personQ) return;
        //compare the weighted
        if (friendNum[personP] > friendNum[personQ]){
            personid[personQ] = personP;
            friendNum[personP] +=friendNum[personQ];
        }else {
            personid[personP] = personQ;
            friendNum[personQ] +=friendNum[personP];
        }
    }
    public boolean isFriend(int p, int q) {
        return baseFriend(p) == baseFriend(q);
    }

}
