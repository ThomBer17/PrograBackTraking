import java.util.ArrayList;

public class App { 

    public static void main(String[] args){
        int[] numeros = {2,3,5};
        ArrayList<Integer> combinacion_actual = new ArrayList<>();
        combinacion(numeros, 0, combinacion_actual, 0);
        
    }

    private static void combinacion(int[] n, int i, ArrayList<Integer> combinacion_actual, int suma){
        if(n.length==i){
            suma = 0;
            for(int c : combinacion_actual){
                suma += c;
            }
            if (suma == 5){
                for(int c : combinacion_actual)
            System.out.println(c + " ");
            System.out.println(" ");
            }
            return; 
        }
        combinacion_actual.add(n[i]);
        combinacion(n, i+1, combinacion_actual, suma);
        //Truco Back
        combinacion_actual.remove(combinacion_actual.size()-1);
        combinacion(n, i+1, combinacion_actual, suma);
    }   

    
}
     
