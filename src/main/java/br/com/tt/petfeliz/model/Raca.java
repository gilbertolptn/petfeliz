package br.com.tt.petfeliz.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_raca")
public class Raca {

    Raca() {}

    //TODO usar builder
    public Raca(Long id, String descricao, TipoAnimal tipo, Cuidador cuidador) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
        this.cuidador = cuidador;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "tipo")
    @Enumerated(EnumType.STRING)
    private TipoAnimal tipo;

    @ManyToOne
    @JoinColumn(name = "cuidador_id")
    private Cuidador cuidador;

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }
}
