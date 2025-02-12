package hotelsi.infra;

import hotelsi.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/사용자")
@Transactional
public class 사용자Controller {

    @Autowired
    사용자Repository 사용자Repository;
}
//>>> Clean Arch / Inbound Adaptor
