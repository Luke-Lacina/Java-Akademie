package local.luke;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Guest {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public Guest(String name, String surname, LocalDate dateOfBirth) {
    this.name = name;
    this.surname = surname;
    this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }
    public String getSurname() {
    return surname;
    }
    public void setSurname(String surname) {
    this.surname = surname;
    }
    public LocalDate getDateOfBirth() {
    return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    }

    public String getDescription() {
    String description = this.name + " " + this.surname + ", " + this.dateOfBirth.format(DateTimeFormatter.ofPattern("d. M. y"));
    return description;
    }
}
