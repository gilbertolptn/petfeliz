package br.com.tt.petfeliz.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_raca")
public class Raca {

    Raca() {}

    public Raca(Long id, String descricao, TipoAnimal tipo) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
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

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }
}
