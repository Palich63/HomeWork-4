package ru.netology.domain;

public class Post {
    private int id; // id поста
    private String headline; // Имя поста
    private int logo; // Владелец поста
    private int dropdownMenu; // Раскрывающееся меня
    private String text; // Текст поста
    private Share Share; // репост
    private Seen seen; // Количество просмотров
    private Comment comment;
    private Likes like; // лайки


    // Доработанно с vk
    private int fromId;
    private int createdBy;
    private int date;
    private int replyOwnerId;
    private int replyPostId;
    private Reposts repost;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private boolean isFavorite;
    private int postPonedID;

    public void setLike(Likes like) {
        this.like = like;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public Reposts getRepost() {
        return repost;
    }

    public void setRepost(Reposts repost) {
        this.repost = repost;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostPonedID() {
        return postPonedID;
    }

    public void setPostPonedID(int postPonedID) {
        this.postPonedID = postPonedID;
    }

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
