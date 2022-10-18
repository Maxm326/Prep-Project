import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("/")
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
