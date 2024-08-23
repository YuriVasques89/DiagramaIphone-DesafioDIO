package equipamentos.telefone;

public class Nokia implements Telefone {
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atender Ligação?");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz ativo.....");
    }
}
