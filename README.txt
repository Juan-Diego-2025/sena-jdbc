PROYECTO JDBC SENA

Requisitos:
Java 17 o superior

Compilar:
javac -cp "lib/*" -d out $(find src -name "*.java")

Ejecutar:
java -cp "out:lib/*" Main

El programa crea automáticamente la base de datos usuarios.db
y ejecuta las operaciones CRUD (insertar, listar, actualizar y eliminar).