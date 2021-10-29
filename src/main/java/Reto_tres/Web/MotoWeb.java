/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto_tres.Web;

import Reto_tres.Modelo.Moto;
import Reto_tres.Servicios.ServiciosMoto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/api/Motorbike")
public class MotoWeb {

    @GetMapping("/holaMundo")
    public String saludad() {
        return "Hola Mundo Tutoria";
    }

    @Autowired
    private ServiciosMoto servicio;

    @GetMapping("all")
    public List<Moto> getMoto() {
        return servicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Moto> getMoto(@PathVariable("id") int idMoto) {
        return servicio.getMoto(idMoto);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Moto save(@RequestBody Moto moto) {
        return servicio.save(moto);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Moto update(@RequestBody Moto moto) {
        return servicio.update(moto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int motoId) {
        return servicio.deleteMoto(motoId);
    }
}
