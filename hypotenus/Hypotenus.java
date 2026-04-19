package hypotenus;
import javax.swing.JOptionPane;
public class Hypotenus{
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Willkommen zum Hypotenus Rechner.");
        double a = Double.parseDouble(JOptionPane.showInputDialog("Gib die größe von Seite a : "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Gib die größe von Seite b : "));
        double Cpower2 = (a * a) + (b * b);
        double c = Math.sqrt(Cpower2);
        JOptionPane.showMessageDialog(null, "Der Hypotenus von deine Triangle ist  : " + c);
    }
}