package demo.controller;

import demo.configure.MQConfiguration;
import org.jboss.logging.annotations.Param;
import org.springframework.amqp.core.ReceiveAndReplyCallback;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by swift on 15/9/15.
 */
@RestController
public class MessegeController {
    @Autowired
    RabbitTemplate rabbitMessagingTemplate;

    @RequestMapping("/sendmessage/{message}")
    public boolean sendmessage(@Param String message) {
        rabbitMessagingTemplate.convertAndSend(MQConfiguration.QUEUE_NAME, message);
        return true;
    }

    @RequestMapping(value = "/getmessage", method = RequestMethod.GET)
    public void getmessage() {
        rabbitMessagingTemplate.receiveAndReply(MQConfiguration.QUEUE_NAME, new ReceiveAndReplyCallback<String, String>() {
                    public String handle(String m) {
                        return m;
                    }
                }
        );
    }

}
