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

    public Funcionario(String nome, double slr, String dtAdmissao, String dep) {
        this.nome = nome;
        this.slr = slr;
        this.dtAdmissao = dtAdmissao;
        this.dep = dep;
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
}
