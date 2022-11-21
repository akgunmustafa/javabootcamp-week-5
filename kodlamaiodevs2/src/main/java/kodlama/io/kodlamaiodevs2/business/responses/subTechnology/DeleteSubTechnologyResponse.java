package kodlama.io.kodlamaiodevs2.business.responses.subTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DeleteSubTechnologyResponse {
    private String name;
    private int id;
    private int programmingLanguageId;
}
