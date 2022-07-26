package br.com.tt.petfeliz.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_tutor")
public class Tutor {

    Tutor(){}

    //TODO BUILDER
    public Tutor(Long id, String nome, String cpf, String telefone, String cidade, Estado estado, SituacaoTutor situacao, List<Adocao> adocoes) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.situacao = situacao;
        this.adocoes = adocoes;
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

    @Column(name = "situacao")
    @Enumerated(EnumType.STRING)
    private SituacaoTutor situacao;

    @OneToMany(mappedBy = "tutor")
    private List<Adocao> adocoes;

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

    public SituacaoTutor getSituacao() {
        return situacao;
    }

    public List<Adocao> getAdocoes() {
        return adocoes;
    }
}
