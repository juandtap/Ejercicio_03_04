/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ups.ejercicio_03_04.Service;

import java.util.List;
import ups.ejercicio_03_04.Model.Departamento;

/**
 *
 * @author Diego
 */
public interface IDepartamentoService {
    public Departamento crearDepartamento(Departamento departamento);
    public List<Departamento> listarDepartamentos();
    public Departamento getDepartamentoByCode(int codigo);
    public void actualizarDepartamenti(int codigo, Departamento departamento);
    public Departamento eliminarDepartamento(int codigo);
    public int getPositionDepartaento(Departamento departamento);
}
