package br.com.blogdoagi.tests;

import br.com.pageobjects.PesquisaPageObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class PesquisaTest extends BaseTest {

    private PesquisaPageObject pesquisa;
    private String textoPesquisa;

    @Override
    @BeforeClass
    public void setup() {
        super.setup();
        pesquisa = new PesquisaPageObject(driver);
    }

    @Test
    public void devePesquisarNoticiaComTexto() {
        textoPesquisa = "FGTS";
        pesquisa.searchText(textoPesquisa);
        assertTrue(pesquisa.retornaTextoLinkNoticia().contains(textoPesquisa));
    }

    @Test
    public void devePesquisarNoticiaComNumeros() {
        textoPesquisa = "2024";
        pesquisa.searchText(textoPesquisa);
        assertTrue(pesquisa.retornaTextoLinkNoticia().contains(textoPesquisa));
    }

    @Test
    public void devePesquisarNoticiaComAlfanumeEicos() {
        textoPesquisa = "FGTS 2024";
        pesquisa.searchText(textoPesquisa);
        assertTrue(pesquisa.retornaTextoLinkNoticia().contains(textoPesquisa));
    }
}
