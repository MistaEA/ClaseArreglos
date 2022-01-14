import java.util.Arrays;

public class EjemploAreglos {
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

        String producto = productos[0];
        String producto1 = productos[1];
        String producto2 = productos[2];
        String producto3 = productos[3];
        String producto4 = productos[4];
        String producto5 = productos[5];
        String producto6 = productos[6];

        System.out.println("producto = " + producto);
        System.out.println("producto = " + producto1);
        System.out.println("producto = " + producto2);
        System.out.println("producto = " + producto3);
        System.out.println("producto = " + producto4);
        System.out.println("producto = " + producto5);
        System.out.println("producto = " + producto6);

        int[] numeros = new  int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;
        // numeros[4] = 5;

        Arrays.sort(numeros);


        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];
        //int m = numeros[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
