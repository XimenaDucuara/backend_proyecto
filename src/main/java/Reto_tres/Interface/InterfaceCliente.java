/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto_tres.Interface;

import Reto_tres.Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ximena
 */
public interface InterfaceCliente extends CrudRepository<Cliente, Integer> {

}
