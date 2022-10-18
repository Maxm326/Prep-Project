import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/")
@Slf4j
public class RestApi {

        @Autowired
        PrepDao prepDao;

        @GET
        @Path("/properties")
        @Produces({MediaType.APPLICATION_JSON})
        public List<PrepDto> getPrepInfo() {
            return prepDao.getPrepData();
        }
}
