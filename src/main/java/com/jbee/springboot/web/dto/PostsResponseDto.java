package com.jbee.springboot.web.dto;

import com.jbee.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    // final 키워드는 엔티티를 한 번만 할당한다. 즉, 두 번 이상 할당하려 할 때 컴파일 오류가 발생하여 확인이 가능
    private final Long id;
    private final String title;
    private final String content;
    private final String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
