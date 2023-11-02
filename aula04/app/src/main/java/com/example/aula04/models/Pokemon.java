package com.example.aula04.models;

import com.example.aula04.Config;

public class Pokemon {

    public String nome;
    public String url;

    public String imagem(){
        return "https://raw.githubusercontent.com/PokeAPI/" + "" +
                "sprites/master/sprites/pokemon/other/home/" + id() + ".png";
    }
    public int id(){
        if (url != null){
            String codigo = url.replace(Config.linkService, "") .replace("/", "");
            return Integer.parseInt(codigo);
        }
        return 0;
    }


}

