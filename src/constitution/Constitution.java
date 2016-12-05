package constitution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

	public class Constitution {
		private List<Article> articles = new LinkedList<>();
		private List<Chapter> chapters = new LinkedList<>();
		
		public Constitution(String filePath){
			try(BufferedReader buffor = new BufferedReader(new FileReader(filePath))){
				String line= buffor.readLine();
				while(line!=null){
					if(line.startsWith("Rozdzia³")){
						Chapter chapter = new Chapter(line);
						line=buffor.readLine();
						while(line != null && !line.startsWith("Art.") && !line.startsWith("Rozdzia³")){
							chapter.addLine(line);
							line=buffor.readLine();
						}
						
					}
				}
				
			}
		}
		
	public void readArticles(int a, int b){
		
	}
	
	public void readChapter(int a){
	}
	
}
