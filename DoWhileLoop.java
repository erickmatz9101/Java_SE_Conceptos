import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response=0; //Se declara la variable para las opciones

        //En el do coloco las opciones que se van a validar
        do{
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Seleccionaste 0Series");
            System.out.println("0. Salir");

            //Se utiliza el Scanner para que el usuario puede teclear una opcion de las anteriores (entrada de datos)

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            //Utilizo un switch para que dependiendo de la opcion sea el mensaje que arroje

            switch (response){
                case 0:
                    System.out.println("Gracias por visitar el menú");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;

                    //En caso de seleccionar una opcion no valida para ello es el default
                default:
                    System.out.println("Selecciona una opción correcta");
            }

            //Cerramos el ciclo do while donde si la opcion es diferente de cero sale del do y arroja el mensaje de while

        }while (response !=0);
        System.out.println("Se terminó el programa");
    }
}
