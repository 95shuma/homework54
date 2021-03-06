package com.homew54.demo.controller;

import com.homew54.demo.dto.SubscribeToEventDTO;
import com.homew54.demo.service.SubscribeToEventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscribe")
public class SubscribeToEventController {

    SubscribeToEventService stes;

    public SubscribeToEventController(SubscribeToEventService stes) {
        this.stes = stes;
    }

    @PostMapping("/eventId/{eventId}/mail/{mail}")
    public String createSub(@PathVariable("eventId") String eventId,
                            @PathVariable("mail") String mail){
        return stes.createSub(eventId,mail);
    }

    @PostMapping("/all/mail/{mail}")
    public List<SubscribeToEventDTO> findAllSub(@PathVariable("mail") String mail){
        return stes.findAllSubByMail(mail);
    }

    @DeleteMapping("/delete/eventId/{eventId}/mail/{mail}")
    public void cancelSub(@PathVariable("eventId") String eventId,
                          @PathVariable("mail") String mail){
        stes.cancelSub(eventId,mail);
    }
}
