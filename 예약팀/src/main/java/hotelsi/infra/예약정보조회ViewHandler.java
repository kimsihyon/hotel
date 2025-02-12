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
public class 예약정보조회ViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private 예약정보조회Repository 예약정보조회Repository;
    //>>> DDD / CQRS
}
