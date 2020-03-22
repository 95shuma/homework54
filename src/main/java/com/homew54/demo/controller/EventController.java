package com.homew54.demo.controller;

import com.homew54.demo.dto.EventDTO;
import com.homew54.demo.service.EventService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/event")
public class EventController {
    EventService es;

    public EventController(EventService es) {
        this.es = es;
    }

    @GetMapping("/all")
    public Iterable<EventDTO> findAll(@ApiIgnore Pageable pageable){
        return es.findAllEvent(pageable);
    }
}
