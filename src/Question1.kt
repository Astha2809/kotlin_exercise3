//WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

fun main(args: Array<String>) {
    Class.forName("oracle.jdbc.driver.OracleDriver")

}