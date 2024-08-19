package perros

open class Perro(
    open var nombre: String = "Desconocido",
    open var edad: Int = 1,
    open var peso: Int = 5 // en kg
) {
    init {
        println("Inicializando perro $nombre")
    }

    val nivelDeEnergia: Int
        get() = (edad * 10 / peso)

    init {
        println("Nivel de energía: $nivelDeEnergia")
    }

    open var salud: String
        get() = if (peso < 7) "Bajo peso" else "Saludable"
        set(valor) {
            peso = if (valor == "Saludable") 7 else 5
        }

    open fun imprimirDetalles() {
        println("Nombre: $nombre")
        println("Edad: $edad años")
        println("Peso: $peso kg")
        println("Salud: $salud")
    }

    constructor(nivelDeActividad: Int) : this() {
        peso = nivelDeActividad * 2 + 3
        edad = 5 - nivelDeActividad
    }
}

class PerroGrande(
    override var nombre: String,
    override var edad: Int,
    var altura: Int
) : Perro(nombre, edad, peso = 30) {
    override fun imprimirDetalles() {
        println("Nombre: $nombre")
        println("Edad: $edad años")
        println("Altura: $altura cm")
        println("Peso: $peso kg")
        println("Salud: $salud")
    }
}


