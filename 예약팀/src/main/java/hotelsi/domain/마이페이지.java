package hotelsi.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "마이페이지_table")
@Data
public class 마이페이지 {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
