/**
 Escribe un proceso recursivo que permita decidir si un número
 natural n es primo o no.  
*/
public class Ejer2_Primo{
    //primos numeros mayores a 2
    public boolean primo(int n){
        if(n>=2)
            return primo(2,n-1,n,true);
        else
            return false;
    }
    private boolean primo(int ini,int fin,int n,boolean esPrimo){
        if(ini<=fin && esPrimo){
            if(n%ini==0){
                esPrimo = false;
            }
            esPrimo = esPrimo && primo(ini+1,fin,n,esPrimo);
        }
        return esPrimo;
    }
}
