public class Functor
{
    public int multi(int a,int b){
        int res = 0;
        if(b>0){
            res = a + multi(a,b-1);
        }
        return res;
    }
}
