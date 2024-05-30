package Ordenação;

public class main {
    public static void main(String[] args) throws Exception {
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

    ordenacaoPessoas.adcionarPessoa("Kaiky", 19, 1.81);
    ordenacaoPessoas.adcionarPessoa("Mariana", 22, 1.68);
    ordenacaoPessoas.adcionarPessoa("Pedro", 25, 1.75);
    ordenacaoPessoas.adcionarPessoa("Ana", 20, 1.60);
    ordenacaoPessoas.adcionarPessoa("Lucas", 18, 1.80);
    ordenacaoPessoas.adcionarPessoa("Bianca", 23, 1.70);
     System.out.println(ordenacaoPessoas.ordenarPorAltura());
}


}
