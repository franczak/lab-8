package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import constitution.Article;

public class ArticleTests {
	Article article1=new Article("Art. 1.");
	Article article2=new Article("Art. 2.");
	Article article3=new Article("Art. 6.");
	
	@Test
	public void addLineTest() {
		article1.addLine("Rzeczpospolita Polska jest dobrem wsp�lnym wszystkich obywateli.");
		assertEquals("Art. 1./nRzeczpospolita Polska jest dobrem wsp�lnym wszystkich obywateli./n", 
				article1.read().toString());
		article2.addLine("Rzeczpospolita Polska jest demokratycznym pa�stwem prawnym, urzeczywistniaj�-");
		article2.addLine("cym zasady sprawiedliwo�ci spo�ecznej.");
		assertEquals("Art. 2./nRzeczpospolita Polska jest demokratycznym pa�stwem prawnym, urzeczywistniaj�-/ncym zasady sprawiedliwo�ci spo�ecznej./n",article2.read().toString());
	}
	@Test
	public void mergeWordTest(){
		article3.addLine("1. Rzeczpospolita Polska stwarza warunki upowszechniania i r�wnego dost�pu do");
		article3.addLine("d�br kultury, b�d�cej �r�d�em to�samo�ci narodu polskiego, jego trwania i roz-");
		article3.addLine("woju.");
		article3.addLine("2. Rzeczpospolita Polska udziela pomocy Polakom zamieszka�ym za granic� w za-");
		article3.addLine("chowaniu ich zwi�zk�w z narodowym dziedzictwem kulturalnym.");
		article3.mergeWord();
		assertEquals("Art. 6./n1. Rzeczpospolita Polska stwarza warunki upowszechniania i r�wnego dost�pu do/n"+
        "d�br kultury, b�d�cej �r�d�em to�samo�ci narodu polskiego, jego trwania i/n"+
        "rozwoju./n"+ "2. Rzeczpospolita Polska udziela pomocy Polakom zamieszka�ym za granic� w/n"+
        "zachowaniu ich zwi�zk�w z narodowym dziedzictwem kulturalnym./n",article3.read().toString());
	}

}
