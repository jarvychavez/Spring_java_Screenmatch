package com.aluracursos.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obtenerTraduccion(String texto) {
        OpenAiService service = new OpenAiService("TU-API-KEY");//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

        CompletionRequest requisicion = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduce a español el siguiente texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var respuesta = service.createCompletion(requisicion);
        return respuesta.getChoices().get(0).getText();
    }

}

//ocupamos premium para que sirva la APIKEY.
//"TU-API-KEY"