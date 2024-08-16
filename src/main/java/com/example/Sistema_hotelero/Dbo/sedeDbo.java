package com.example.Sistema_hotelero.Dbo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class sedeDbo {

    private int idSed;
    private String TipoAloja;
    private int CantPersonas;
    private String Ciudad;
}

