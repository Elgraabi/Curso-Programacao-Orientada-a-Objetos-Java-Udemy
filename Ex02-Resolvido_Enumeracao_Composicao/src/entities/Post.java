package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Post {

	// Atributos
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy HH:mm:ss");
	
	private Date moment;
	private String title = "";
	private String content = "";
	private Integer likes = 0;
	private LinkedList<Comment> comment = new LinkedList<Comment>();

	// Metodos Especificos
	public void addComment(Comment comment) {
		this.comment.add(comment);
	}

	public void removeComment(Comment comment) {
		this.comment.remove(comment);
	}
	
	public String toString1() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title + "\n");
		sb.append(this.likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(this.moment) + "\n");
		sb.append(this.content + "\n");
		sb.append("Comments: \n");
		for (Comment c : this.comment) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
	
	// Metodos Especiais
	public Post() {
		super();
	}

	public Post(Date moment, String title, String content, Integer likes) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "Post [moment=" + moment + ", title=" + title + ", content=" + content + ", likes=" + likes
				+ ", comment=" + comment + "]";
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

	public Date getMoment() {
		return moment;
	}

	public Integer getLikes() {
		return likes;
	}

}
