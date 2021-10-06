package academy.devdojo.springboot2.requests;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AnimePostRequestBody {
    @NotEmpty(message = "The name cannot be empty")
    @NotNull(message = "The name cannot be null")
    private String name;
    
}
