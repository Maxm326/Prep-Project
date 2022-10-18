import lombok.*;

import java.util.UUID;


@Data
@Builder
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class PrepDto {
        UUID uuid;
        String name;
}
