package com.seocodes.NinjasSignUp.Missions;

import com.seocodes.NinjasSignUp.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name="tb_mission")
public class MissionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private NinjaModel ninja;

    public MissionModel(){}

    public MissionModel(String nome, String dificuldade){
        this.nome = nome;
        this.dificuldade = dificuldade;
    }
}
