package com.stackleader;

import lombok.*;

@Data
@Builder
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class PrepDto {
        String uuid;
        String name;
}
