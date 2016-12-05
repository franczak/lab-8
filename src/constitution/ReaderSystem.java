package constitution;

import java.util.Scanner;

public class ReaderSystem {

	public static void main(String[] args) {
		//Constitution constitution = new (filePath);
		Scanner scan = new Scanner(System.in);
		System.out.print("Available options: \na - read an article \nb - read articles \nc - read a chapter");
		String option = scan.nextLine();

		if(option.equals("-a") || option.equals("a")){
			System.out.print("Article number: ");
			try{
				constitution.readArticle(scan.nextInt());
			}
			catch (Exception error){
				System.out.println(error.toString());
			}
		}
			else if(option.equals("-b") || option.equals("b")){
				System.out.print("Articles numbers:");
				try{
					constitution.readArticles(scan.nextInt(), scan.nextInt());
				}
				catch (Exception error){
					System.out.println(error.toString());
				}	
			}
			else if(option.equals("-c") || option.equals("c")){
				System.out.print("Chapter number:");
				try{
					constitution.readChapter(scan.nextInt());
				}
				catch (Exception error){
					System.out.println(error.toString());
				}	
			}
			else{
				System.out.println("Invalid option");
			}
	}

}
