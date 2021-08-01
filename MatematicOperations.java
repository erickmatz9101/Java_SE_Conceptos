public class MatematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Devuelve un entero hacia arriba//
        System.out.println(Math.ceil(x));

        //Devuelve un entero hacia abajo//
        System.out.println(Math.floor(x));

        //Devuelve un número elevado a otro//

        System.out.println( "El numero elevado a la potencia da como resultado "  + Math.pow(x,y));

        //Para saber ¿Cuál de los datos es el mayor?//

        System.out.println("El número mayor es " + Math.max(x,y));

        //Devuelve la raíz cuadrada//

        System.out.println("La raíz cuadrada de y es " + Math.sqrt(y));

        //Para calcular el área de un círculo (PI*r2)//

        System.out.println("El área de el circulo es " + Math.PI* Math.pow(y,2));

        //El area de una esfera 4*PI*r2//
        System.out.println("El área de la esfera es " + 4*Math.PI*Math.pow(y,2));

        //Volumen de una esfera 4/3*PI*r3//

        System.out.println("El volumen de la esfera es: " + 4/3 * Math.PI*Math.pow(y,3));




    }
}
