public class UpdatingVariables {
    public static void main(String[] args) {
        int salary=1000;

        //bono de $200//
        salary=salary+200;
        System.out.println( "Tú salario es de " + salary);

        //Descuento por pension %50//

        salary=salary-50;
        System.out.println("Tú salario es de " + salary);

        //trabajo 2 horas extra de $30//
        //descuento de $45 de comida//

        salary = salary + (30*2)-45;
        System.out.println("Tú salario es de " + salary);

        //Actualizando cadenas de texto//
        String employeeName="Julian Martinez";
        employeeName= employeeName + " Cruz";
        System.out.println("El nombre completo de el empleado es " + employeeName);

        //Para Actualizar mi nombre y colocar Erick antes de Julian seria hacerlo asi//

        employeeName = "Erick " + employeeName;
        System.out.println("El nombre actualizado del empleado es: " + employeeName);

    }
}
