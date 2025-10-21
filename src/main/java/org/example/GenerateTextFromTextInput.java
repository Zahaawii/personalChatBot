package org.example;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

import java.util.Scanner;

public class GenerateTextFromTextInput {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to ask");
        String question = scanner.nextLine();

        System.out.println("Waiting for response");
        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash",
                        question,
                        null);

        System.out.println(response.text());
    }
}