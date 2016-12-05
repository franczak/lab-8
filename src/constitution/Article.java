package constitution;

import java.util.LinkedList;
import java.util.List;

public class Article {
	private String article;
	List<String> lines = new LinkedList<>();
	
	public Article(String number){
		this.article = number;
	}
	
	public void addLine (String line){
		this.lines.add(line);
	}
	
	public void read(){
		StringBuilder builder = new StringBuilder();
		System.out.print(article);
		for(String line : lines){
			builder.append(line).append("\n");										
			System.out.print(line);
		}
	}
	
	public void mergeWord(){
		//£¹czy s³owo, które zosta³o podzielone myœlnikiem. 
	}
}
