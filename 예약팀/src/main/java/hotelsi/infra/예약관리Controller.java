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
// @RequestMapping(value="/예약관리")
@Transactional
public class 예약관리Controller {

    @Autowired
    예약관리Repository 예약관리Repository;
}
//>>> Clean Arch / Inbound Adaptor
