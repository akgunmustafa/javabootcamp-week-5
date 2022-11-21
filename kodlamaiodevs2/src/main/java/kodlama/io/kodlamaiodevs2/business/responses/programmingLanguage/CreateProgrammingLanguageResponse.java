package kodlama.io.kodlamaiodevs2.business.responses.programmingLanguage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateProgrammingLanguageResponse {
    private int id;
    private String name;
    private int programmingLanguageId;
}
