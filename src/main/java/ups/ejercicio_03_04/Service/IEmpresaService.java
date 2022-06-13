/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ups.ejercicio_03_03.Service;

import java.util.List;
import ups.ejercicio_03_03.Model.Empresa;

/**
 *
 * @author Diego
 */
public interface IEmpresaService {
    public Empresa crearEmpresa(Empresa empresa);
    public List<Empresa> listarEmpresas();
    public Empresa getEmpresaByCode(int codigo);
    
}
