//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var biblioteca = Biblioteca()

    var opcion : Int = -1

    while(opcion != 5){
        println("--- MENÚ BIBLIOTECA ---")
        println("1. Agregar libro")
        println("2. Mostrar libros")
        println("3. Buscar por título")
        println("4. Eliminar libro")
        println("5. Salir")
        println("Seleccione una opción: ")

        opcion= readln().toInt()

        when(opcion){
            1 -> biblioteca.aniadirLibro()
            2 -> biblioteca.verTodos()
            3 -> biblioteca.buscarXTitulo()
            4 -> biblioteca.eliminarLibro()
            5 -> println("Saliendo del sistema. ¡Hasta pronto!")
            else -> println("Opción no válida. Intente de nuevo. ")
        }
    }

}