public class Funciones {
    public static void main(String[] args) {

        //Las funciones se deben mandar a llamar dentro del main//
        double quantity;
        String currency;

       // System.out.println("pesos a dolares  " + coverToDolar(quantity: 200, currency: "MXN"));



    }
    //Las funciones debo escribirlas fuera del main//

    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero en dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Sólo acpeta MXN o COP
     * @return quantity Devuelve la cantidad ingresada en dolares
    */


    public static double coverToDolar(double quantity, String currency){
        //Debo colocar la cantidad y cuanto dinero se va a convertir//
        switch (currency){
            case "MXN":
                quantity= quantity*0.052;
                break;

            case "COP":
                quantity=quantity*0.0031;
                break;
        }
        return quantity;
    }
}
