public class Casting {
    public static void main(String[] args) {
        //En un año ubique  30 perrritos
        //¿Cuantos perritos ubique por mes

        double monthlyDogs=30.0/12.0;
        System.out.println(monthlyDogs); //El resultado me sale con decimal (no puedo patir perros a la mitad) hago cast

        //ESTIMACION conviene convertirlo de un double a un entero//
         int estimateMonthlyDogs= (int)monthlyDogs;
        System.out.println(estimateMonthlyDogs);

        //Exactitud//

        int a=30;
        int b=12;
        System.out.println("El resultado es " + a/b);
        //Haciendo el casteo//

        System.out.println("El resultado haciendo el casteo es " + (double) a/b );

        //Casteando los tipos de datos//

        //De char a entero//

        char n ='1';
        int nI =n;
        System.out.println( "El resultado de castear a número entero es " +nI);

        //Si deseo castear  a una variable más chica de la que vengo en este caso de un char a un short debo hacerlo
        //de form explicita, como ya lo habiamos realizado antes
        short nS=(short) n;
        System.out.println(nS);


    }
}
