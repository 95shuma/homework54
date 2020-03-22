package com.homew54.demo.dto;

import com.homew54.demo.model.SubscribeToEvent;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class SubscribeToEventDTO {
    String id;
    String eventId;
    String mail;
    LocalDateTime dateRegistration;

    public static SubscribeToEventDTO from(SubscribeToEvent ste){
        return builder()
                .id(ste.getId())
                .eventId(ste.getEvent().getId())
                .mail(ste.getMail())
                .dateRegistration(ste.getDateRegistration())
                .build();
    }
}
