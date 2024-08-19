package co.edu.ue.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import co.edu.ue.model.Course;
import co.edu.ue.service.CourseService;


@RestController
public class MunicipioController {

    @Autowired
    MunicipioServiceI service;

    @GetMapping(value = "municipios", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Municipio> municipios() {
        return service.listMunicipios();
    }

    @GetMapping (value = "municipios/{departamento}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Municipio> munucipios(@PathVariable("departamento") String depart){
        return service.searchDepartamento(depart);
    }

}
