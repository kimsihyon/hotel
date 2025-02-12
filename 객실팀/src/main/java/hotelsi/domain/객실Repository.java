package hotelsi.domain;

import hotelsi.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "객실", path = "객실")
public interface 객실Repository
    extends PagingAndSortingRepository<객실, Long> {}
