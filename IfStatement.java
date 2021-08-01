public class IfStatement {
    public static void main(String[] args) {
        //Si la condicion la cambio a false no arrojara nada porque no se cumple la condición
       // boolean isBluetoothEnabled = false;
        boolean isBluetoothEnabled =false;
        int fileSended =3;
        if (isBluetoothEnabled) {
            //send file
            fileSended++; //con esta condicion empiezo en 3 archivos y cada vez que la ejecute le sumará 1 por eso da 4
            System.out.println("Archivo enviado = " + fileSended);
        } else{

            System.out.println("El Bluetooth no está activado");
        }





    }
}
