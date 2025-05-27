package com.seocodes.NinjasSignUp.Missions;

import com.seocodes.NinjasSignUp.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_mission")
public class MissionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //@OneToMany - uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missions")
    private List<NinjaModel> ninjas;

    public MissionModel(){}

    public MissionModel(String nome, String dificuldade){
        this.nome = nome;
        this.dificuldade = dificuldade;
    }
}
