<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="Assets/css/style.css" type="text/css">
    <script src="Assets/js/app.js" defer></script>
</head>
<body>
<div id="titulo">
    <h1>Simulador de Hipoteca</h1>
</div>
<div id="datos">
    <input type="number" id="importe" class="datos" placeholder="Importe del inmueble" required>
    <input type="number" id="capital" class="datos" placeholder="Capital aportado" required>
    <input type="number" id="duracion" class="datos" placeholder="Tiempo de amortización en años" required>
    <input type="button" id="b1" value="Calcular">

    <div id="mensaje"></div>
</div>
</body>
</html>