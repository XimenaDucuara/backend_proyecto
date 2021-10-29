/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto_tres.Servicios;

import Reto_tres.Modelo.Moto;
import Reto_tres.Repositorio.MotoRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class ServiciosMoto {

    @Autowired
    private MotoRepositorio metodosCrud;

    public List<Moto> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Moto> getMoto(int idMoto) {
        return metodosCrud.getMoto(idMoto);
    }

    public Moto save(Moto moto) {
        if (moto.getId() == null) {
            return metodosCrud.save(moto);
        } else {
            Optional<Moto> evt = metodosCrud.getMoto(moto.getId());
            if (evt.isEmpty()) {
                return metodosCrud.save(moto);
            } else {
                return moto;
            }
        }
    }

    public Moto update(Moto moto) {
        if (moto.getId() != null) {
            Optional<Moto> e = metodosCrud.getMoto(moto.getId());
            if (!e.isEmpty()) {
                if (moto.getName() != null) {
                    e.get().setName(moto.getName());
                }
                if (moto.getBrand() != null) {
                    e.get().setBrand(moto.getBrand());
                }
                if (moto.getYear() != null) {
                    e.get().setYear(moto.getYear());
                }
                if (moto.getDescription() != null) {
                    e.get().setDescription(moto.getDescription());
                }
                if (moto.getCategory() != null) {
                    e.get().setCategory(moto.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            } else {
                return moto;
            }
        } else {
            return moto;
        }
    }

    public boolean deleteMoto(int motoId) {
        Boolean aBoolean = getMoto(motoId).map(moto -> {
            metodosCrud.delete(moto);
            return true;
        }).orElse(false);
        return aBoolean;
    }

}
