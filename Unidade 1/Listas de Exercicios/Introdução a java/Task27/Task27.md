IFRN 2009 — Professor — Sistemas de Informação — Operador (Task27)

- Após `a = b = (int) c`, temos `a = 10` e `b = 10`.
- `System.out.print(" | " + a++ + " | ")` imprime `10` e só depois `a` vira `11` → saída parcial: `| 10 |`.
- Condição: `a++ < 12 || ++b > 5` usa o valor atual de `a` (11), verifica `11 < 12` → verdadeiro; depois `a` passa a `12` e o `||` faz curto‑circuito (não executa `++b`), então `b` permanece `10`.
- Entra no `if` e imprime `b + " | "`, isto é, `10 |`.

Resposta correta:
- (B) | 10 | 10 |
