package constitution;

public class OptionParser {
	private String filePath;
	private String option;
	private int[] num;
	
	public OptionParser(String[] args){
		filePath=args[0];
		option=args[1];
		
		if(option.equals("article")){
			num=new int[1];
			num[0]=Integer.parseInt(args[2]);
		}else if(option.equals("chapter")){
			num=new int[1];
			num[0]=Integer.parseInt(args[2]);
		}
		else if(option.equals("articles")){
			num=new int[2];
			num[0]=Integer.parseInt(args[2]);
			num[1]=Integer.parseInt(args[3]);
		}
	}
	
	public String toRead() throws Exception{
		if(!option.equals("article") && !option.equals("chapter") &&!option.equals("articles")){
			throw new Exception("Available options: article, articles, chapter");
		}
		return option;
	}
	

	public String getFilePath(){
		return filePath;
	}
	
	public int[] getNumbers(){
		return num;
	}
}
