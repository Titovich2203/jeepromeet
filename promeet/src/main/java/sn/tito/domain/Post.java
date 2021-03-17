package sn.tito.domain;

public class Post {
    private int id;
    private String title;
    private String date;
    private String content;
    private String image_file;
    private User user;

    public Post(int id, String title, String date, String content, String image_file, User user) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.content = content;
        this.image_file = image_file;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public String getImage_file() {
        return image_file;
    }

    public User getUser() {
        return user;
    }
}
