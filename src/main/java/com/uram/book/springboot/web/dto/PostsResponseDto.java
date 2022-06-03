package com.uram.book.springboot.web.dto;

import com.uram.book.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;
    private String content;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
        this.content = entity.getContent();
    }
}
