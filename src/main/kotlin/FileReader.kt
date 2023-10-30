import java.io.File
import java.io.FileWriter
import java.util.stream.Collectors

class FileReader {
    var names: List<String>?

    constructor(fileName: String?) {
        this.names = fileName?.let {
            java.io.FileReader(it).use { r ->
                r.readLines()
            }
        }
    }

    fun sortNames() {
        this.names = this.names?.sorted()
    }

    fun writeNames(fileName: String?) {
        if (fileName != null) {
            names?.stream()?.collect(Collectors.joining("\n"))?.let { File(fileName).writeText(it) }
        }
    }
}