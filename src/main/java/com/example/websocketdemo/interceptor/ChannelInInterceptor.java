package com.example.websocketdemo.interceptor;

import com.example.websocketdemo.common.WebSocketConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageType;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.ChannelInterceptorAdapter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class ChannelInInterceptor extends ChannelInterceptorAdapter {
    private static final Logger log = LoggerFactory.getLogger(ChannelInInterceptor.class);
    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        MessageHeaders headers = message.getHeaders();
        SimpMessageType messageType = SimpMessageHeaderAccessor.getMessageType(headers);

        log.info("in-message:{}",message);
        log.info("in-messageType:{}",messageType);
        StompHeaderAccessor sha = StompHeaderAccessor.wrap(message);
        Object sessionId = sha.getSessionAttributes().get(WebSocketConstant.WS_SESSION);
        if(StringUtils.isEmpty(sessionId)){
            return null;
        }

        return message;
    }
}
