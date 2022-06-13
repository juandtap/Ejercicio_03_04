/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ups.ejercicio_03_03.Service;

import java.util.List;
import ups.ejercicio_03_03.Model.Empleado;

/**
 *
 * @author Diego
 */
public interface IEmpleadoService {
    public Empleado crearEmpleado(Empleado empleado);
    public List<Empleado> listarEmpleados();
    public Empleado getEmpleadoByCedula(String cedula);
    
}
