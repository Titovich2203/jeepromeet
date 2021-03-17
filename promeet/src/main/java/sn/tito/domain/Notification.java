package sn.tito.domain;

public class Notification {
    private int id;
    private String type;
    private String content;
    private boolean etat;
    private User user;

    public Notification(int id, String type, String content, boolean etat, User user) {
        this.id = id;
        this.type = type;
        this.content = content;
        this.etat = etat;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public boolean isEtat() {
        return etat;
    }

    public User getUser() {
        return user;
    }
}
