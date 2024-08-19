package co.edu.ue.model;

public class Municipio {
    private String region;
    private String departamento;
    private String municipio;
    private int codDepartamento;

    public Municipio(String region, String departamento, String municipio, int codDepartamento) {
        super();

        this.region = region;
        this.departamento = departamento;
        this.municipio = municipio;
        this.codDepartamento = codDepartamento;

    }
    
    public Municipio(){
        super();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDepartamento() {
        return departamento;
    }
}
