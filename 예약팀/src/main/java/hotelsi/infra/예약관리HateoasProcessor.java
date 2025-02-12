package hotelsi.infra;

import hotelsi.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 예약관리HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<예약관리>> {

    @Override
    public EntityModel<예약관리> process(EntityModel<예약관리> model) {
        return model;
    }
}
