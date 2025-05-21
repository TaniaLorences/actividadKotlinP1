






class Biblioteca {

    var biblio: MutableList<Libro> = mutableListOf()

    fun aniadirLibro(){
        print("Título: ")
        var tituloN= readln()
        print("Autor: ")
        var autorN = readln()
        print("Año de publicación: ")
        var anioN = readln()

        var libro = Libro(tituloN, autorN, anioN)

        for (i in biblio){
            if(i.titulo == tituloN){
                println("Ya existe un libro con el título: $tituloN")
                return
            }
        }
        biblio.add(libro)
        println("Libro agregado: ${libro}")
    }

    fun verTodos(){
        if(biblio.size==0){
            println("La biblioteca está vacía. ")
            return
        } else {
            println("Libros en la biblioteca: ")
        }

        for (i in biblio){
            println(i.toString())
        }
    }

    fun buscarXTitulo(){
        print("Título a buscar: ")
        var tituloB = readln()

        for (i in biblio){
            if(i.titulo == tituloB){
                println("Resultados de búsqueda: ")
                println(i.toString())
                return
            }
        }

        println("No se encontraron libros con el título \"$tituloB\".")
    }

    fun eliminarLibro(){
        print("Título a buscar: ")
        var tituloB = readln()

        if(biblio.size==0){
            println("No se encontró un libro con el título \"$tituloB\".")
            return
        }

        for (i in biblio){
            if(i.titulo!=tituloB){
                println("No se encontró un libro con el título \"$tituloB\".")
                return
            } else if (i.titulo == tituloB) {
                biblio.remove(i)
                println("Libro eliminado: $i")
                return
            }
        }
    }


}