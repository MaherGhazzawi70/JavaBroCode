package Terminplan;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.time.LocalTime;  
public class Terminplan{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (dd.mm.yyyy): ");
        String inputDate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);
        DayOfWeek tag = date.getDayOfWeek();
        
        switch (tag){
            case MONDAY: System.out.println("Die Datum  ist der " + date + " und es ist ein Montag."); break;
            case TUESDAY: System.out.println("Die Datum  ist der " + date + " und es ist ein Dienstag."); break;
            case WEDNESDAY: System.out.println("Die Datum  ist der " + date + " und es ist ein Mittwoch."); break;
            case THURSDAY: System.out.println("Die Datum  ist der " + date + " und es ist ein Donnerstag."); break;
            case FRIDAY: System.out.println("Die Datum  ist der " + date + " und es ist ein Freitag."); break;
            case SATURDAY: System.out.println("Die Datum  ist der " + date + " und es ist ein Samstag."); break;
            case SUNDAY: System.out.println("Die Datum ist der " + date + " und es ist ein Sonntag."); break; 
        }
        System.out.println("Wollen Sie einen Termin hinzufügen? (ja/nein)");
        String antwort = scanner.nextLine();
        if(antwort.equalsIgnoreCase("ja")){
            System.out.println("Geben Sie die Beschreibung des Termins ein: ");
            String desc = scanner.nextLine();
            System.out.println("Geben Sie die Uhrzeit des Termins ein (hh:mm): ");
             LocalTime uhrzeit = LocalTime.parse(scanner.nextLine());
            System.out.println("Teilnehmer (kommagetrennt): ");
            String[] teilnehmer = scanner.nextLine().split(",");

            Termin termin = new Termin(desc, date, uhrzeit, teilnehmer);
            System.out.println("Termin hinzugefügt: " + termin.description + " am " + termin.date + " um " + termin.uhrzeit + " mit Teilnehmern: " + String.join(", ", termin.teilnehmer));
        }
        scanner.close();
    }
}