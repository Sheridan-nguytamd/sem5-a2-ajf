import { Component } from '@angular/core';
import { PostAdd } from './post-add/post-add';
import { PostList } from './post-list/post-list'

@Component({
    selector: 'app-posts',
    imports: [PostAdd, PostList],
    templateUrl: './posts.html',
    styleUrl: './posts.css',
})
export class Posts {
    id?: number;
    author?: string;
    dateTime?: string;
    techSpecs?: string;
}
