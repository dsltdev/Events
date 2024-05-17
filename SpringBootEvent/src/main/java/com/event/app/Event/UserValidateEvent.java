package com.event.app.Event;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserValidateEvent {

    private String userName;
    private boolean isValid;
}
