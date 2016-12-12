package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import constitution.Article;
import constitution.Chapter;

public class ChapterTests {
	Chapter chapter1=new Chapter("Rozdzia³ I");
	Article article1=new Article("Art. 1.");
	Article article2=new Article("Art. 6.");
	
	
	@Test
	public void chapterTest() {
		assertEquals(chapter1.read(),"Rozdzia³ I/n");
		
	}
	
	@Test
	public void addLineTest(){
		chapter1.addLine("RZECZPOSPOLITA");
		assertEquals(chapter1.read(),"Rozdzia³ I/nRZECZPOSPOLITA/n");
	}
	
	@Test
	public void addArticleTest(){
		article1.addLine("Rzeczpospolita Polska jest dobrem wspólnym wszystkich obywateli.");
		article2.addLine("1. Rzeczpospolita Polska stwarza warunki upowszechniania i równego dostêpu do");
		article2.addLine("dóbr kultury, bêd¹cej Ÿród³em to¿samoœci narodu polskiego, jego trwania i roz-");
		article2.addLine("woju.");
		article2.addLine("2. Rzeczpospolita Polska udziela pomocy Polakom zamieszka³ym za granic¹ w za-");
		article2.addLine("chowaniu ich zwi¹zków z narodowym dziedzictwem kulturalnym.");
		article2.mergeWord();
		chapter1.addArticle(article1);
		chapter1.addArticle(article2);
		assertEquals(chapter1.read(),"Rozdzia³ I/n"
				+ "Art. 1./nRzeczpospolita Polska jest dobrem wspólnym wszystkich obywateli./n"
				+ "Art. 6./n1. Rzeczpospolita Polska stwarza warunki upowszechniania i równego dostêpu do/n"+
		        "dóbr kultury, bêd¹cej Ÿród³em to¿samoœci narodu polskiego, jego trwania i/n"+
		        "rozwoju./n"+ "2. Rzeczpospolita Polska udziela pomocy Polakom zamieszka³ym za granic¹ w/n"+
		        "zachowaniu ich zwi¹zków z narodowym dziedzictwem kulturalnym./n");
	}

}
