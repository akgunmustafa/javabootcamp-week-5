package kodlama.io.kodlamaiodevs2.business.responses.programmingLanguage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class GetByIdProgrammingLanguageResponse {
    private String name;
    private int id;
}
