package constitution;

import java.util.LinkedList;
import java.util.List;

public class Chapter {
	StringBuilder builder=new StringBuilder();
	List<Article> articles = new LinkedList<>();
	List<String> lines = new LinkedList<>();
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
	
	public String read(){
		System.out.println(chapter);
		builder.append(chapter).append("/n");
		for(String line : lines){
			System.out.println(line);
			builder.append(line).append("/n");
		}
		for(Article article : articles){
			builder.append(article.read());
		}
		return builder.toString();
	}
}
