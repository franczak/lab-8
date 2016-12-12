package constitution;

import java.util.LinkedList;
import java.util.List;

public class Article {
	StringBuilder builder=new StringBuilder();
	private String article;
	List<String> lines = new LinkedList<>();
	
	public Article(String number){
		this.article = number;
	}
	
	public void addLine (String line){
		this.lines.add(line);
	}
	
	public String read(){
		builder.append(article).append("/n");
		System.out.println(article);
		for(String line : lines){									
			System.out.println(line);
			builder.append(line).append("/n");
		}
		return builder.toString();
	}
	
	public void mergeWord(){
		 String buffer = null;
	        for (int i = 0; i < lines.size(); i++){
	            String line = lines.get(i);
	            if(buffer!=null){
	                lines.set(i, buffer + line);
	                buffer = null;
	            }
	            if(line.charAt(line.length()-1)=='-'){
	                buffer = line.substring(line.lastIndexOf(" ")+1, line.length()-1);
	                lines.set(i, line.substring(0,line.lastIndexOf(" ")));
	            }
	        }
	}
}
