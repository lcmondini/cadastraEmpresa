/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastraempresa;

import java.util.ArrayList;

/**
 *
 * @author 201720091
 */
public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
    
    public Empresa(String nome, String cnpj) {
	super();
	this.nome = nome;
	this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(ArrayList<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
    
    public boolean incluirFuncionario(Funcionario f){
        this.funcionario.add(f);
        return true;
    }
    
    public ArrayList retornarDepartamento(){
        ArrayList depto = new ArrayList();
        
        for(Funcionario f : funcionario ){
            f.getDep();
        }
        return depto;
    }
    
    public void aplicarAumento(String dep){
        for(Funcionario f : funcionario ){
            if (f.getDep() == dep){
                f.setSlr(f.getSlr() + (f.getSlr() * 0.1));
            }
        }
    }
}
