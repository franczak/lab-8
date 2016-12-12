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
		article1.addLine("Rzeczpospolita Polska jest dobrem wspólnym wszystkich obywateli.");
		assertEquals("Art. 1./nRzeczpospolita Polska jest dobrem wspólnym wszystkich obywateli./n", 
				article1.read().toString());
		article2.addLine("Rzeczpospolita Polska jest demokratycznym pañstwem prawnym, urzeczywistniaj¹-");
		article2.addLine("cym zasady sprawiedliwoœci spo³ecznej.");
		assertEquals("Art. 2./nRzeczpospolita Polska jest demokratycznym pañstwem prawnym, urzeczywistniaj¹-/ncym zasady sprawiedliwoœci spo³ecznej./n",article2.read().toString());
	}
	@Test
	public void mergeWordTest(){
		article3.addLine("1. Rzeczpospolita Polska stwarza warunki upowszechniania i równego dostêpu do");
		article3.addLine("dóbr kultury, bêd¹cej Ÿród³em to¿samoœci narodu polskiego, jego trwania i roz-");
		article3.addLine("woju.");
		article3.addLine("2. Rzeczpospolita Polska udziela pomocy Polakom zamieszka³ym za granic¹ w za-");
		article3.addLine("chowaniu ich zwi¹zków z narodowym dziedzictwem kulturalnym.");
		article3.mergeWord();
		assertEquals("Art. 6./n1. Rzeczpospolita Polska stwarza warunki upowszechniania i równego dostêpu do/n"+
        "dóbr kultury, bêd¹cej Ÿród³em to¿samoœci narodu polskiego, jego trwania i/n"+
        "rozwoju./n"+ "2. Rzeczpospolita Polska udziela pomocy Polakom zamieszka³ym za granic¹ w/n"+
        "zachowaniu ich zwi¹zków z narodowym dziedzictwem kulturalnym./n",article3.read().toString());
	}

}
