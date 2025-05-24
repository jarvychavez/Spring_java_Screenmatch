package com.aluracursos.screenmatch.principal;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class EjemploStreams{

        public void muestraEjemplo(){
            List<String> nombres = Arrays.asList("Brenda","Luis","Maria Fernanda","Eric","Genesys");

            nombres.stream()
                    .sorted()
                    .limit(2)
                    .filter(n->n.startsWith("B"))
                    .map(n->n.toUpperCase())
                    .forEach(System.out::println);
        }
    }

