package com.example.Sistema_hotelero.Dbo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class reservaDbo {

    private int idReserv;
    private double tarifa;
    private Date Fecha;
    private String Temporada;

}