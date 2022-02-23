package com.example.paygramtest;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class PaygramTestBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return null;
    }

    @Override
    public String getBotToken() {
        return null;
    }

    @Override
    public void onUpdateReceived(Update update) {
        try {
            if (update.hasMessage()) {
                String message = update.getMessage().getText();
                switch (message) {
                    case "/start":
                        break;
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
