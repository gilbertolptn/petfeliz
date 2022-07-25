package br.com.tt.petfeliz.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_cuidador")
public class Cuidador {

    Cuidador() {}

    //TODO Usar Builder aqui
    public Cuidador(Long id, String nome, String cpf, String telefone, String cidade, Estado estado, TipoCuidador nivel) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.nivel = nivel;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private Estado estado;

    @Column(name = "nivel")
    private TipoCuidador nivel;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public TipoCuidador getNivel() {
        return nivel;
    }
}
