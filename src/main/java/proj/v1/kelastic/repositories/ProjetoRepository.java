package proj.v1.kelastic.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import proj.v1.kelastic.entities.Projeto;

public interface ProjetoRepository extends ElasticsearchRepository<Projeto, Integer> {

}
