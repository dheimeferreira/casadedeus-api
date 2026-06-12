package com.casadedeus.api;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "membros")
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private LocalDate dataNascimento;
    private String estadoCivil;
    private String telefone;
    private String email;
    private String endereco;
    private Boolean entregouVida;
    private Boolean batizado;
    private Boolean desejaBatizar;
    private Boolean gc;
    private String ministerio;

    // Construtor vazio obrigatório para o JPA
    public Membro() {}

    // GETTERS E SETTERS
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
    public String getEstadoCivil() { return estadoCivil; }
    public void setEstadoCivil(String estadoCivil) { this.estadoCivil = estadoCivil; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public Boolean getEntregouVida() { return entregouVida; }
    public void setEntregouVida(Boolean entregouVida) { this.entregouVida = entregouVida; }
    public Boolean getBatizado() { return batizado; }
    public void setBatizado(Boolean batizado) { this.batizado = batizado; }
    public Boolean getDesejaBatizar() { return desejaBatizar; }
    public void setDesejaBatizar(Boolean desejaBatizar) { this.desejaBatizar = desejaBatizar; }
    public Boolean getGc() { return gc; }
    public void setGc(Boolean gc) { this.gc = gc; }
    public String getMinisterio() { return ministerio; }
    public void setMinisterio(String ministerio) { this.ministerio = ministerio; }
}
