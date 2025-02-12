package hotelsi.infra;

import hotelsi.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "마이페이지",
    path = "마이페이지"
)
public interface 마이페이지Repository
    extends PagingAndSortingRepository<마이페이지, Long> {}
