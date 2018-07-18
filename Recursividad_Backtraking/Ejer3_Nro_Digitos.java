/**
 * Escribe un proceso recursivo que permita calcular la 
 * cantidad de d´ıgitos que tiene un número positivo n
 */
public class Ejer3_Nro_Digitos{
    public int digitos(int n){
        int res = 0;
        if(n/10==0){
            res = 1;
        }else{
            res = 1 + digitos(n/10);
        }
        return res;
    }
}
