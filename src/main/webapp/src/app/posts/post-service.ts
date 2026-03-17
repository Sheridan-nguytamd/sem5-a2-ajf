import { HttpClient } from '@angular/common/http';
import { Injectable, inject, signal } from '@angular/core';
import { Post } from './post';

const restUrl = "/api/v1/posts";

@Injectable({
    providedIn: 'root',
})

export class PostService {
    private http = inject(HttpClient);

    posts = signal<Post[]>([]);
	
	// this formPost is for holding the data for the form
	formPost: Post = {author: '', dateTime: '', techSpecs: ''};

    constructor() {
        this.getPosts();
    }

    getPosts(): void {
        this.http.get<Post[]>(restUrl).subscribe(data => {
            this.posts.set(data);
        });
    }

    savePost(data: Post): void {
        this.http.post<Post>(restUrl, data).subscribe(saved => {
            this.posts.update(posts => [...posts, saved]);
        });
    }

    deletePost(id: number): void {
        this.http.delete<Post>(`${restUrl}/${id}`).subscribe(() => {
            this.getPosts();
        });
    }

    updatePost(data: Post): void {
        this.http.put<Post>(`${restUrl}/${data.id}`, data).subscribe(() => {
            this.getPosts();
        });
    }
}
