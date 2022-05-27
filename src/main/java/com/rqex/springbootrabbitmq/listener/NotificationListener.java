package com.rqex.springbootrabbitmq.listener;

import com.rqex.springbootrabbitmq.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    //process
    @RabbitListener
    public void handleMessage(Notification notification){
        System.out.println(notification.toString());
    }
}
