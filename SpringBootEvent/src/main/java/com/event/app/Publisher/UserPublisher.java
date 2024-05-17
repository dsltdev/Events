package com.event.app.Publisher;

import com.event.app.Event.UserRegisterEvent;
import com.event.app.Event.UserValidateEvent;
import jdk.jfr.Event;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
//publica evento en el contexto de spring
public class UserPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public UserPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }


    public void publishUserRegisterEvent(String userName,String password,byte age) {
        System.out.println("Publishing user event: publishUserRegisterEvent"  );
        applicationEventPublisher.publishEvent(new UserRegisterEvent(userName,password,age));
    }

    public void publishUserValidateEvent(String userName,boolean isValid) {
        System.out.println("Publishing user event: publishUserValidateEvent" );
        applicationEventPublisher.publishEvent(new UserValidateEvent(userName,isValid));
    }

}
