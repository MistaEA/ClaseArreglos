import java.util.Arrays;

public class EjemploAreglosParte2 {
    public static void main(String[] args) {

        String productos[] = new String[7];

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Discp Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generacion";
        productos[6] = "Bicicleta Oxford";
        Arrays.sort(productos);

        int total = productos.length;

        System.out.println("======== con For ========");
        for (int i = 0; i < total; i++) {
            System.out.println("Producto " + i + "° = " + productos[i]);
        }
        System.out.println("\n======== con For-each ========");
        int i = 0;
        for (String producto : productos) {
            System.out.println("Producto " + i++ + "° = " + producto);
        }

        System.out.println("\n======== con while ========");
        i = 0;
        total = productos.length;
        while (i < total) {
            System.out.println("Producto " + i + "° = " + productos[i]);
            i++;
        }
        System.out.println("\n======== con do-while ========");
        i = 0;
        total = total;
        do {
            System.out.println("Producto " + i + "° = " + productos[i]);
            i++;
        } while (i < total);


        //con enteros

        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        for (int a = 0; a < totalNumeros; a++) {
            numeros[a] = a * 3;
        }

        for (int a = 0; a < totalNumeros; a++) {
            System.out.println("numeros = " + numeros[a]);
        }
    }
}
