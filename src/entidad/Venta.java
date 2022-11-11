/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Date;
import java.util.List;

/**
 *
 * @author rena_
 */
public class Venta {
    private int id;
    private int usuarioID;
    private String usuarioNombre;
    private int personaID;
    private String personaNombre;
    private String tipoComprobante;
    private String serieComprobante;
    private String nroComprobante;
    private Date fecha;
    private double impuesto;
    private double total;
    private String estado;
    private List<DetalleVenta> detalles;

    public Venta() {
    }

    public Venta(int id, int usuarioID, String usuarioNombre, int personaID, String personaNombre, String tipoComprobante, String serieComprobante, String nroComprobante, Date fecha, double impuesto, double total, String estado) {
        this.id = id;
        this.usuarioID = usuarioID;
        this.usuarioNombre = usuarioNombre;
        this.personaID = personaID;
        this.personaNombre = personaNombre;
        this.tipoComprobante = tipoComprobante;
        this.serieComprobante = serieComprobante;
        this.nroComprobante = nroComprobante;
        this.fecha = fecha;
        this.impuesto = impuesto;
        this.total = total;
        this.estado = estado;
    }
    

    public Venta(int id, int usuarioID, String usuarioNombre, int personaID, String personaNombre, String tipoComprobante, String serieComprobante, String nroComprobante, Date fecha, double impuesto, double total, String estado, List<DetalleVenta> detalles) {
        this.id = id;
        this.usuarioID = usuarioID;
        this.usuarioNombre = usuarioNombre;
        this.personaID = personaID;
        this.personaNombre = personaNombre;
        this.tipoComprobante = tipoComprobante;
        this.serieComprobante = serieComprobante;
        this.nroComprobante = nroComprobante;
        this.fecha = fecha;
        this.impuesto = impuesto;
        this.total = total;
        this.estado = estado;
        this.detalles = detalles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public int getPersonaID() {
        return personaID;
    }

    public void setPersonaID(int personaID) {
        this.personaID = personaID;
    }

    public String getPersonaNombre() {
        return personaNombre;
    }

    public void setPersonaNombre(String personaNombre) {
        this.personaNombre = personaNombre;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getSerieComprobante() {
        return serieComprobante;
    }

    public void setSerieComprobante(String serieComprobante) {
        this.serieComprobante = serieComprobante;
    }

    public String getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(String nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }
    
}
