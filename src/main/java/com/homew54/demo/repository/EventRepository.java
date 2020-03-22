package com.homew54.demo.repository;

import com.homew54.demo.model.Event;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EventRepository extends PagingAndSortingRepository<Event,String> {
    Event findEventById(String id);
}
