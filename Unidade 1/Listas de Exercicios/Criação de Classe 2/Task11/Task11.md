[PR-4 UFRJ- 2023- UFRJ- Técnico de Tecnologia da Informação- Desenvolvimento] (Task11)

No código existem dois métodos com o mesmo nome e os mesmos parâmetros:

- `void imprimirAtributos(char a)`
- `int imprimirAtributos(char a)`

Em Java, o tipo de retorno não faz parte da assinatura para sobrecarga. Então isso gera erro de compilação por assinatura repetida.

Resposta correta:
- (A) Um erro de compilação será indicado, pois existem métodos com a mesma assinatura.
