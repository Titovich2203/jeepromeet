package sn.tito.domain;

public class Jaime {
    private int id;
    private User user;
    private Post post;

    public Jaime(int id, User user, Post post) {
        this.id = id;
        this.user = user;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Post getPost() {
        return post;
    }
}
