package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;

    public Post[] search(String[] args) {
        //some logic
        //return filteredPosts; - нельзя изменять исходный массив постов, но на filteredPosts без инициализации ругается
        return posts;
    }

    public void delete(int postId) {
        //some logic
    }
}
