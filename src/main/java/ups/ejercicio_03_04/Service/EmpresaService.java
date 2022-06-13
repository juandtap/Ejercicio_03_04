/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_03.Service;

import java.util.ArrayList;
import java.util.List;
import ups.ejercicio_03_03.Model.Empresa;

/**
 *
 * @author Diego
 */
public class EmpresaService implements IEmpresaService{
    
    private final List<Empresa> listaEmpresas = new ArrayList<>();

    @Override
    public Empresa crearEmpresa(Empresa empresa) {
        listaEmpresas.add(empresa);
        return empresa;
    }

    @Override
    public List<Empresa> listarEmpresas() {
        return listaEmpresas;
    }

    @Override
    public Empresa getEmpresaByCode(int codigo) {
        for (Empresa emp: listaEmpresas){
            if (emp.getCodigo() == codigo){
                return emp;
            }
        }
        return null;
    }
    
}
