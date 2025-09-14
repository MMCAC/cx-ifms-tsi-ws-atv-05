<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $peso = filter_input(INPUT_POST, 'peso', FILTER_VALIDATE_FLOAT);
    $altura = filter_input(INPUT_POST, 'altura', FILTER_VALIDATE_FLOAT);

    $client = new SoapClient("http://localhost:8080/imcws?wsdl");

    // Chama o serviço e pega o valor dentro do objeto
    $imcResponse = $client->calcularIMC(['peso' => $peso, 'altura' => $altura]);
    $imc = $imcResponse->return;

    $categoriaResponse = $client->categoriaIMC(['imc' => $imc]);
    $categoria = $categoriaResponse->return;
}
?>

<form method="post">
    Peso (kg): <input type="text" name="peso"><br>
    Altura (m): <input type="text" name="altura"><br>
    <input type="submit" value="Calcular IMC">
</form>

<?php
if (isset($imc)) {
    echo "IMC: $imc <br>";
    echo "Categoria: $categoria";
}
?>
