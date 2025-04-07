
package view.excirculo;
import javax.swing.JOptionPane;
import model.Circulo;
public class Main {

    public static void main(String[] args) {
        Circulo circ = new Circulo();
        
        
         circ.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Qual é o raio do circulo?")));
        
        JOptionPane.showMessageDialog(null, "A area do circulo é " + circ.getArea());
    }
}
