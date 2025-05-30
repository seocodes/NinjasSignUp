package com.seocodes.NinjasSignUp.Ninjas;

import com.seocodes.NinjasSignUp.Missions.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity transforma uma classe em uma entidade do DB
//JPA = Java Persistence API
@Entity
@Table(name="tb_signup")
@NoArgsConstructor
@AllArgsConstructor
//faz os getters e setters
@Data
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    //@ManyToOne - um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missions_id") //FOREIGN KEY!!!
    private MissionModel missions;
}
