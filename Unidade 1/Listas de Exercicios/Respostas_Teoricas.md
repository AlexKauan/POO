# Respostas (Tasks em .md)

## Criação de Classe 1

### Task4

FAB-EEAR 2023 — Sargento da Aeronautica — Informatica (Task4)

- Relacao:
  - "E uma estrutura dinamica que encapsula estado e comportamento." -> Objeto (2)
  - "E executado automaticamente quando um objeto e instanciado utilizando o operador new." -> Construtor (3)
  - "Trata-se de modelo ou template que permite a criacao de identicas estruturas dinamicas." -> Classe (1)

Resposta correta:
- (B) 2-3-1

### Task5

UFES 2023 — Tecnico de Tecnologia da Informacao (Task5)

- `saldo` e atributo `double` de instancia, entao inicia automaticamente com `0.0`.
- `c1.depositar(1000)` -> saldo passa para `1000.0`.
- `Conta c2 = c1` faz `c2` apontar para o mesmo objeto de `c1`.
- `c1.sacar(500)` -> saldo do objeto passa para `500.0`.
- `System.out.println(c1.saldo)` imprime `500.0`.

Resposta correta:
- (B) 500.0

### Task6

Instituto Consulplan 2023 — Tecnico de Informatica (Task6)

- Relacao:
  - "Define-se dentro de uma classe para descrever o comportamento de um objeto..." -> Metodo (3)
  - "Tipo de dados definido pelo usuario que atua como um modelo..." -> Classe (1)
  - "Define-se na classe e representa o estado de um objeto..." -> Atributo (4)
  - "Instancia de uma classe criada com dados definidos..." -> Objeto (2)

Resposta correta:
- (D) 3, 1, 4, 2

## Criação de Classe 2

### Task8

FGV 2024 — CVM — Analista (Perfil 8) — TI / Sistemas e Desenvolvimento (Task8)

- "Processos disponibilizados de forma global, sem instanciar objeto" -> metodos `static`.
- "Qualquer entidade possa acessar" -> metodos `public`.

Resposta correta:
- (E) publico e estatico

### Task9

IV UFG 2024 — Prefeitura de Rio Branco (AC) — Analista de TI (Task9)

Pergunta:
- Qual recurso separa os aspectos externos (interface) dos detalhes internos (implementacao), permitindo mudar a implementacao sem afetar quem usa?

Resposta correta:
- (B) Encapsulamento

### Task10

FAB — CIAAR — 2023 — Oficial de Apoio da Aeronáutica — Análise de Sistema (Task10)

Pergunta:
- Qual opção apresenta a composição de uma classe de forma correta?

Resposta correta:
- (C) Nome da classe, atributos, métodos e visibilidade.

### Task11

[PR-4 UFRJ- 2023- UFRJ- Técnico de Tecnologia da Informação- Desenvolvimento] (Task11)

No código existem dois métodos com o mesmo nome e os mesmos parâmetros:

- `void imprimirAtributos(char a)`
- `int imprimirAtributos(char a)`

Em Java, o tipo de retorno não faz parte da assinatura para sobrecarga. Então isso gera erro de compilação por assinatura repetida.

Resposta correta:
- (A) Um erro de compilação será indicado, pois existem métodos com a mesma assinatura.

### Task12

[IV- UFG- 2024- Prefeitura de Rio Branco- AC- Analista de Sistemas- Especialização em Desenvolvimento Front-End] (Task12)

Pergunta:
- Qual é um dos principais princípios da programação orientada a objetos?

Resposta correta:
- (b) Encapsular dados e funções em objetos.

## Introdução a java

### Task23

UFPR 2023 — IF-PR — Informática — Lógica Condicional (Task23)

- Entrada: média_aluno = 5 e frequência = 0,75.
- Avaliação:
  - média_aluno >= 7? Não.
  - frequência >= 0,75? Sim → entra no bloco de recuperação.
  - recuperar = 7*2 − 5 = 9 → imprime “Está em recuperação, tirar no mínimo 9.0”.

Resposta correta:
- (C) Está em recuperação, tirar no mínimo 9.0

### Task24

IDECAN 2023 — Téc. em TI — Java (Task24)

- Entrada: y = 1; depois x = 1 + ++y.
- Avaliação:
  - ++y pré-incrementa y: y passa a 2.
  - x = 1 + 2 = 3.
  - System.out.println(x--) imprime o valor atual de x (3) e só então decrementa para 2.

Resposta correta:
- (D) 3

### Task25

UFPE 2023 — FADE — Analista de TI (Sistemas) — Task25

- Definição: proc(k) = proc(k−2) + proc(k−1) para k > 0; base: proc(k) = 1 para k ≤ 0.
- Cálculo para k = 5:
  - proc(0) = 1, proc(−1) = 1
  - proc(1) = 2, proc(2) = 3, proc(3) = 5, proc(4) = 8, proc(5) = 13

Resposta correta:
- (A) 13

### Task26

FGV 2023 — AL-MA — Programador (Task26)

- Laço de 0 a 10; quando i==4, break encerra o laço antes de imprimir.
- Números pares usam continue e não imprimem.
- Assim, imprime somente os ímpares menores que 4: 1 e 3 → total de 2 valores.

Resposta correta:
- (b) 2

### Task27

IFRN 2009 — Professor — Sistemas de Informação — Operador (Task27)

- Após `a = b = (int) c`, temos `a = 10` e `b = 10`.
- `System.out.print(\" | \" + a++ + \" | \")` imprime `10` e só depois `a` vira `11` → saída parcial: `| 10 |`.
- Condição: `a++ < 12 || ++b > 5` usa o valor atual de `a` (11), verifica `11 < 12` → verdadeiro; depois `a` passa a `12` e o `||` faz curto‑circuito (não executa `++b`), então `b` permanece `10`.
- Entra no `if` e imprime `b + \" | \"`, isto é, `10 |`.

Resposta correta:
- (B) | 10 | 10 |

### Task28

UFC 2013 — Analista de TI / Engenharia de Software — Task28

- Início: a=1, b=2.
- Iteração 1 do while (a<7): a=b+a=3.
  - do-while: b=3+2=5; a=4 (5<9 continua). Depois: b=4+5=9; a=5 (9<9 para).
- Iteração 2 do while (a=5<7): a=b+a=9+5=14.
  - do-while: b=14+9=23; a=15 (23<9 para).
- a=15 não é <7; fim. Impressão: 15 e 23.

Resposta correta:
- (E) 15 e 23

### Task29

VUNESP 2023 — EsFCEx — Oficial do Quadro Complementar — Task29

- Cálculo: x = 10 * 2 % 3 + 5 → 20 % 3 = 2 → 2 + 5 = 7.
- Impressão: x++ imprime 7 e só depois incrementa para 8. O valor mostrado é 7.

Resposta correta:
- (D) 7

