package usuario;

import AparelhoTelefonico.AparelhoTelefonico;
import IPhone.IPhone;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusica.ReprodutorMusica;

public class UsuarioIPhone {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        AparelhoTelefonico phone = iphone;
        NavegadorInternet safari = iphone;
        ReprodutorMusica ipod = iphone;
        
        System.out.println("IPod");
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();

        System.out.println("Phone");
        phone.ligar();
        phone.atender();
        phone.iniciarCorreioVoz();

        System.out.println("Safari");
        safari.exibirPagina();
        safari.adicionarNovaAba();
        safari.atualizarPagina();

    }
}
