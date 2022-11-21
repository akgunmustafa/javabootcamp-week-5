package kodlama.io.kodlamaiodevs2.business.requests.programmingLanguage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UpdateProgrammingLanguageRequest {
    private String name;
    private int id;
}
