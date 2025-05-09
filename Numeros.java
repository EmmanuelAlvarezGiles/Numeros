import javax.swing.JOptionPane; //Da entrada 
public class Numeros{
    public static void main(String[] args){
        
        //De cadena a enteros
        String numero1 = JOptionPane.showInputDialog("Ingresa un numero: ");
        String numero2 = JOptionPane.showInputDialog("Ingresa un numero: ");

        int numeroEntero1 = Integer.parseInt(numero1);
        int numeroEntero2 = Integer.parseInt(numero2);
        
        System.out.println(numeroEntero1 + numeroEntero2);


        //De cadena a decimales
        String numero3 = JOptionPane.showInputDialog("Ingresa un numero: ");
        String numero4 = JOptionPane.showInputDialog("Ingresa un numero: ");

        double numeroDecimal1 = Double.parseDouble(numero3);
        double numeroDecimal2 = Double.parseDouble(numero4);
        
        System.out.println(numeroDecimal1 + numeroDecimal2);

    }
}