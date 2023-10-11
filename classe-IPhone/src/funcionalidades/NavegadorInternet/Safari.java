package NavegadorInternet;
public class Safari implements NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA");
    }

    @Override
    public void atualizarPagina() {
       System.out.println("PAGINA ATUALIZADA");
    }
    
}
