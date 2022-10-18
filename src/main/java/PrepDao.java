import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrepDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<PrepDto> getPrepData() {
        return jdbcTemplate.query("select * from property", new PrepMapper());
    }
}
