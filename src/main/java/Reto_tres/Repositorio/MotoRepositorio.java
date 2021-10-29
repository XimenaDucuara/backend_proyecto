/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto_tres.Repositorio;

import Reto_tres.Interface.InterfaceMoto;
import Reto_tres.Modelo.Moto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class MotoRepositorio {

    @Autowired
    private InterfaceMoto crud;

    public List<Moto> getAll() {
        return (List<Moto>) crud.findAll();
    }

    public Optional<Moto> getMoto(int id) {
        return crud.findById(id);
    }

    public Moto save(Moto moto) {
        return crud.save(moto);
    }

    public void delete(Moto moto) {
        crud.delete(moto);
    }

}