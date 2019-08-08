/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastraempresa;

/**
 *
 * @author lucasmondini
 */
public class Gerente extends Funcionario{
    
    public Gerente(String nome, double slr, String dtAdmissao, String dep, String cargo) {
        super(nome, slr, dtAdmissao, dep, cargo);
    }
    
    public String getCargo() {
        return "Gerente";
    }
    
}
