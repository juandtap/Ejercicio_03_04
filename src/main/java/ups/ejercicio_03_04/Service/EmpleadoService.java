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
public class EmpleadoService implements IEmpleadoService{
    private final List<Empleado> listaEmpleados = new ArrayList<>();

    @Override
    public Empleado crearEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        return empleado;
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return listaEmpleados;
    }

    @Override
    public Empleado getEmpleadoByCedula(String cedula) {
        for (Empleado emp : listaEmpleados) {
            if(emp.getCedula().equals(cedula)){
                return emp;
            }
        }
        return null;
    }
    
    public void asignarDepartamento(String cedula, Departamento departamento){
        getEmpleadoByCedula(cedula).asignarDepartamento(departamento);
    }
    
    
}
