package hotelsi.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import hotelsi.객실팀Application;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "객실_table")
@Data
//<<< DDD / Aggregate Root
public class 객실 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static 객실Repository repository() {
        객실Repository 객실Repository = 객실팀Application.applicationContext.getBean(
            객실Repository.class
        );
        return 객실Repository;
    }

    //<<< Clean Arch / Port Method
    public static void 객실상태변경(객실예약됨 객실예약됨) {
        //implement business logic here:

        /** Example 1:  new item 
        객실 객실 = new 객실();
        repository().save(객실);

        */

        /** Example 2:  finding and process
        
        // if 객실예약됨.pgId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> 예약관리Map = mapper.convertValue(객실예약됨.getPgId(), Map.class);

        repository().findById(객실예약됨.get???()).ifPresent(객실->{
            
            객실 // do something
            repository().save(객실);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
