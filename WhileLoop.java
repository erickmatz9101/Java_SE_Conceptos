public class WhileLoop {

    //Se declara esta variable como global fuera del main porque se va a estar validando en otro metodo//

    static boolean isTurnOnLight=false;

    public static void main(String[] args) {

        //Aqui indica si el usiario enciende o apaga la lampara//

        turnOnOfLigth();

        //se usa el while para que siempre que la condicion se cumpla isTurnOnLigth se  imprima SOS//
        //Se coloca una cariable que incremente la señal SOS hasta que se imprima 10 veces
        //por ello se coloca el operador && para que al llegar a 10 sean las veces que lo imprima

        int i=1;
        while (isTurnOnLight && i<=10){
            printSOS();
            i++;
        }

    }
    //Este metodo es el que permite que se imprima la señal sos//
    public static void printSOS(){
        System.out.println(". . .  _ _ _  . . . ");

    }

    //Este metodo es al que responde al touch del usuario si oprime el apagador se pueda prender la lampara//
    //por eso se coloca como boolean para que devuelva el estado ya sea true o false//
    public static boolean turnOnOfLigth(){
        isTurnOnLight=(isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
