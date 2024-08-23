package equipamentos.musica;

public class Ipod implements ReproduzirMusica {
    @Override
    public void tocar(){
        System.out.println("Música Tocando");
    }

    @Override
    public void pausar(){
        System.out.println("Música Pausada");
    }

    @Override
    public void escolherMusica(){
        System.out.println("Escolhendo...");
    }

}
