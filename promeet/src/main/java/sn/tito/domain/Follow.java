package sn.tito.domain;

public class Follow {
    private int id;
    private User user;
    private User followed;

    public Follow(int id, User user, User followed) {
        this.id = id;
        this.user = user;
        this.followed = followed;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public User getFollowed() {
        return followed;
    }
}
