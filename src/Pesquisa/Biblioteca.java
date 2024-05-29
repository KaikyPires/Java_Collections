package Pesquisa;

import java.util.ArrayList;

public class Biblioteca {
    public static void main(String[] args) throws Exception {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adcionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogoLivros.adcionarLivro("1984", "George Orwell", 1949);
        catalogoLivros.adcionarLivro("Brave New World", "Aldous Huxley", 1932);
        catalogoLivros.adcionarLivro("To Kill a Mockingbird", "Harper Lee", 1960);
        catalogoLivros.adcionarLivro("The Great Gatsby", "F. Scott Fitzgerald", 1925);

       System.out.println(catalogoLivros.pesquisarPorAutor("George Orwell"));
       
    }
}
