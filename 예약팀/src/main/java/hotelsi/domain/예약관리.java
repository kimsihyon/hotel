package hotelsi.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import hotelsi.예약팀Application;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "예약관리_table")
@Data
//<<< DDD / Aggregate Root
public class 예약관리 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static 예약관리Repository repository() {
        예약관리Repository 예약관리Repository = 예약팀Application.applicationContext.getBean(
            예약관리Repository.class
        );
        return 예약관리Repository;
    }
}
//>>> DDD / Aggregate Root
