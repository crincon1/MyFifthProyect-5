package co.edu.ue.service;

import java.util.List;
import java.util.stream.Collectors;

import co.edu.ue.model.Municipio;

public class MunicipioService implements MunicipioServiceI {

    final String URL = "https://www.datos.gov.co/resource/xdk5-pm3f.json";
    @Autowired
    RestTemplate template;

    @Override
    public List<Municipio> listMunicipios() {

        String response = template.getForObject(URL, String.class);
        Municipio municipio;
        ObjectMapper mapper = new ObjectMapper();
        List<Municipio> municipios = new ArrayList<>();
        ArrayNode array;
        try{
            array = (ArrayNode) mapper.readValue(response);
            for(Object obj:array){
                ObjectNode json = (ObjectNode) obj;
                municipio = new Municipio(json.get("region").asText(), json.get("departamento").asText(), json.get("municipio").asText(), json.get("c_digo_dane_del_departamento").asInt());
                municipios.add(municipio);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return municipios;
    }
    @Override
    public List<Municipio> searchDepartamento(String name){
        return listMunicipios().stream().filter(m->m.getDepartamento().equals(name)).collect(Collectors.toList());;
    }

}
