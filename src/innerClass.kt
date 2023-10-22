package src

fun main() {
    val bos = Bos("Rafi")
    val karyawan1 = bos.Employee("Ucok")
    val karyawan2 = bos.Employee("Budi")
    val karyawan3 = bos.Employee("Sukiman")


    karyawan1.hi()
    karyawan2.hi()
    karyawan3.hi()
}