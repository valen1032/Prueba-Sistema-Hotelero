package com.example.Sistema_hotelero.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Personas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SedeModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private int idSed;
    @Column (length = 45)
    private String TipoAloja;
    @Column (length = 45)
    private int CantPersonas;
    @Column (length = 45)
    private String Ciudad;


    //Valentina Peña Carvajal
    //3223387388
    //valentykar@live.com
}
