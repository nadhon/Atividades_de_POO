package Banco;

import java.util.ArrayList;

public class Clientes {
    ArrayList<Cliente> clientes= new ArrayList<>();
    Cliente cl;
    public boolean addCliente(String nome, String cpf){
        cl =new Cliente(nome, cpf);
        clientes.add(cl);
        return true;
    }
    public void consultarCliente(String nome){

    }
}
