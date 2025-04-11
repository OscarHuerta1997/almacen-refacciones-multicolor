public class Articulo {
    private String nombre;
    private String codigo;
    private int cantidad;
    private int rotacionMensual;
    private String ubicacion;

    public Articulo(String nombre, String codigo, int cantidad, int rotacionMensual, String ubicacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.rotacionMensual = rotacionMensual;
        this.ubicacion = ubicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getRotacionMensual() {
        return rotacionMensual;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void mostrarInfo() {
        System.out.println("Artículo: " + nombre + " | Código: " + codigo + " | Cantidad: " + cantidad + 
                           " | Rotación mensual: " + rotacionMensual + " | Ubicación: " + ubicacion);
    }
}
