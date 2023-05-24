/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1;

/**
 *
 * @author guerig
 */
public class Deportivo {

    private int codigo;
    private String instalacion;
    private String provincia;
    private String municipio;
    private String nombre;
    private String codPostal;
    private String espacioDep;

    public Deportivo() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getEspacioDep() {
        return espacioDep;
    }

    public void setEspacioDep(String espacioDep) {
        this.espacioDep = espacioDep;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Deportivo other = (Deportivo) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deportivo{");
        sb.append("codigo=").append(codigo);
        sb.append(", instalacion=").append(instalacion);
        sb.append(", provincia=").append(provincia);
        sb.append(", municipio=").append(municipio);
        sb.append(", nombre=").append(nombre);
        sb.append(", codPostal=").append(codPostal);
        sb.append(", espacioDep=").append(espacioDep);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}



