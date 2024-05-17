package com.event.app.Listener;


import com.event.app.Event.UserRegisterEvent;
import com.event.app.Event.UserValidateEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
//lee el evento de los componentes siertos eventos pueden retornar otros eventos
public class UserListener {


@EventListener
//retorno un evento
    public UserValidateEvent UserListener(UserRegisterEvent userRegisterEvent) {
            System.out.println("Event has been listened UserListener" + userRegisterEvent.toString());
            return new UserValidateEvent(userRegisterEvent.getUserName(),true );
    }

@EventListener
    public void listenerUserValidateEvent (UserValidateEvent userValidateEvent) {
    System.out.println("Event has been listened listenerUserValidateEvent" + userValidateEvent.toString());

}

}
