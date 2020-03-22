package com.homew54.demo.repository;

import com.homew54.demo.model.SubscribeToEvent;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import springfox.documentation.annotations.ApiIgnore;

public interface SubscribeToEventRepository extends PagingAndSortingRepository<SubscribeToEvent,String> {
    boolean existsSubscribeToEventByEventIdAndMail(String id, String mail);

    void deleteSubscribeToEventByEventIdAndMail(String id, String mail);

    Iterable<SubscribeToEvent> findSubscribeToEventsByMail(String mail);
}
