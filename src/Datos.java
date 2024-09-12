public class Datos {
    public static void main(String[] args){
        
    /*DECLRACIÒN DE VARIABLES */
    //Se declaran las variables primitivas de la clase Datos
    byte edad = 25;
    short codigoPostal = 12345;
    double salario = 3500.00;
    String nombre = "Juan Pèrez";
    boolean esMayorDeEdad = true;

    /*CLASES ENVOLVENTES */

    // Se convierte dato primitivo byte edad en un objeto Byte
    Byte edadObj = edad;  
    //Se convierte un objeto Byte edad a un valor primitivo
    byte edad = edadObj;
    //Se convierte dato primitivo salario a un objeto
    Double salarioObj = salario;
    //Se usa el metodo toString() para obtener una representaciòn 
    String nombreSrt = nombre.toString();
    System.out.println("El nombre es " + nombreSrt);

    //CASTEO

    //Converciòn de dato entero double 64 bits a un dato entero int 32 bits
    int salarioEnte = (int) salario;
    System.out.println("Salario es " + salarioEnte);
    //Converciòn de dato entero short 16 bits a un dato entero long 64 bits
    long codigoPostalEnte =(long) codigoPostal;
    System.out.println("Salario es " + codigoPostalEnte);
    /*Al hacer el casteo se cambia el tipo de dato al que 
    se necesite siempre y cuando sea compatible.*/

    //PARSEO DE DATOS

    /*Converciòn de un clase String con 
    infomacion numerica a un dato int 32 bits 
    usando el mètodo especifico de la clase envolvente Integer*/
    String numeroStr = "12345678";
    int numeroInt = Integer.parseInt(numeroStr);
    /*Converciòn de un clase String con 
    infomacion numerica a un dato nùmerico flotante
    double 64 bits, usando el mètodo especifico de 
    la clase envolvente Double*/
    String decimalStr = "3.14159";
    double decimalVal = Double.parseDouble(decimalStr);

    System.out.println("Nùmero es " + numeroInt);
    System.out.println("Valor es " + decimalVal);


    

    








    }
    
}
