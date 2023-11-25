package com.pickado.server.service;

import com.pickado.server.dto.PostDTO;
import com.pickado.server.model.PostModal;

import java.util.List;

public interface PostService {

    public List<PostModal> getAllPosts();

    public PostModal savePost(PostDTO post);
}
