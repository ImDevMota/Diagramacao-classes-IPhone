package ReprodutorMusica;
public class Ipod implements ReprodutorMusica{

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA...");
    }

    @Override
    public void pausar() {
        System.out.println("MÚSICA PAUSADA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("MÚSICA SELECIONADA");
    }
    
}
