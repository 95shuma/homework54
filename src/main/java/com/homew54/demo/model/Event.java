package com.homew54.demo.model;

import com.homew54.demo.util.Generator;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "events")
@Data
@Builder
public class Event {
    @Id
    String id;
    LocalDateTime date;
    String name;
    String description;

    public static Event addEvent(LocalDateTime ldt){
        return builder()
                .name(Generator.makeName())
                .date(ldt)
                .description(Generator.makeDescription())
                .build();
    }
}
