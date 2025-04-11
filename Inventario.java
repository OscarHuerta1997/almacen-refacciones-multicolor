import java.util.HashMap;

public class Inventario {
    private HashMap<String, Articulo> articulos;

    public Inventario() {
        articulos = new HashMap<>();
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.put(articulo.getCodigo(), articulo);
        System.out.println("Artículo agregado correctamente.");
    }

    public void eliminarArticulo(String codigo) {
        if (articulos.remove(codigo) != null) {
            System.out.println("Artículo eliminado.");
        } else {
            System.out.println("Artículo no encontrado.");
        }
    }

    public void mostrarInventario() {
        for (Articulo a : articulos.values()) {
            a.mostrarInfo();
        }
    }

    public void alertaBajoStock(int limite) {
        System.out.println("🔔 Artículos con bajo stock:");
        for (Articulo a : articulos.values()) {
            if (a.getCantidad() <= limite) {
                a.mostrarInfo();
            }
        }
    }

    public void mostrarRotacion() {
        System.out.println("📊 Análisis de rotación:");
        for (Articulo a : articulos.values()) {
            System.out.println("Código: " + a.getCodigo() + " | Rotación mensual: " + a.getRotacionMensual());
        }
    }
}
