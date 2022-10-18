import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

@Component
public class PrepDao {
    @Inject
    JdbcTemplate jdbcTemplate;


    public List<PrepDto> getPrepData() {
        return jdbcTemplate.query("select * from property", new PrepMapper());
    }

    public PrepDto getTest() {
        return PrepDto.builder()
                .name("Test 1 2 3")
                .build();
    }
}
