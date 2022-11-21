package kodlama.io.kodlamaiodevs2.business.responses.subTechnology;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CreateSubTechnologyResponse {
    private String name;
    private int id;
    private int programmingLanguageId;
}
