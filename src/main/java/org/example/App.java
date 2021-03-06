package org.example;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;

public class App {
    static String token = System.getProperty("token");

    static {
        if (token == null) {
            token = System.getenv("token");
        }
    }
    //для к
    static TelegramBot bot = new TelegramBot(token);
    static String chatId = System.getenv("chatId");

    public static void main(String[] args) {


        SendMessage sendMessage = new SendMessage(chatId, "привет Hello");
        bot.execute(sendMessage);
        System.out.println("Сообщение отправлено");
    }
}
