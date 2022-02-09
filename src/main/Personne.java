package main;

public class Personne {
    private int id;
    private String prenom;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Personne(int id, String prenom, int age) {
        this.id = id;
        this.prenom = prenom;
        this.age = age;
    }

    public Personne() {
    }
}
