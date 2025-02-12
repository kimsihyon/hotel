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
@Table(name = "사용자_table")
@Data
//<<< DDD / Aggregate Root
public class 사용자 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static 사용자Repository repository() {
        사용자Repository 사용자Repository = 예약팀Application.applicationContext.getBean(
            사용자Repository.class
        );
        return 사용자Repository;
    }
}
//>>> DDD / Aggregate Root
