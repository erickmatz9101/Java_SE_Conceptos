public class ForLoop {

    //Se declara esta variable como global fuera del main porque se va a estar validando en otro metodo//

    static boolean isTurnOnLight=false;

    public static void main(String[] args) {

        //Aqui indica si el usiario enciende o apaga la lampara//

        turnOnOfLigth();

        /**Declaramos las cosas qu tiene el while en el ejemplo anterior pero ahora declaramos en el for
         Utilizar for i que hace simil con la variable i , como en el ejemplo anterior
         ***No olvides mandar a imprimir el metodo***
         */
        for (int i = 1; i <=10 ; i++) {
            printSOS();
            
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
