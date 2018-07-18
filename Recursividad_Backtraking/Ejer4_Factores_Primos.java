/**
 * Se desea encontrar los factores primos de un numero n.
 */
import java.util.ArrayList;
public class Ejer4_Factores_Primos{
    public ArrayList<Integer> factoresPrimos(int n){
        ArrayList<Integer> res = factoresPrimos(2,n,n,new ArrayList<Integer>());
        System.out.println(res);
        return res;
    }
    private ArrayList<Integer> factoresPrimos(int ini,int fin,int n,ArrayList<Integer> res){
        if(ini<=fin){
            if(primo(ini)&&n%ini==0){
                res.add(ini);
            }
            res = factoresPrimos(ini+1,fin,n,res);
        }
        return res;
    }
    private boolean primo(int n){
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
