package com.example.userservice.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Greeting {
    public static String message;
    public static String url;

    @Value("${greeting.message}")
    public static void setMessage(String value) {
        Greeting.message = value;
    }

    @Value("${order_service.url}")
    public static void setUrl(String value) {
        Greeting.url = value;
    }
}
