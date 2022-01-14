public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        //concatenar el primero con el ultimo el ultimo con el primero etc

        int[] numeros = new int[10];
        int[] a = new int[10];


        int total = numeros.length;
        for (int i = 0; i < total; i++) {
            numeros[i] = i + 1;
        }
        int totalA = a.length;
        int aux = 0;
        for (int i = 0; i < total - i; i++) {// i = 1   | 6 < 5|
            a[aux++] = numeros[i]; //0, 2, 4
            a[aux++] = numeros[total - 1 - i]; //1, 3, 5
            /*System.out.print(numeros[i] + " ");
            System.out.println(numeros[total - 1 - i]);
             */
        }

        for (int i = 0; i < total; i++) {
            System.out.println("a" + "[" + i + "]" + " = " + a[i]);

        }
    }
}
