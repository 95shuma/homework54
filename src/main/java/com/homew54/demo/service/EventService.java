package com.homew54.demo.service;

import com.homew54.demo.dto.EventDTO;
import com.homew54.demo.model.Event;
import com.homew54.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import springfox.documentation.annotations.ApiIgnore;

@Service
public class EventService {
    @Autowired
    EventRepository er;

    public Iterable<EventDTO> findAllEvent(@ApiIgnore Pageable pageable){
        return er.findAll(pageable).map(EventDTO::from);
    }
}
