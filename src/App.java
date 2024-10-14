import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import javax.sound.sampled.SourceDataLine;
public class App {
    public static void main(String[] args) throws Exception {
        MetodosOrdenamiento ordenar = new MetodosOrdenamiento();
        Scanner leer = new Scanner(System.in);
        //variable para cambiar el orden
        boolean cambio = true;
        //variable para almacenar el dato y usarlo en la condicional
        int alternar;
        System.out.print(" - Ingrese el tamaño del arreglo:  ");

        int tamanio = leer.nextInt();

        int [] array = new int[tamanio] ;

        for (int i = 0; i < tamanio; i++) {
            System.out.println("Dato  " + i + " :");
            array[i] = leer.nextInt();
        }
        System.out.println("El arreglo que usted envio es este :  " +  Arrays.toString(array));
        System.out.println("*Escribe el numero segun la lista de como vas a imprimir tu arreglo ordenado:  ");
        System.out.println("-1. Burbuja Normal         -2.Burbuja Compleja ");
        System.out.println("-3. Seleccion              -4.Insercion     ");
        System.out.println("*** Cualquier numero para salir  *** ");
        int seleccionar = leer.nextInt();
        switch(seleccionar){
            case 1:
                System.out.println("*****Burbuja Normal:*****");
                System.out.println("Imprimir de forma (Escribe el numero segun la lista )");
                System.out.println("-1. Ascendente        -2.Descendente ");
                alternar = leer.nextInt();
                if (alternar == 1){
                    cambio = true;
                    System.out.println("Quiere imprimir el metodo con instrucciones: "); 
                    System.out.println("1. No                                    2.Si"); 
                    alternar = leer.nextInt();
                        if (alternar == 1){
                            int[] arrayOrd = ordenar.burbujaOrdenamiento(array, cambio);
                            System.out.println("- Array Ordenado por metodo burbuja com es: " + Arrays.toString(arrayOrd));
                        } else {
                            int[] arrayOrd = ordenar.burbujaOrdenamientoInstrucciones(array, cambio);
                            System.out.println("- Array Ordenado por metodo burbuja com  es: " + Arrays.toString(arrayOrd));
                        }  
                } else {
                    cambio = false;
                    if (alternar == 1){
                        int[] arrayOrd = ordenar.burbujaOrdenamiento(array, cambio);
                        System.out.println("- Array Ordenado por metodo burbuja com  es: " + Arrays.toString(arrayOrd));
                    } else {
                        int[] arrayOrd = ordenar.burbujaOrdenamientoInstrucciones(array, cambio);
                        System.out.println("- Array Ordenado por metodo burbuja com  es: " + Arrays.toString(arrayOrd));
                    }  
                }
                    break;
            //CASO 2: NO TERMINADO   (BORRAR EL COMENTARIO DESPUES DE HACERLO)
            case 2:
                System.out.println("*****Burbuja Compleja:*****");
                System.out.println("Imprimir de forma (Escribe el numero segun la lista )");
                System.out.println("-1. Ascendente        -2.Descendente ");
                alternar = leer.nextInt();
                if (alternar == 1){
                    cambio = true;
                    System.out.println("Quiere imprimir el metodo con instrucciones: "); 
                    System.out.println("1. No                                    2.Si"); 
                    alternar = leer.nextInt();
                        if (alternar == 1){
                            int[] arrayOrd = ordenar.seleccionOrdenamiento(array, cambio);
                            System.out.println("- Array Ordenado por metodo burbuja com es: " + Arrays.toString(arrayOrd));
                        } else {
                            int[] arrayOrd = ordenar.seleccionOrdenamientoInstrucciones(array, cambio);
                            System.out.println("- Array Ordenado por metodo burbuja com  es: " + Arrays.toString(arrayOrd));
                        }  
                } else {
                    cambio = false;
                    if (alternar == 1){
                        int[] arrayOrd = ordenar.seleccionOrdenamiento(array, cambio);
                        System.out.println("- Array Ordenado por metodo burbuja com  es: " + Arrays.toString(arrayOrd));
                    } else {
                        int[] arrayOrd = ordenar.seleccionOrdenamientoInstrucciones(array, cambio);
                        System.out.println("- Array Ordenado por metodo burbuja com  es: " + Arrays.toString(arrayOrd));
                    }  
                }
                    break;
            case 3:
                System.out.println("*****Ordenamiento por seleccion:*****");
                System.out.println("Imprimir de forma (Escribe el numero segun la lista )");
                System.out.println("-1. Ascendente        -2.Descendente ");
                alternar = leer.nextInt();
                    if (alternar == 1){
                        cambio = true;
                        System.out.println("Quiere imprimir el metodo con instrucciones: "); 
                        System.out.println("1. No                                    2.Si"); 
                        alternar = leer.nextInt();
                            if (alternar == 1){
                                int[] arrayOrd = ordenar.seleccionOrdenamiento(array, cambio);
                                System.out.println("- Array Ordenado por metodo Seleccion es: " + Arrays.toString(arrayOrd));
                            } else {
                                int[] arrayOrd = ordenar.seleccionOrdenamientoInstrucciones(array, cambio);
                                System.out.println("- Array Ordenado por metodo Seleccion es: " + Arrays.toString(arrayOrd));
                            }  
                    } else {
                        cambio = false;
                        if (alternar == 1){
                            int[] arrayOrd = ordenar.seleccionOrdenamiento(array, cambio);
                            System.out.println("- Array Ordenado por metodo Seleccion es: " + Arrays.toString(arrayOrd));
                        } else {
                            int[] arrayOrd = ordenar.seleccionOrdenamientoInstrucciones(array, cambio);
                            System.out.println("- Array Ordenado por metodo Seleccion es: " + Arrays.toString(arrayOrd));
                        }  
                    }
                    break;
            case 4:
                System.out.println("*****Ordenamiento por insercion:*****");
                System.out.println("Imprimir de forma (Escribe el numero segun la lista )");
                System.out.println("-1. Ascendente        -2.Descendente ");
                alternar = leer.nextInt();
                    if (alternar == 1){
                        cambio = true;
                        System.out.println("Quiere imprimir el metodo con instrucciones: "); 
                        System.out.println("1. No                                    2.Si"); 
                        alternar = leer.nextInt();
                            if (alternar == 1){
                                int[] arrayOrd = ordenar.insercionOrdenamiento(array, cambio);
                                System.out.println("- Array Ordenado por metodo Insercion es: " + Arrays.toString(arrayOrd));
                            } else {
                                int[] arrayOrd = ordenar.insercionOrdenamientoInstrucciones(array, cambio);
                                System.out.println("- Array Ordenado por metodo Insercion es: " + Arrays.toString(arrayOrd));
                            }                                            
                    } else {
                        cambio = false;
                        System.out.println("Quiere imprimir el metodo con isntrucciones: "); 
                        System.out.println("1. No                                    2.Si"); 
                        alternar = leer.nextInt();
                            if (alternar == 1){
                                int[] arrayOrd = ordenar.insercionOrdenamiento(array, cambio);
                                System.out.println("- Array Ordenado por metodo Insercion es: " + Arrays.toString(arrayOrd));
                            } else {
                                int[] arrayOrd = ordenar.insercionOrdenamientoInstrucciones(array, cambio);
                                System.out.println("- Array Ordenado por metodo Insercion es: " + Arrays.toString(arrayOrd));
                            } 
                    }
                    break;
            default:
                System.out.println("*****FINALIZADO***** ");
                break;
        }
    }
}
