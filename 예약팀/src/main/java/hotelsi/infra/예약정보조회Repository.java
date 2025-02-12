package hotelsi.infra;

import hotelsi.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "예약정보조회",
    path = "예약정보조회"
)
public interface 예약정보조회Repository
    extends PagingAndSortingRepository<예약정보조회, Long> {}
