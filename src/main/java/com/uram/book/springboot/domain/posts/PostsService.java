package com.uram.book.springboot.domain.posts;

import com.uram.book.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional(readOnly = true)
    public List<PostsResponseDto> findAllDesc(){
        return postsRepository.findAllDesc().stream().map(PostsResponseDto::new)
                .collect(Collectors.toList());
    }
}
