/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastraempresa;

/**
 *
 * @author 201720091
 */
public class Funcionario {
    private String nome;
    private double slr;
    private String dtAdmissao;
    private String dep;
    private String cargo;

    public Funcionario(String nome, double slr, String dtAdmissao, String dep, String cargo) {
        this.nome = nome;
        this.slr = slr;
        this.dtAdmissao = dtAdmissao;
        this.dep = dep;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSlr() {
        return slr;
    }

    public void setSlr(double slr) {
        this.slr = slr;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(String dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
