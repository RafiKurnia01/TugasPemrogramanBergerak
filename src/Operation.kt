package src

sealed class Operation(val name: String)

class plus : Operation("Plus")
class minus : Operation("Minus")
class modulo : Operation("Modulo")
