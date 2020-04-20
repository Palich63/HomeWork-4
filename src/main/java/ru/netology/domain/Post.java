package ru.netology.domain;

public class Post {
    private int id; // id поста
    private String headline; // Имя поста
    private int logo; // Владелец поста
    private int dropdownMenu; // Раскрывающееся меня
    private String text; // Текст поста
    private Like like; // лайки
    private Share Share; // репост
    private Seen seen; // Количество просмотров

    private Comment comment ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public int getDropdownMenu() {
        return dropdownMenu;
    }

    public void setDropdownMenu(int dropdownMenu) {
        this.dropdownMenu = dropdownMenu;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    public ru.netology.domain.Share getShare() {
        return Share;
    }

    public void setShare(ru.netology.domain.Share share) {
        Share = share;
    }

    public Seen getSeen() {
        return seen;
    }

    public void setSeen(Seen seen) {
        this.seen = seen;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
