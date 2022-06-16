/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_04.Service;

import java.util.ArrayList;
import java.util.List;
import ups.ejercicio_03_04.Model.Departamento;
import ups.ejercicio_03_04.Model.Empleado;

/**
 *
 * @author Diego
 */
public class DepartamentoService implements IDepartamentoService{
    
    private static final List<Departamento> listaDepartamentos = new ArrayList<>();

    @Override
    public Departamento crearDepartamento(Departamento departamento) {
        listaDepartamentos.add(departamento);
        return departamento;
    }

    @Override
    public List<Departamento> listarDepartementos() {
       return listaDepartamentos;
    }

    @Override
    public Departamento getDepartamentoByCode(int codigo) {
        for(Departamento dep : listaDepartamentos){
            if(dep.getCodigo() == codigo){
                return dep;
            }
        }
        return null;
    }
    
    public void asignarGerente(int codigo, Empleado empleado){
        getDepartamentoByCode(codigo).asignarGerente(empleado);
        
    }

    @Override
    public void actualizarDepartamenti(int codigo, Departamento departamentoNew) {
       int posicion = getPositionDepartaento(getDepartamentoByCode(codigo));
       listaDepartamentos.get(posicion).setNombre(departamentoNew.getNombre());
       listaDepartamentos.get(posicion).asignarGerente(departamentoNew.getGerente());
       listaDepartamentos.get(posicion).setEmpresa(departamentoNew.getEmpresa());
       listaDepartamentos.get(posicion).setUbicacion(departamentoNew.getUbicacion());
    }

    @Override
    public Departamento eliminarDepartamento(int codigo) {
       var posicion = getPositionDepartaento(getDepartamentoByCode(codigo));
       return listaDepartamentos.remove(posicion);
    }

    @Override
    public int getPositionDepartaento(Departamento departamento) {
        for (int i = 0; i < listaDepartamentos.size(); i++) {
            if (departamento.getCodigo() == listaDepartamentos.get(i).getCodigo()) {
                return i;
            }
        }
        return -1;
    }
    
    
    
}
