package hotelsi.infra;

import hotelsi.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "객실조회", path = "객실조회")
public interface 객실조회Repository
    extends PagingAndSortingRepository<객실조회, Long> {}
