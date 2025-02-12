package hotelsi.domain;

import hotelsi.domain.*;
import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "사용자", path = "사용자")
public interface 사용자Repository
    extends PagingAndSortingRepository<사용자, Long> {}
