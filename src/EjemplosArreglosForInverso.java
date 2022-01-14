import java.util.Arrays;

public class EjemplosArreglosForInverso {
    public static void main(String[] args) {

        /*productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Discp Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generacion";
        productos[6] = "Bicicleta Oxford";
        Arrays.sort(productos);
*/
        String productos[] = {"Kingston Pendrive 64GB","Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook", "Mackbook Air",
                "Chromecast 4ta Generation", "Bicicleta Oxford"};

        Arrays.sort(productos);
        int total = productos.length;

        System.out.println("===== Para el for =====");
        for (int i = 0; i < total; i++){
            System.out.println("Para el indice " + i + " valor: " + productos[i]);
        }

        System.out.println("===== Para el inverse-for =====");
        int decremento = total - 1;
        for (int l = 0; l < total; l++){
            System.out.println("para el indice " + (decremento - l) + " valor: " + productos[decremento - l]);
        }
        System.out.println("===== Para el inverse2-for =====");
        decremento = total - 1;
        for (int i = decremento; i >= 0; i--){
            System.out.println("para el indice " + i + " valor: " +productos[i]);
        }
    }
}
