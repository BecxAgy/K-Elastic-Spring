package proj.v1.kelastic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.v1.kelastic.entities.Projeto;
import proj.v1.kelastic.repositories.ProjetoRepository;

import java.util.List;
@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public Iterable<Projeto> getAll(){
        return  projetoRepository.findAll();

    }

    public void insert(Projeto projeto){
        projetoRepository.save(projeto);
    }

    public Projeto update(Projeto projeto, int id){
        Projeto proj = projetoRepository.findById(id).get();
        proj.setTitle(projeto.getTitle());
        return proj;
    }

    public void delete(int id){
        projetoRepository.deleteById(id);
    }
}
