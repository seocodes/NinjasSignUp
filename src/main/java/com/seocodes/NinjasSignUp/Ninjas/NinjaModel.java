package com.seocodes.NinjasSignUp.Ninjas;

import com.seocodes.NinjasSignUp.Missions.MissionModel;
import jakarta.persistence.*;

import java.util.List;

//Entity transforma uma classe em uma entidade do DB
//JPA = Java Persistence API
@Entity
@Table(name="tb_signup")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private List<MissionModel> missions;

    public NinjaModel(){}

    public NinjaModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
