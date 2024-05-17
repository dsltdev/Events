package com.event.app.Event;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.ApplicationEvent;

@Data
@AllArgsConstructor

//clase donde se crea el evento
public class UserRegisterEvent  {
    private String userName;
    private String password;
    private byte age;



}
