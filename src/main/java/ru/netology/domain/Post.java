package ru.netology.domain;

public class Post {
    private int postID;
    private int ownerID;
    private int fromID;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerID;
    private int replyPostID;
    private boolean friendsOnly;
    private String postType;
    private int signerID;
    private boolean canPin;
    private boolean canDelete;
    private boolean isPinned;
    private boolean markedAsAd;
    private boolean isFavorite;
    private boolean postponedID;
}
