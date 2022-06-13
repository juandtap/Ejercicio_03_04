/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_03.Service;

import java.util.ArrayList;
import java.util.List;
import ups.ejercicio_03_03.Model.Departamento;
import ups.ejercicio_03_03.Model.Empleado;

/**
 *
 * @author Diego
 */
public class DepartamentoService implements IDepartamentoService{
    
    private final List<Departamento> listaDepartamentos = new ArrayList<>();

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
    
}
