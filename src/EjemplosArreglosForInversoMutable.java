import java.util.Arrays;
import java.util.Collections;

public class EjemplosArreglosForInversoMutable {
    public static void Inverso(String[] argumentos){

        int total = argumentos.length;
        int total2 = argumentos.length;
        int totalInverso = total - 1;
        anidado : for(int a = 0; a < total2; a++){
            String noInverso = argumentos[a];
            String inverso = argumentos[totalInverso - a];
            argumentos[a] = inverso;
            argumentos[totalInverso - a] = noInverso;
            total2--;
        }
    }
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook", "Mackbook Air",
                "Chromecast 4ta Generación", "Bicicleta Oxford", "Zapatos Gucci"};

      int total = productos.length;
        Arrays.sort(productos);
        //
        System.out.println("===== for =====");
        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice " + i + " valor: " + productos[i]);
        }
        //reverso Cambiando el orden del arreglo
        System.out.println("\n===== reverse2-for =====");
        int cte = total - 1;
        for (int i = 0; i < total; i++){
            System.out.println("Para el indice " + (cte - i) + " valor: " + productos[cte - i]);
        }
        //reverso Cambiando el orden del arreglo2
        System.out.println("\n===== reverse3-for =====");
        int indice = 0;
        for (int i = cte; i >= 0; i--){
            System.out.println("Para el indice " + indice + " valor: " + productos[i]);
            indice++;
        }
        ////////////
        Inverso(productos);
        Collections.reverse(Arrays.asList(productos));
        System.out.println("===== reverse-for =====");
        for (int l = 0; l < total; l++) {
            System.out.println("Para el indice " + l + " valor: " + productos[l]);

        }
    }
}
