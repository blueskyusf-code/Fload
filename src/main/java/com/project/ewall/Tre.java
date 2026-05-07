package com.project.ewall;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.util.List;

public class Tre {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        
        FileReader reader = new FileReader("tre1.json");
        
        
        List<DadosTreino> lista = gson.fromJson(reader, new TypeToken<List<DadosTreino>>(){}.getType());

        for (DadosTreino item : lista) {
            System.out.println("Ensinando: " + item.Pergunta + " -> " + item.Resposta);
            
        }
    }
}

class DadosTreino {
    String Pergunta;
    String Resposta;
}
