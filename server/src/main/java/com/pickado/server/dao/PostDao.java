package com.pickado.server.dao;

import com.pickado.server.model.PostModal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostDao extends MongoRepository<PostModal, String> {
}
