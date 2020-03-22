package com.homew54.demo.model;

import com.homew54.demo.util.Generator;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "subscribeToEvents")
@Data
@Builder
public class SubscribeToEvent {
    String id;
    @DBRef
    Event event;
    String mail;
    LocalDateTime dateRegistration;

    public static SubscribeToEvent addSub(Event event){
        return builder()
                .event(event)
                .mail(Generator.makeEmail())
                .dateRegistration(LocalDateTime.now())
                .build();
    }
}
