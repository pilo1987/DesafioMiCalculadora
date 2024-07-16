<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
<title>Insert title here</title>
</head>
<body>

	<main class="container">
		<h1>Calculadora</h1>
		<div class="grid"">
			<form name="formulario" action="/DesafioMiCalculadora/Controller"
				" method="post">
				<div class="field">
					<label for="numero1"></label> <input type="number" name="numero1"
						min="0" max="100" placeholder="Numero 1" required>
				</div>
				<div class="field">
					<label for="numero2"></label> <input type="number" name="numero2"
						min="0" max="100" placeholder="Numero 2" required>
				</div>
				<div class="col-md-2">
					<label for="seleccion" class="form-label"></label> <select
						id="seleccion" name="seleccion" class="form-select" required>
						<option value="suma">Suma</option>
						<option value="resta">Resta</option>
						<option value="multiplicacion">Multiplicación</option>
						<option value="division">División</option>
						<option value="ordenar">Ordenar el Número</option>
						<option value="parImpar">Par e Impar</option>
					</select>
				</div>
				<div class="actions">
					<input type="submit" value="Enviar">
				</div>
			</form>
		</div>
	</main>
</body>
</html>