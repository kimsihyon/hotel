package hotelsi.domain;

import hotelsi.domain.*;
import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "예약관리", path = "예약관리")
public interface 예약관리Repository
    extends PagingAndSortingRepository<예약관리, Long> {}
