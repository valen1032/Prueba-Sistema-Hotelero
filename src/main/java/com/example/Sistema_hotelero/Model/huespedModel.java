package com.example.Sistema_hotelero.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Huesped")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class huespedModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column (length = 45)
    private String Nombre;
    @Column (length = 45)
    private String Apellido;
    @Column (length = 45)
    private String Email;
    @Column (length = 45)
    private String Ciudad;


    //Valentina Peña Carvajal
    //3223387388
    //valentykar@live.com
}
