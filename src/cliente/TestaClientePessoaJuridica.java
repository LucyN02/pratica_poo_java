package cliente;

public class TestaClientePessoaJuridica {
    public static void main(String[] args) {
        ClientePessoaJuridica cliente4 = new ClientePessoaJuridica(
                "João","999.999.999-99","joao@gmail.com",
                "99998888","joao04",12345,"JD");
        cliente4.visualizar();
    }
}
