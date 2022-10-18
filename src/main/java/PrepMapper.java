import javax.swing.tree.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class PrepMapper implements RowMapper<PrepDto> {

    @Override
    public PrepDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        return PrepDto.builder()
                .uuid(UUID.fromString(rs.getString("uuid")))
                .name(rs.getString("name"))
                .build();
    }

}
