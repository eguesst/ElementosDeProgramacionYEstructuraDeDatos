/**
 * 5.- Diseña una clase Secuencia que represente una secuencia de números enteros positivos.   
*/
public class Ejer5_12_Secuencia{
    //5
    private int numero;
    public Ejer5_12_Secuencia(int n){
        numero = n;
    }
    //6
    public int sumar_elementos(){
        int aux = numero;
        return suma(aux);
    }
    private int suma(int num){
        int res = 0;
        if(num/10==0){
            res = num;
        }else{
            res = num%10 + suma(num/10);
        }
        return res;
    }
    //7
    public int minimo(){
        int aux = numero;
        return minimo(aux);
    }
    private int minimo(int num){
        int minimo = (int)(Math.pow(2,31)-1);
        if(num/10==0){
            minimo = num; 
        }else{       
            minimo = (num%10<minimo(num/10))?num%10:minimo(num/10);
        }
        return minimo;
    }
    //8
    public boolean buscar(int x){
        int num = numero;
        return buscar(x,num,false);
    }
    private boolean buscar(int x,int num,boolean encontrado){
        if(!encontrado){
            if(num/10==0){
                encontrado = (num==x)?true:false;
            }else{
                encontrado = (num%10==x)?true:buscar(x,num/10,encontrado);
            }
        }
        return encontrado;
    }
    //9 ordenar
    public int[] ordenar(){
        int numDigitos = ((int)(Math.log10(numero)))+1;
        int num = numero;
        int res[] = getCadena(num,0,new int[numDigitos]);
        for(int j:res){
            System.out.print(j);
        }
        System.out.println();
        for1(0,numDigitos,res);
        for(int j:res){
            System.out.print(j);
        }
        System.out.println();
        return res;
    }
    private int[] getCadena(int n,int i,int cad[]){
        if(n/10==0){
            cad[i] = n;
        }else{
            cad[i] = n%10;
            getCadena(n/10,i+1,cad);
        }
        return cad;
    }
    private void for1(int ini,int fin,int cad[]){
        if(ini<fin){
            for2(ini+1,fin,ini,cad);
            for1(ini+1,fin,cad);
        }
    }
    private void for2(int ini,int fin,int i,int cad[]){
        if(ini<fin){
            if(cad[i]>cad[ini]){
                int aux = cad[ini];
                cad[ini] = cad[i];
                cad[i] = aux;
            }
            for2(ini+1,fin,i,cad);
        }
    }
    //10
    public int multiplicar(int num,Functor f){
        return f.multi(numero,num);
    }
    //11
    public int sumaConOtraSecuencia(Ejer5_12_Secuencia sec){
        return sumar(numero,sec.numero,0,0);
    }
    private int sumar(int n1,int n2,int acarreo,int i){
        int suma = 0;
        if(n1==0||n2==0){
            if(n1==0){
                if(acarreo!=0)
                    n2+=1;
                suma = n2*(int)Math.pow(10,((int)(Math.log10(n2)))+1);
            }else{
                if(acarreo!=0)
                    n1+=1;
                suma = n1*(int)Math.pow(10,((int)(Math.log10(n1)))+1);
            }
        }else{
            int auxSum = n1%10+n2%10+acarreo; 
            if(auxSum>9){
                suma = auxSum%10;
                acarreo = auxSum/10;
            }else{
                suma = auxSum;
                acarreo = 0;
            }
            suma = suma*(int)Math.pow(10,i) + sumar(n1/10,n2/10,acarreo,i+1);
        }  
        return suma;
    }
    //12 v1*v2 / (v1&&v2) -> Rn 
    public int productoEscalar(Ejer5_12_Secuencia sec){
        return pe(numero,sec.numero);
    }
    private int pe(int n1,int n2){
        int suma = 0;
        if(n1/10==0){
            suma = n1*n2;
        }else{
            suma = (n1%10*n2%10) + pe(n1/10,n2/10);
        }
        return suma;
    }
}
