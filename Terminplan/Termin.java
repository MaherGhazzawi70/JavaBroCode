package Terminplan;
import java.time.LocalDate;
import java.time.LocalTime;      

public class Termin {
    public String description;
    public LocalDate date;
    public LocalTime uhrzeit;    
    public String[] teilnehmer;

    public Termin(String description, LocalDate date, LocalTime uhrzeit, String[] teilnehmer) {
        this.description = description;
        this.date = date;
        this.uhrzeit = uhrzeit;
        this.teilnehmer = teilnehmer;
    }
}