/**
Encuentra un metodo que permita definir la potencia de un número. Los datos son a y b y lo que se desea
es calcular a elevado a la b.
*/
public class Ejer1_Potencia{
    // a^b = a*a*a*a*...*a
    public int potencia(int a,int b){
        int res = a;
        if(b==0){
            res = 1;
        }else{
            res = a * potencia(a,b-1); 
        }
        return res;
    }
}
