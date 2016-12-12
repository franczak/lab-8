package constitution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

	public class Constitution {
		private List<Article> articles = new LinkedList<>();
		private List<Chapter> chapters = new LinkedList<>();
		
		public Constitution(String filePath){
			
			try(BufferedReader buffor = new BufferedReader(new FileReader(filePath))){
				String line= buffor.readLine();
				while(line!=null){
					if(line.startsWith("Rozdzia")){
						Chapter chapter = new Chapter(line);
						line=buffor.readLine();
						while(line != null && !line.startsWith("Art.") && !line.startsWith("Rozdzia")){
							chapter.addLine(line);
							line=buffor.readLine();
						}
						chapters.add(chapter);
					}
						else{
							line = buffor.readLine();
						}
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("No such file");
				System.exit(1);
			}
		
			try(BufferedReader buffor= new BufferedReader(new FileReader(filePath))){
				String line=buffor.readLine();
				int chapter = -1;
				while (line!=null){
					if(line.startsWith("Rozdzia")){
						chapter++;
					}
					if(line.startsWith("Art.")){
						Article article=new Article(line);
						line = buffor.readLine();
						while(line != null && !line.startsWith("Art.") && !line.startsWith("Rozdzia") && !line.startsWith("©Kancelaria Sejmu")){
							article.addLine(line);
							line = buffor.readLine();
						}	
						article.mergeWord();
						articles.add(article);
						chapters.get(chapter).addArticle(article);
					} else {
						line = buffor.readLine();
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.exit(1);
			}
			}
		
			public void readArticle(int []a) throws Exception{
				if(a[0]>articles.size() || a[0]<1){
					throw new Exception("Wrong article");
				}
				articles.get(a[0]-1).read();
			}
			
	        public void readArticles(int []a) throws Exception{
	            if(a[0]>articles.size() || a[0] < 0){
	                throw new Exception("No such article range");
	            }
	            if(a[0] > a[1]){
	                throw new Exception("Start article and be smaller than end article");
	            }
	            for(int i = a[0]-1; i <= a[1]-1;i++){
	                articles.get(i).read();
	            }
	        }
			public void readChapter(int []a) throws Exception{
				if(a[0]>chapters.size() || a[0]<1){
					throw new Exception("Wrong chapter");
				}
				chapters.get(a[0]-1).read();
			}

}