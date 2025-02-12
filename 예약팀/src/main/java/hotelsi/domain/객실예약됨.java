package hotelsi.domain;

import hotelsi.domain.*;
import hotelsi.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class 객실예약됨 extends AbstractEvent {

    private Long id;

    public 객실예약됨(예약관리 aggregate) {
        super(aggregate);
    }

    public 객실예약됨() {
        super();
    }
}
//>>> DDD / Domain Event
