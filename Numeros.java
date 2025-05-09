import javax.swing.JOptionPane; //Da entrada 
public class Numeros{
    public static void main(String[] args){
        String numero1 = JOptionPane.showInputDialog("Ingresa un numero: ");
        String numero2 = JOptionPane.showInputDialog("Ingresa un numero: ");
        int numeroEntero1 = Integer.parseInt(numero1);
        int numeroEntero2 = Integer.parseInt(numero2);
        
        System.out.println(numeroEntero1 + numeroEntero2);

    }
}