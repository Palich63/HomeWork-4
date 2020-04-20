package ru.netology.domain;

public class Comment {
    private int subscribe; //Подписаться
    private int idUser; //id пользователя
    private int dropdownMenu; //Раскрывающее меню
    private int Filter; //Фильтр
    private String tapeComment; // Комментарии
    private String writeComment; //Написать комментарий
    private Like like;
    private int answerOnComment; // Ответить на комментарий
    private int SendComment; // Отправить сообщение

    //Добавлено с vk
    private int count;
    private boolean canClose;
    private boolean canOpen;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public int getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(int subscribe) {
        this.subscribe = subscribe;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getDropdownMenu() {
        return dropdownMenu;
    }

    public void setDropdownMenu(int dropdownMenu) {
        this.dropdownMenu = dropdownMenu;
    }

    public int getFilter() {
        return Filter;
    }

    public void setFilter(int filter) {
        Filter = filter;
    }

    public String getTapeComment() {
        return tapeComment;
    }

    public void setTapeComment(String tapeComment) {
        this.tapeComment = tapeComment;
    }

    public String getWriteComment() {
        return writeComment;
    }

    public void setWriteComment(String writeComment) {
        this.writeComment = writeComment;
    }

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    public int getAnswerOnComment() {
        return answerOnComment;
    }

    public void setAnswerOnComment(int answerOnComment) {
        this.answerOnComment = answerOnComment;
    }

    public int getSendComment() {
        return SendComment;
    }

    public void setSendComment(int sendComment) {
        SendComment = sendComment;
    }
}
