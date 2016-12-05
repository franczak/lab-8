package constitution;

import java.util.LinkedList;
import java.util.List;

public class Chapter {
	List<Article> articles = new LinkedList<>();
	List<String> lines = new LinkedList();
	String chapter;
	
	public Chapter(String chapter){
		this.chapter=chapter;
	}
	
	public void addLine (String line){
		this.lines.add(line);
	}
	
	public void addArticle (Article article){
		this.articles.add(article);
	}
	
	public void read(){
		//Czyta caly rozdzial. 
	}
}
