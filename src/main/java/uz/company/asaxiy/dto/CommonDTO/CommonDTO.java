package uz.company.asaxiy.dto.CommonDTO;

import lombok.Getter;
import lombok.Setter;

/**
 * Powered by: Shuxratjon Rayimjonov
 * Date: 19.02.2023 18:58
 */
@Getter
@Setter
public class CommonDTO {

    String id;

    String name;

    public CommonDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
