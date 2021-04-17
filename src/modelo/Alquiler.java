package modelo;

import java.time.LocalDate;

public class Alquiler {
    
    Vehiculo vehiculo;
    Empleados empleados;
    Cliente cliente;
    Oficina oficina;
    LocalDate localDate;

    

    public Alquiler(Vehiculo vehiculo, Empleados empleados, Cliente cliente, Oficina oficina, LocalDate localDate) {
        this.vehiculo = vehiculo;
        this.empleados = empleados;
        this.cliente = cliente;
        this.oficina = oficina;
        this.localDate = localDate;
    }

    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Empleados getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Oficina getOficina() {
        return this.oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public LocalDate getLocalDate() {
        return this.localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }



}
