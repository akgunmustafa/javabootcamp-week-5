package kodlama.io.kodlamaiodevs2.business.responses.subTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class GetByIdSubTechnologyResponse {
    private int id;
    private String name;
    private int programmingLanguageId;
}
