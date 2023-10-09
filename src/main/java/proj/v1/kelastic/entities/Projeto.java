package proj.v1.kelastic.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(indexName = "projetos")
public class Projeto {
    private int id;
    private String title;
    private int page;
    private String content;

}
