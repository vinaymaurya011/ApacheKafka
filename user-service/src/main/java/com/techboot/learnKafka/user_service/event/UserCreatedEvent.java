package com.techboot.learnKafka.user_service.event;

import lombok.Data;

@Data
public class UserCreatedEvent {
    private Long id;
    private String email;
}
