package com.example.Sistema_hotelero.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Personas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class reservaModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private int idReserv;
    @Column (length = 45)
    private double tarifa;
    @Column (length = 45)
    private Date Fecha;
    @Column (length = 45)
    private String Temporada;

    //Valentina Peña Carvajal
    //3223387388
    //valentykar@live.com
}
