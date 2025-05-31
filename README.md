# JPIX - (JAVA PIX PAYLOAD)

## Descrição
O Utilitário JPix é uma classe Java desenvolvida para gerar payloads conforme o padrão PIX (Sistema de Pagamentos Instantâneos Brasileiro), de acordo com as especificações do Banco Central do Brasil.

## Funcionalidades
- Geração de payloads PIX para transações de pagamento instantâneo.

## Requisitos
- Java 8 ou superior.

## Utilização
1. Clone o repositório ou faça o download do arquivo `JPix.java`.
2. Importe a classe `JPix` para o seu projeto Java.
3. Instancie a classe `JPix` com os parâmetros necessários:
   - `nome`: Nome do beneficiário.
   - `chavepix`: Chave PIX do beneficiário.
   - `valor`: Valor da transação (deve ser fornecido com ponto como separador decimal).
   - `cidade`: Cidade do beneficiário.
   - `txtId`: Identificador do beneficiário.
4. Chame o método `gerarPayload()` para gerar o payload PIX.
5. O payload PIX gerado será retornado como uma String.

Exemplo de uso:
```java
public static void main(String[] args) {
    // Exemplo de utilização
    JPix jpix = new JPix("Diego Bloise", "diego-dev@outlook.com", "1.00", "São Paulo", "ZeusTech");
    String payloadPix = jpix.gerarPayload();
    System.out.println(payloadPix);
}
```

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença
Este projeto está licenciado sob a [GPLv3 License](LICENSE).
