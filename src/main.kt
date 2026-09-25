import java.util.concurrent.Executors
import kotlin.random.Random

//Crea varios hilos que hagan un conteo hasta diferente numero,
// se tienen que ir ejecutando de manera desordenada

fun main(){

    val fils: Int = Random.nextInt(1,10)

    val executor = Executors.newFixedThreadPool(fils)

    println("nombre de fils creats: $fils")

    repeat(fils) {
        executor.submit {
            val max = Random.nextInt(1,15)
            var inicio = 0

            while (inicio <= max) {
                println("${Thread.currentThread().name} $inicio/$max ")
                inicio++
                Thread.sleep(Random.nextLong(100, 301))

            }

        }
    }
    executor.shutdown()

}