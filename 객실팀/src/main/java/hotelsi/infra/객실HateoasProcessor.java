package hotelsi.infra;

import hotelsi.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 객실HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<객실>> {

    @Override
    public EntityModel<객실> process(EntityModel<객실> model) {
        return model;
    }
}
