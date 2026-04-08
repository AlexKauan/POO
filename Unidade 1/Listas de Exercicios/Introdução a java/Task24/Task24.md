IDECAN 2023 — Téc. em TI — Java (Task24)

- Entrada: y = 1; depois x = 1 + ++y.
- Avaliação:
  - ++y pré-incrementa y: y passa a 2.
  - x = 1 + 2 = 3.
  - System.out.println(x--) imprime o valor atual de x (3) e só então decrementa para 2.

Resposta correta:
- (D) 3
