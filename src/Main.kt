package perros

fun construirPerro() {
    val perro1 = Perro()
    perro1.imprimirDetalles()

    val perro2 = Perro(nombre = "Fido", peso = 8)
    perro2.imprimirDetalles()

    val perro3 = Perro(nombre = "Rex", edad = 5, peso = 10)
    perro3.imprimirDetalles()

    val perro4 = Perro(nivelDeActividad = 3)
    perro4.imprimirDetalles()

    val perro5 = Perro(nombre = "Bella", edad = 4, peso = 6)
    perro5.imprimirDetalles()
    perro5.salud = "Saludable"
    perro5.imprimirDetalles()

    val perro6 = PerroGrande(nombre = "Max", edad = 6, altura = 70)
    perro6.imprimirDetalles()
}

fun main() {
    construirPerro()
}
