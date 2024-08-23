package Equipamentos.Internet;


public class InternetExplorer implements Internet {
    @Override
    public void exibirPagina() {
        System.out.println("Pagina Ativa em Seleção");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrir Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando... Aguarde");
    }

}
