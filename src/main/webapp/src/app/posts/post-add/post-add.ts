import { Component, inject } from '@angular/core';
import { PostService } from '../post-service';
import { Post } from '../post';
import { FormsModule } from '@angular/forms';

@Component({
    selector: 'app-post-add',
    imports: [FormsModule],
    templateUrl: './post-add.html',
    styleUrl: './post-add.css',
})
export class PostAdd {
    postService = inject(PostService);

    submitPost(): void {
        // if post has id, update it. otherwise, create a new one
        if (this.postService.formPost.id) {
            this.postService.updatePost(this.postService.formPost);
        } else {
            this.postService.savePost(this.postService.formPost);
        }

		// clear from after click submit
        this.postService.formPost = { author: '', dateTime: '', techSpecs: '' }
    }
}
