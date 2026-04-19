package GuiBMI;
import javax.swing.JOptionPane;
public class BMI { 
   public static void main(String[] args){
     JOptionPane.showMessageDialog(null, "Willkommen zum BMI Rechner");
    double weight = Double.parseDouble(JOptionPane.showInputDialog("Gib dein Gewicht in kg ein : "));
    double height = Double.parseDouble(JOptionPane.showInputDialog("Gib deine größe in cm ein : "));
    height = height / 100;
    double bmi = weight / (height * height);
    JOptionPane.showMessageDialog(null, "Dein BMI ist : " + bmi);
   }
}