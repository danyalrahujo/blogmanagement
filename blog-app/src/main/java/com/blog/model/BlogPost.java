package com.blog.model;

public class BlogPost {
    private String id;
    private String title;
    private String content;
    private String author;
    private String creationDate;

    public BlogPost() {}

    public BlogPost(String id, String title, String content, String author, String creationDate) {
        this.setId(id);
        this.setTitle(title);
        this.setContent(content);
        this.setAuthor(author);
        this.setCreationDate(creationDate);
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

    // Getters, Setters, equals, hashCode, toString
}
