package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

}
