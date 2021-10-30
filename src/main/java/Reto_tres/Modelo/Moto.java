/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto_tres.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "motorbike")
public class Moto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   /**
     * Variable id
     */
    private Integer id;
    /**
     * Variable name
     */
    @Column(length =45 )
    private String name;
    /**
     * Variable brand
     */
    @Column(length =45 )
    private String brand;
    /**
     * Variable year
     */
    @Column(length =4 )
    private Integer year;
    /**
     * Variable description
     */
    @Column(length =250 )
    private String description;
    /**
     * Relacion Muchos a Uno de Ortesis a Categpria
     */
    @ManyToOne
    @JoinColumn(name = "categoryid")
    @JsonIgnoreProperties("motorbikes")
    private Categoria category;
    /**
     * Relacion Uno a Muchos de Ortopedic a Mensajes
     */
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "motorbike")
    @JsonIgnoreProperties({"motorbike", "client"})
    private List<Mensaje> messages;
    /**
     * Relacion Uno a Muchos de Ortopedic a Reservaciones
     */
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "motorbike")
    @JsonIgnoreProperties({"motorbike", "message"})
    public List<Reservacion> reservations;
    
    /**
     * 
     * @return 
     */
    public Integer getId() {
        return id;
    }
    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * 
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 
     * @return 
     */
    public String getBrand() {
        return brand;
    }
    /**
     * 
     * @param brand 
     */

    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     * 
     * @return 
     */
    public Integer getYear() {
        return year;
    }
    /**
     * 
     * @param year 
     */
    public void setYear(Integer year) {
        this.year = year;
    }
    /**
     * 
     * @return 
     */
    public String getDescription() {
        return description;
    }
    /**
     * 
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * 
     * @return 
     */
    public Categoria getCategory() {
        return category;
    }
    /**
     * 
     * @param category 
     */
    public void setCategory(Categoria category) {
        this.category = category;
    }
    /**
     * 
     * @return 
     */
    public List<Mensaje> getMessages() {
        return messages;
    }
    /**
     * 
     * @param messages 
     */
    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }
    /**
     * 
     * @return 
     */
    public List<Reservacion> getReservations() {
        return reservations;
    }
    
    /**
     * 
     * @param reservations 
     */
    public void setReservations(List<Reservacion> reservations) {
        this.reservations = reservations;
    }
    
}
