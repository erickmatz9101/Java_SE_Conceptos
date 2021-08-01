public class LogicOperations {
    public static void main(String[] args) {
        int a =8;
        int b=5;

                  //Empezando a generar las evaluaciones  OPERADORES DE ASIGNACION//

        System.out.println("La varaiable a es igual a la variable b? " + (a==b));

        System.out.println("La varaiable a es diferente a la variable b? " + (a!=b));

                            //OPERADORES RELACIONALES//

        System.out.println("La varaiable a es mayor a la variable b? " + (a>b));

        System.out.println("La varaiable a es menor a la variable b? " + (a<b));

        System.out.println("La varaiable a es mayor o igual a la variable b? " + (a>=b));

        System.out.println("La varaiable a es menor o igual a la variable b? " + (a<=b));


                    //Colocando estos mismos operadores en ciclos anidados (if/else)//

        if (a==b){
            System.out.println("La varaiable a es igual a la variable b? ");

        }else if (a!=b){
            System.out.println("La varaiable a es diferente a la variable b? ");

        }else if (a>b){
            System.out.println("La varaiable a es mayor a la variable b? ");

        }else  if (a<b){
            System.out.println("La varaiable a es menor a la variable b? ");

        }else if (a>=b){
            System.out.println("La varaiable a es mayor o igual a la variable b? " );

        }else if (a<=b){
            System.out.println("La varaiable a es menor o igual a la variable b? ");

        }


    }

}
