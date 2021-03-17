package sn.tito.domain;

public class User {
    private int id;
    private String nom;
    private String prénom;
    private String username;
    private String email;
    private String mdp;
    private String image;

    public User(int id, String nom, String prénom, String username, String email, String mdp, String image) {
        this.id = id;
        this.nom = nom;
        this.prénom = prénom;
        this.username = username;
        this.email = email;
        this.mdp = mdp;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
