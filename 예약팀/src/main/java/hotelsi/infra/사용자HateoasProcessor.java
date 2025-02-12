package hotelsi.infra;

import hotelsi.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 사용자HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<사용자>> {

    @Override
    public EntityModel<사용자> process(EntityModel<사용자> model) {
        return model;
    }
}
