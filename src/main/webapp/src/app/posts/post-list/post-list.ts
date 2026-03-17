import { Component, inject } from '@angular/core';
import { PostService } from '../post-service';
import { Post } from '../post';

@Component({
    selector: 'app-post-list',
    imports: [],
    templateUrl: './post-list.html',
    styleUrl: './post-list.css',
})
export class PostList {
    postService = inject(PostService);

    delete(id: number | undefined): void {
        if (id !== undefined) {
            this.postService.deletePost(id);
        }
    }

    edit(post: Post): void {
        this.postService.formPost = { ...post };
		
		//debug only
		//console.log("Edit requested for post #:", post.id);
    }

}
