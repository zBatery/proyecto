package Clases;

import java.time.LocalDate;

public class Pagos {
    
    private int codigo;
    private LocalDate fecha;
    private Pacientes paciente;
    private Servicios servicio;
    private Usuarios usuario;
    private double total;
    private double recibido;
    private double cambio;

  
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public Servicios getServicio() {
        return servicio;
    }

    public void setServicio(Servicios servicio) {
        this.servicio = servicio;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getRecibido() {
        return recibido;
    }

    public void setRecibido(double recibido) {
        this.recibido = recibido;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    
    //metodos
    
    public double calcularcambio(){
        return recibido - total;
    }
    
}
