package ca.sheridancollege.nguytamd.services;

import java.util.List;

import ca.sheridancollege.nguytamd.domain.Post;

public interface PostService {

	public List<Post> findAll();
	public Post save(Post post);
	public void deleteById(Long id);
	public Post update(Long id, Post post);
}
