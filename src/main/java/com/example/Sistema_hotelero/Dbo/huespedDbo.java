package com.example.Sistema_hotelero.Dbo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class huespedDbo {

    private int id;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Ciudad;

}
