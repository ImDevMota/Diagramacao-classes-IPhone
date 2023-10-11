package IPhone;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusica.ReprodutorMusica;

public class IPhone implements NavegadorInternet, ReprodutorMusica, AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("LIGANDO PELO APP PHONE...");
    }

    @Override
    public void atender() {
        System.out.println("LIGAÇÃO ATENDIDA PELO APP PHONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("VOCÊ ESTÁ NO CORREIO DE VOZ DO APP PHONE");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA PELO APP IPOD...");
    }

    @Override
    public void pausar() {
        System.out.println("MÚSICA PAUSADA PELO APP IPOD");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("MÚSICA SELECIONADA NO APP IPOD");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA NO APP SAFARI");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA PELO APP SAFARI");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("PAGINA ATUALIZADA NO APP SAFARI");
    }
    
}
