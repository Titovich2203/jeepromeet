package sn.tito.domain;

public class Commentaire {
    private int id;
    private String contenu;
    private String date;
    private User user;
    private Post post;

    public Commentaire(int id, String contenu, String date, User user, Post post) {
        this.id = id;
        this.contenu = contenu;
        this.date = date;
        this.user = user;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public String getContenu() {
        return contenu;
    }

    public String getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public Post getPost() {
        return post;
    }
}
