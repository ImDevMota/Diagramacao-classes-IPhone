package AparelhoTelefonico;

public class Phone implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("LIGANDO...");
    }

    @Override
    public void atender() {
        System.out.println("LIGAÇÃO ATENDIDA");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("VOCÊ ESTÁ NO CORREIO DE VOZ");
    }
    
}
