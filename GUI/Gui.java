package GUI;
import javax.swing.JOptionPane;
public class Gui{
    public static void main(String[] args) {
        String Name = JOptionPane.showInputDialog("Gib dein Name ein: ");
        JOptionPane.showMessageDialog(null, "Hallo " + Name + " schön dich kennenzulernen.");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Gib dein alter ein:"));
        JOptionPane.showMessageDialog(null, "Hallo du bist " + age + " jahre alt. ");
        double size = Double.parseDouble(JOptionPane.showInputDialog("Gib deine Größe ein:"));
        JOptionPane.showMessageDialog(null, "Hallo du bist " + size + " cm groß. ");
    }
}