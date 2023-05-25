<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Enviar Mensaje</title>
</head>
<body>
    <h1>Lista de amigos</h1>
    <form action="EnviarMensajeServlet" method="post">
        <label for="amigo1">
            <input type="checkbox" id="amigo1" name="amigo" value="Juan">
            Juan
        </label>
        <br>
        <label for="amigo2">
            <input type="checkbox" id="amigo2" name="amigo" value="María">
            María
        </label>
        <br>
        <label for="amigo3">
            <input type="checkbox" id="amigo3" name="amigo" value="Pedro">
            Pedro
        </label>
        <br>
        <label for="amigo4">
            <input type="checkbox" id="amigo4" name="amigo" value="Daniel">
            Daniel
        </label>
        <br>
        <label for="amigo5">
            <input type="checkbox" id="amigo5" name="amigo" value="Leandro">
            Leandro
        </label>
        <br>
        <!-- Agrega más amigos aquí -->
        <br>
        <label for="mensaje">Mensaje:</label>
        <br>
        <textarea id="mensaje" name="mensaje" required></textarea>
        <br>
        <button type="submit">Enviar Mensaje</button>
    </form>
</body>
</html>
