package ru.netology.domain;

public class Comment {
    private int count;
    private boolean can_close;
    private boolean can_open;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCan_close() {
        return can_close;
    }

    public void setCan_close(boolean can_close) {
        this.can_close = can_close;
    }

    public boolean isCan_open() {
        return can_open;
    }

    public void setCan_open(boolean can_open) {
        this.can_open = can_open;
    }
}
