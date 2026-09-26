package br.com.vemproracha.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
//anotacoes do spring dizer que essa classa faz parte do db e é uma tablea dentro do Mysql
@Entity
@Table(name = "usuario")
public class Usuario {
    //Aqui é o id ele tem essas configuracoes porque ele é auto gereado, a gente não define ele
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // define a coluna de nome e fala que nn pode ser null  e sua length
    @Column(nullable = false, length = 100)
    private String nome;
    // define a coluna email que é unique (constraint)
    @Column(nullable = false, unique = true, length = 150)
    private String email;
    // a coluna senha
    @Column(nullable = false, length = 100)
    private String senha;
    //define a coluna criaodoem
    @Column(name = "criado_em", nullable = false)
    private LocalDateTime criadoEm;

    protected Usuario() {
    } // esse a aqui é um construtor vazio exigido pelo JPA

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.criadoEm = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }
}

