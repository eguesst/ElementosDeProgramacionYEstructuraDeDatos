/*Tres formas de reslover el factorial*/
//Egües
public class Factorial{
    public int factorial(int n){
        int ans=0;
        if(n==0||n==1)
            ans = 1;
        else
            ans = n * factorial(n-1);
        return ans;
    }
    public int factorial2(int n){
        if(n==0||n==1)
            return 1;
        else
            return n * factorial2(n-1);
    }
    public int factorial3(int n){
        return (n==0||n==1)?1:n*factorial(n-1);
    }
}