import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class EjemplosArreglosForOrdenamientoBurbuja {
    public static void sortBurbuja(Object[] arrreglo) {
        int total = arrreglo.length;
        for (int i = 0; i < total; i++){
            for (int j = 0; j < total - 1 - i; j++){
                if (((Comparable)(arrreglo[j + 1])).compareTo(arrreglo[j]) > 0){
                    Object ayudante = arrreglo[j];
                    arrreglo[j] = arrreglo[j + 1];
                    arrreglo [j + 1] = ayudante;
                }
            }
        }
    }
    public static void main(String[] args) {

        String[] productos = {"Mackbook Air 16GB 1TB SSD", "Libreta",
                "tecaldo tkl xzeal", "monitor curvo", "Asus NoteBook",
                "Acordeon", "Huawei P Smart 2020"};

        int total = productos.length;
        sortBurbuja(productos);
        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice: " + i + " valor: " + productos[i]);
        }

        //Otro arreglo

        Integer[] numeros = new Integer[4]; //sustituimos el entero por uno Integer(Clase Wrapper)
        numeros[0] = 1;
        numeros[1] = 23;
        numeros[2] = Integer.valueOf("938");
        numeros[3] = -28;

        int total2 = numeros.length;
        sortBurbuja(numeros);
        for (int i = 0; i < total2; i++) {
            System.out.println("Para el indice: " + i + " valor: " + numeros[i]);
        }
    }
}
