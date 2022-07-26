package br.com.tt.petfeliz.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_cuidador")
public class Cuidador {

    Cuidador() {}

    //TODO Usar Builder aqui
    public Cuidador(Long id, String nome, String cpf, String telefone, String cidade, Estado estado, TipoCuidador nivel, List<Raca> racasQueCuida) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.nivel = nivel;
        this.racasQueCuida = racasQueCuida;
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
    @Enumerated(EnumType.STRING)
    private TipoCuidador nivel;

    @OneToMany(mappedBy = "cuidador", cascade = {CascadeType.ALL})
    private List<Raca> racasQueCuida;

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

    public void adicionarRaca(Raca novaRaca) {
        racasQueCuida.add(novaRaca);
    }

    public List<Raca> getRacasQueCuida() {
        return racasQueCuida;
    }
}
