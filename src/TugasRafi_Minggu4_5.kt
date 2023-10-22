//Nama          : Rafi Kurnia Ilahi
//NIM           : 21076066
//Mata Kuliah   : Pemograman Bergerak

package src

// Contoh penggunaan Enum class
enum class GenderMahasiswa{
    MALE, FEMALE
}

// Contoh penggunaan Sealed class
sealed class Result {
    data class Sukses(val message: String) : Result()
    data class Error(val error: String) : Result()
}

// Contoh penggunaan Data class
data class Person1(val nama: String, val umur: Int)

// Contoh penggunaan Singleton class
object Singleton {
    fun sayHello() {
        println("Ini contoh singleton class dari Rafi")
    }
}

// Contoh penggunaan Abstract class
abstract class Vehicle {
    abstract fun drive()
}

// Contoh penggunaan Nested class
class School(val schoolName : String) {
    inner class Classroom(val className: String) {
        fun describe() {
            println("Ini merupakan kelas  $className yang ada di ${this@School.schoolName}")
        }
    }
}

// Contoh penggunaan Inner nested class
class University {
    val universitas = "Universitas Negeri Padang"

    inner class Department(val departmentName: String) {
        fun describe() {
            println("$departmentName merupakan Departemen saya yang ada di $universitas")
        }
    }
}

fun main() {
    // Membuat objek baru dengan data class yang sudah dideklarasikan sebelumnya
    val person = Person1("Rafi", 20)
    println("Name: ${person.nama}, Age: ${person.umur}")

    // Menggunakan Enum Class untuk data gender
    val gender = GenderMahasiswa.MALE
    println("Gender: $gender")

    // Contoh pembuatan objek dengan sealed class
    val result: Result = Result.Sukses("Data berhasil diterima")
    when (result) {
        is Result.Sukses -> println("Pesan Sukses: ${result.message}")
        is Result.Error -> println("Pesan Error: ${result.error}")
    }

    // Menggunakan singleton class
    Singleton.sayHello()

    // Menggunakan abstract class untuk membuat objek car
    val car = object : Vehicle() {
        override fun drive() {
            println("Mobil sedang dikendarai...")
        }
    }
    car.drive()

    /*Menggunakan nested class untuk membuat objek sekolahSaya dan kelasSaya, sebenarnya program ini error,
    hal ini dikarenakan inner class tidak dapat memanggil properties dari outer classnya apabila tidak menggunaka kata kunci inner.*/
    val sekolahSaya = School("SMK N 1 Matur")
    val kelasSaya = sekolahSaya.Classroom("XII TKJ 1")
    kelasSaya.describe()

    // Menggunakan inner nested class, hampir sama saja dengan nested class sebelumnya.
    val department = University().Department("Teknik Informatika")
    department.describe()
}
