package cliente;

public class TestaClientePessoaFisica {
    public static void main(String[] args) {
        ClientePessoaFisica cliente2 = new ClientePessoaFisica(
                "Luiza",
                "333.333.333-33",
                "luiza@gmail.com",
                "987263902",
                "luiza_02",
                12345,
                true
        );

        ClientePessoaFisica cliente3 = new ClientePessoaFisica(
                "Luiz",
                "444.333.444-33",
                "luiz@gmail.com",
                "987263902",
                "luiz_03",
                12345,
                false
        );

        cliente2.visualizar();
        cliente2.solicitarCartao();
        cliente2.acessarConta("luiza@gmail.com",12345);

        cliente3.visualizar();
        cliente3.solicitarCartao();
    }

}
