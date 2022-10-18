import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

@Component
@Path("/")
public class RestApi {

        @Inject
        PrepDao prepDao;

        @GET
        @Path("/properties")
        @Produces({MediaType.APPLICATION_JSON})
        public List<PrepDto> getPrepInfo() {
            return prepDao.getPrepData();
        }

        @GET
        @Path("/test")
        @Produces({MediaType.APPLICATION_JSON})
        public PrepDto getTestMessage() {
                return prepDao.getTest();
        }
}
