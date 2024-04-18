package web.users.model;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String name;

    @Column(name = "year")
    private int year;

    @Column(name = "genre")
    private String lastName;

    @Column(name = "watched")
    private boolean employer;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String genre) {
        this.lastName = genre;
    }

    public boolean isEmployer() {
        return employer;
    }

    public void setEmployer(boolean watched) {
        this.employer = watched;
    }

    @Override
    public String toString() {
        return name + " " + year + " " + lastName + " " + employer;
    }
}