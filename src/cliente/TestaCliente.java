package cliente;

import POO.Pessoa;

public class TestaCliente {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana","Maria","Silva");
        System.out.println(pessoa1.getNomeCompleto());

        Cliente cliente1 = new Cliente("Ana Maria",
                "222.222.222-22",
                "anamaria2@gmail.com",
                "39829323",
                "ana_22",
                12345);

        cliente1.acessarConta("anamaria2@gmail.com",12345);
        cliente1.visualizar();
    }
}
