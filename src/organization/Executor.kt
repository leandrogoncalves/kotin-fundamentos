package organization

typealias ExecutorId = String
typealias CodeToExecute = (ExecutorId) -> String

fun main() {

}

class Executor(val id: ExecutorId) {
    fun execute(code: CodeToExecute): String {
        return code(id)
    }
}