fun main(){
    val input = FileReader::class.java.getResource("input.txt")?.path
    val reader = FileReader(input)
    reader.sortNames()
    reader.writeNames("output.txt")
}