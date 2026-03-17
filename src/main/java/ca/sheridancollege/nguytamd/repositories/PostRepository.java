package ca.sheridancollege.nguytamd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.nguytamd.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
