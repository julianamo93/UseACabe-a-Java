public class Exercise1b {

    public static void main (String[] args) {
        //não pode ser compilado
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
        }

        //não consegye ser compilado (corrigir os dois!)
        int y = 5;
        while (y > 1) {
            y -= 1;
            if (y < 3) {
                System.out.println("small x");
            }
        }

        //compila normalmente
        int z = 5;
        while (z > 1) {
            z -= 1;
            if (z < 3) {
                System.out.println("small z");
            }
        }
    }
}
