//Código por:
//Guilherme Oliveira e Lucas Roberto

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarPontoControle {
    public static void main(String[] args) throws InterruptedException {
        Gerente fc1 = new Gerente();
        fc1.setEmail("joao@gmail.com");
        fc1.setLogin("joaogerente");
        fc1.setSenha("12345");
        fc1.setNome("Gerente Joao");
        fc1.setDocumento("12345678900");
        fc1.setIdFunc(1);

        Secretaria fc2 = new Secretaria();
        fc2.setRamal("4001");
        fc2.setTelefone("19 989498224");
        fc2.setDocumento("23456789100");
        fc2.setIdFunc(2);
        fc2.setEmail("maria@gmail.com");
        fc2.setNome("Secretaria Maria");


        Operador fc3 = new Operador();
        fc3.setIdFunc(3);
        fc3.setDocumento("42354121500");
        fc3.setNome("Operador Ze");
        fc3.setValorHora(10.5);
        fc3.setEmail("ze@gmail.com");

        RegistroPonto registroPontoGerente = new RegistroPonto();
        registroPontoGerente.setIdRegPonto(1);
        registroPontoGerente.setFunc(fc1);
        registroPontoGerente.setDataRegistro(LocalDate.now());
        registroPontoGerente.setHoraEntrada(LocalDateTime.now());
        registroPontoGerente.apresentarRegistroPonto();
        Thread.sleep(1000);

        RegistroPonto registroPontoSecretaria = new RegistroPonto();
        registroPontoSecretaria.setIdRegPonto(2);
        registroPontoSecretaria.setFunc(fc2);
        registroPontoSecretaria.setDataRegistro(LocalDate.now());
        registroPontoSecretaria.setHoraEntrada(LocalDateTime.now());
        registroPontoSecretaria.apresentarRegistroPonto();
        Thread.sleep(1000);

        RegistroPonto registroPontoOperador = new RegistroPonto();
        registroPontoOperador.setIdRegPonto(3);
        registroPontoOperador.setFunc(fc3);
        registroPontoOperador.setDataRegistro(LocalDate.now());
        registroPontoOperador.setHoraEntrada(LocalDateTime.now());
        registroPontoOperador.apresentarRegistroPonto();
        Thread.sleep(1000);

        registroPontoGerente.setHoraSaida(LocalDateTime.now());
        registroPontoGerente.apresentarRegistroPonto();
        Thread.sleep(1000);

        registroPontoSecretaria.setHoraSaida(LocalDateTime.now());
        registroPontoSecretaria.apresentarRegistroPonto();
        Thread.sleep(1000);

        registroPontoOperador.setHoraSaida(LocalDateTime.now());
        registroPontoOperador.apresentarRegistroPonto();
        Thread.sleep(1000);

    }
}