package Relación.entre.clases.en.Java.model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el NIF del cliente: ");
        String nif = scanner.nextLine();
        Cliente cliente = new Cliente(nombre, nif);

        System.out.print("Ingrese el número de folio de la factura: ");
        int folio = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese una descripción de la factura: ");
        String descripcion = scanner.nextLine();
        Factura factura = new Factura(descripcion, cliente);

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el código del producto nº " + (i + 1) + ": ");
            String codigo = scanner.nextLine();
            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad del producto: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            Producto producto = new Producto(codigo, nombreProducto, precio);
            ItemFactura itemFactura = new ItemFactura (producto, cantidad);
            factura.addItemFactura(itemFactura);  // Método correcto para añadir un ítem

            System.out.println();
        }

        System.out.println(factura);
    }
}
