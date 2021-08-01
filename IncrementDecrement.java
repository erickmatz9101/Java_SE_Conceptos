public class IncrementDecrement {
    public static void main(String[] args) {
        int lives=5;
        lives = lives -1;
        System.out.println(lives);
        // Utilizando el operador de decremento//

        lives--;

        System.out.println(lives);

        //Utilizando el operador de incremento//

        lives++;
        System.out.println(lives);

        //Forma prefija//

        //Gana un regalo pr ganar una vida//

       // int gift = 100 + lives++; //postfija (toma dato anterior (4) y le suma 100=104)
        int gift = 100 + ++lives; //prefijo (toma el dato anterior (4), le suma la vida que agarre (1) y suma los 100= 105)
        System.out.println(gift);

    }
}
