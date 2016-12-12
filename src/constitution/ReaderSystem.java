package constitution;


public class ReaderSystem {
	public static void main(String[] args) {
		OptionParser options=new OptionParser(args);
		
		Constitution constitution = new Constitution(options.getFilePath());
		if(args[1].equals("article")){
			try{
			constitution.readArticle(options.getNumbers());
		}
        catch (Exception e) {
        	System.out.println(e.toString());
        	}
		}
		else if(args[1].equals("chapter")){
			try{
			constitution.readChapter(options.getNumbers());
            } catch (Exception e) {
            	System.out.println(e.toString());
		}
		}
		else if(args[1].equals("articles")){
			try{
			constitution.readArticles(options.getNumbers());
			} catch (Exception e) {
        		System.out.println(e.toString());
			}
		}
		else{
			System.err.println("Available options: article, articles, chapter");
		}
	}
}
		

