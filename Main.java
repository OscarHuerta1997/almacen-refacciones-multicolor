import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Sistema de Inventario Multicolor ---");
            System.out.println("1. Agregar artículo");
            System.out.println("2. Eliminar artículo");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Analizar rotación");
            System.out.println("5. Alertas de bajo stock");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    System.out.print("Rotación mensual: ");
                    int rotacion = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ubicación física: ");
                    String ubicacion = sc.nextLine();

                    Articulo nuevo = new Articulo(nombre, codigo, cantidad, rotacion, ubicacion);
                    inventario.agregarArticulo(nuevo);
                    break;
                case 2:
                    System.out.print("Código del artículo a eliminar: ");
                    String codEliminar = sc.nextLine();
                    inventario.eliminarArticulo(codEliminar);
                    break;
                case 3:
                    inventario.mostrarInventario();
                    break;
                case 4:
                    inventario.mostrarRotacion();
                    break;
                case 5:
                    System.out.print("Ingrese límite mínimo de stock: ");
                    int limite = sc.nextInt();
                    inventario.alertaBajoStock(limite);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);
        
        sc.close();
    }
}
