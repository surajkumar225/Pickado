package com.pickado.server.service;

import com.pickado.server.dao.PostDao;
import com.pickado.server.dto.PostDTO;
import com.pickado.server.model.PostModal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostDao postDao;

    @Override
    public List<PostModal> getAllPosts() {
        return postDao.findAll();
    }

    @Override
    public PostModal savePost(PostDTO postDTO) {
        PostModal postModal = new PostModal();

        postModal.setProfile(postDTO.getProfile());
        postModal.setType(postDTO.getType());
        postModal.setSalary(postDTO.getSalary());
        postModal.setExperience(postDTO.getExperience());
        postModal.setDescription(postDTO.getDescription());
        postModal.setTechnology(postDTO.getTechnology());

        return postDao.save(postModal);
    }
}
