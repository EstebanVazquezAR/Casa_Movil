<?php
// Configuración de la base de datos
$servername = "tu_servidor_mysql";
$username = "tu_usuario_mysql";
$password = "tu_contraseña_mysql";
$database = "tu_base_de_datos";

// Conexión a la base de datos
$conn = new mysqli($servername, $username, $password, $database);

// Verificar la conexión
if ($conn->connect_error) {
    die("Conexión fallida: " . $conn->connect_error);
}

// Recibir datos del usuario desde Android Studio
$username = $_POST['username'];
$password = $_POST['password'];

// Validar que los campos no estén vacíos
if (empty($username) || empty($password)) {
    echo "Completa todos los campos";
} else {
    // Consulta SQL para verificar las credenciales del usuario
    $sql = "SELECT * FROM usuarios WHERE nombre_usuario='$username' AND contraseña='$password'";
    $result = $conn->query($sql);

    // Verificar si se encontró un usuario con las credenciales proporcionadas
    if ($result->num_rows > 0) {
        // Usuario autenticado correctamente
        echo "Login exitoso";
    } else {
        // Usuario no encontrado o credenciales incorrectas
        echo "Nombre de usuario o contraseña incorrectos";
    }
}

// Cerrar la conexión a la base de datos
$conn->close();
?>
