package org.example;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;

public class App {
    static String token = System.getProperty("token");
    static TelegramBot bot = new TelegramBot(token);
    static String chatId = System.getenv("chatId");

    static {
        if (token == null) {
            token = System.getenv("token");
        }
    }

    public static void main(String[] args) {


        SendMessage sendMessage = new SendMessage(chatId, "привет от CI/CD");
        bot.execute(sendMessage);
        System.out.println("Сообщение отправлено");
    }
}
