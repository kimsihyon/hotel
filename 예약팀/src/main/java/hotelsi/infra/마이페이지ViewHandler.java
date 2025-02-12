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
public class 마이페이지ViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private 마이페이지Repository 마이페이지Repository;
    //>>> DDD / CQRS
}
