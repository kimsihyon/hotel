package hotelsi.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import hotelsi.config.kafka.KafkaProcessor;
import hotelsi.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='객실예약됨'"
    )
    public void whenever객실예약됨_객실상태변경(
        @Payload 객실예약됨 객실예약됨
    ) {
        객실예약됨 event = 객실예약됨;
        System.out.println(
            "\n\n##### listener 객실상태변경 : " + 객실예약됨 + "\n\n"
        );

        // Sample Logic //
        객실.객실상태변경(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
