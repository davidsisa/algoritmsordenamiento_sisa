import java.util.Arrays;
public class MetodosOrdenamiento {
    public int[] burbujaOrdenamiento(int[] array , boolean cambio){
        int[] arregloOrdenado = Arrays.copyOf(array, array.length);
        if (cambio == true){
            for(int i = 0; i < arregloOrdenado.length;i++){
                for(int j =  i + 1; j < arregloOrdenado.length;j++) {
                    if (arregloOrdenado[i] > arregloOrdenado[j]) {
                        int aux = arregloOrdenado[i];
                        arregloOrdenado[i] = arregloOrdenado[j];
                        arregloOrdenado[j] = aux;
                    }
                }   
            }
            return arregloOrdenado;    
        }else {
            for(int i = 0; i < arregloOrdenado.length;i++){
                for(int j =  i + 1; j < arregloOrdenado.length;j++) {
                    if (arregloOrdenado[i] < arregloOrdenado[j]) {
                        int aux = arregloOrdenado[i];
                        arregloOrdenado[i] = arregloOrdenado[j];
                        arregloOrdenado[j] = aux;
                    }
                }   
            }
            return arregloOrdenado;
        } 

    }
    public int[] seleccionOrdenamiento(int[] array, boolean cambio) {
        int[] arregloOrdenado = Arrays.copyOf(array, array.length);
        if (cambio == true){
            for (int i = 0; i < arregloOrdenado.length - 1; i++) {
                int indice = i;
                for (int j = i + 1; j < arregloOrdenado.length; j++) {
                    if (arregloOrdenado[j] < arregloOrdenado[indice]) {
                        indice = j;
                    }
                }
    
                int pequeno = arregloOrdenado[indice];
                arregloOrdenado[indice] = arregloOrdenado[i];
                arregloOrdenado[i] = pequeno;
            }
            return arregloOrdenado;
        } else {
            for (int i = 0; i < arregloOrdenado.length - 1; i++) {
                int indice = i;
                for (int j = i + 1; j < arregloOrdenado.length; j++) {
                    if (arregloOrdenado[j] > arregloOrdenado[indice]) {
                        indice = j;
                    }
                }
    
                int pequeno = arregloOrdenado[indice];
                arregloOrdenado[indice] = arregloOrdenado[i];
                arregloOrdenado[i] = pequeno;
            }
            return arregloOrdenado;
        }

    }
    public int[] insercionOrdenamiento(int[] array, boolean cambio) {

        int[] arregloOrdenado = Arrays.copyOf(array, array.length);
        if (cambio == true){
            for (int j = 1; j < arregloOrdenado.length; j++) {
                int key = arregloOrdenado[j];
                int i = j - 1;
                while (i >= 0 && arregloOrdenado[i] > key) {
                    arregloOrdenado[i + 1] = arregloOrdenado[i];
    
                    i--;
                }
                arregloOrdenado[i + 1] = key;
            }
            return arregloOrdenado;
        
        } else {
            for (int j = 1; j < arregloOrdenado.length; j++) {
                int key = arregloOrdenado[j];
                int i = j - 1;
                while (i >= 0 && arregloOrdenado[i] <  key) {
                    arregloOrdenado[i + 1] = arregloOrdenado[i];
    
                    i--;
                }
                arregloOrdenado[i + 1] = key;
            }
            return arregloOrdenado;

        }
    }
    //Insercion con instrucciones
    public int[] insercionOrdenamientoInstrucciones(int[] array, boolean cambio) {

        int[] arregloOrdenado = Arrays.copyOf(array, array.length);
        if (cambio == true){
            for (int j = 1; j < arregloOrdenado.length; j++) {
                System.out.println("REPASO DE NUMERO " + j);
                int key = arregloOrdenado[j];
                int i = j - 1;
                System.out.println("\ti=" + i + " j=" + j + " [i]=" + array[i] + " [j]=" + array[j]);
                while (i >= 0 && arregloOrdenado[i] > key) {
                    System.out.println("\t\tComparamos " + key + " con " + array[j]);
                    arregloOrdenado[i + 1] = arregloOrdenado[i];
                    i--;
                    System.out.println("\t\t--------" + Arrays.toString(array));
                }
                System.out.println("\t--------" + Arrays.toString(array));
                arregloOrdenado[i + 1] = key;
            }
            return arregloOrdenado;
        
        } else {
            for (int j = 1; j < arregloOrdenado.length; j++) {
                int key = arregloOrdenado[j];
                int i = j - 1;
                while (i >= 0 && arregloOrdenado[i] <  key) {
                    arregloOrdenado[i + 1] = arregloOrdenado[i];
    
                    i--;
                }
                arregloOrdenado[i + 1] = key;
            }
            return arregloOrdenado;

        }
    }
    
} 
            
        


