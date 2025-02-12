package hotelsi.infra;

import hotelsi.config.kafka.KafkaProcessor;
import hotelsi.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class 객실조회ViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private 객실조회Repository 객실조회Repository;
    //>>> DDD / CQRS
}
