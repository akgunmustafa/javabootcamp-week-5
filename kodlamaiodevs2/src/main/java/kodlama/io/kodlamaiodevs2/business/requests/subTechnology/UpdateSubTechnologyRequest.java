package kodlama.io.kodlamaiodevs2.business.requests.subTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UpdateSubTechnologyRequest {
    private String name;
    private int id;
    private int programmingLanguageID;
}
