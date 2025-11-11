# Respostas das Questões de Múltipla Escolha

## Arraylist_Array

### Questão 6

- **Resposta:** B
- **Alternativa:** há mais de um método com mesmo nome, recebendo parâmetros de tipos ou em quantidades diferentes, em uma classe.
- **Justificativa:** Sobrecarga tem métodos com mesmo nome e parâmetros diferentes na mesma classe.

### Questão 7

- **Resposta:** B
- **Alternativa:** Primata andando Mamifero ouvindo Homem vendo
- **Justificativa:** A chamada usa polimorfismo, imprime andar de Primata, ouvir de Mamífero e ver sobrescrito em Homem.

### Questão 8

- **Resposta:** C
- **Alternativa:**

```
package P1;
import P2.*;
abstract public class Figura {
double x,y;
final double PI=3.14159;
Desenho d;
abstract protected double dist(double x1,double y1);
}
package P1;
public class Circulo extends Figura {
double r;
public Circulo() { d.add(this); }
public double raio() { return r; }
public double centroX() { return x; }
public double centroY() { return y; }
public double dist(double x1,double y1) {
return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
}
}
package P2;
import java.util.List;
import P1.Figura;
public class Desenho {
List<Figura> f;
public void add(Figura p) { f.add(p); }
}
```

- **Justificativa:** Somente a alternativa C mantém modificadores e assinaturas corretas em arquivos separados.

### Questão 9

- **Resposta:** B
- **Alternativa:** um erro de compilação, indicando que, no contexto de x, não existe metodoExotico.
- **Justificativa:** A referência `Interface1` não expõe `metodoExotico`, logo há erro de compilação.

### Questão 10

- **Resposta:** C
- **Alternativa:** Sobrecarga.
- **Justificativa:** O enunciado descreve vários métodos com mesmo nome e assinaturas diferentes, que define sobrecarga.

### Questão 11

- **Resposta:** E
- **Alternativa:** Polimorfismo – Sobrecarga – Sobrescrita.
- **Justificativa:** As definições seguem a ordem Polimorfismo, Sobrecarga e Sobrescrita.

### Questão 12

- **Resposta:** A
- **Alternativa:** a um mesmo método / cada classe executa / de maneira diferente.
- **Justificativa:** Várias classes acessam o mesmo método mas executam de forma diferente, conceito de polimorfismo.

### Questão 13

- **Resposta:** D
- **Alternativa:** Polimorfismo;
- **Justificativa:** O método `liga` é sobrescrito nas subclasses, e o polimorfismo escolhe o comportamento em tempo de execução.

### Questão 14

- **Resposta:** C
- **Alternativa:** abstrata
- **Justificativa:** Classes abstratas não podem ser instanciadas, exatamente o tipo citado.

### Questão 15

- **Resposta:** B
- **Alternativa:** polimorfismo.
- **Justificativa:** Polimorfismo permite mesma assinatura com comportamentos distintos nas subclasses.

### Questão 16

- **Resposta:** B
- **Alternativa:**

```
GLICEMIA EM JEJUM - PREPARO:
Nao ingerir bebidas alcoolicas 72 horas antes do exame.
Jejum de 8 a 12 horas
EXAME DE IMAGEM PREPARO:
Nenhum preparo necessario.
```

- **Justificativa:** A execução mostra o preparo específico de `GlicemiaJejum` e depois o texto herdado de `ExameImagem`.

### Questão 17

- **Resposta:** E
- **Alternativa:** encapsulamento e polimorfismo.
- **Justificativa:** O item I define encapsulamento e o item II descreve polimorfismo.

### Questão 18

- **Resposta:** B
- **Alternativa:** em todas as três classes, sendo possível, nesse caso, que a função getDesconto da classe Cliente seja abstrata.
- **Justificativa:** `getDesconto` deve ser abstrato em `Cliente` e implementado nas subclasses para polimorfismo.

### Questão 19

- **Resposta:** D
- **Alternativa:** Polimorfismo, pois o método é definido na classe base, mas o comportamento é determinado pelas subclasses.
- **Justificativa:** O método da superclasse é chamado mas a implementação real depende da subclasse, caracterizando polimorfismo.

### Questão 20

- **Resposta:** B
- **Alternativa:** II e III.
- **Justificativa:** Somente asserções II e III estão corretas quanto ao uso de polimorfismo com `SmartPhone`.

### Questão 21

- **Resposta:** B
- **Alternativa:** Esta classe não poderá ser estendida por outras classes.
- **Justificativa:** Uma classe final não pode ser estendida, que é o ponto da alternativa.

### Questão 22

- **Resposta:** C
- **Alternativa:** Marcar o método ExecutarHabilidade como abstrato na classe base Personagem e fornecendo implementações específicas nas classes derivadas.
- **Justificativa:** Declarar o método abstrato em `Personagem` obriga `Guerreiro` e `Mago` a fornecerem implementações diferentes via polimorfismo.

## Coleções Genéricas

### Questão 5

- **Resposta:** B
- **Alternativa:**

```
int q = 0;
Iterator i = listaDePessoas.iterator();
TecnicoDeTI t;
while (i.hasNext()) {
t = (Pessoa) i.next();
if (t instanceof TecnicoDeTI)
q++; }
```

- **Justificativa:** O trecho percorre a lista com um `Iterator` e conta elementos do tipo `TecnicoDeTI` usando `instanceof`, que é a ideia correta para distinguir as subclasses.

### Questão 6

- **Resposta:** B
- **Alternativa:** O método público remove() da interface List em Java pode ser utilizado para remover elementos de uma lista. Esse é um método que aceita o índice do objeto a ser removido. Por exemplo, supondo que uma lista de nome minhaLista foi inicializada corretamente com cinco elementos, uma forma de remover o primeiro elemento desta lista é utilizar o comando minhaLista.remove(1);
- **Justificativa:** O primeiro elemento de uma lista em Java está na posição 0, então `remove(1)` elimina o segundo item. A alternativa afirma que `remove(1)` exclui o primeiro, logo o texto está incorreto.

### Questão 7

- **Resposta:** E
- **Alternativa:** em ambos os casos, trata-se de uma pilha.
- **Justificativa:** Tanto `addFirst`/`removeFirst` quanto `addLast`/`removeLast` inserem e removem pelo mesmo extremo da lista, caracterizando comportamento LIFO de pilha.

### Questão 8

- **Resposta:** C
- **Alternativa:** [1, 3]
- **Justificativa:** `remove(1)` exclui o elemento de índice 1 (valor 2), restando os itens 1 e 3 na lista.

### Questão 9

- **Resposta:** A
- **Alternativa:** A remoção de elementos dentro de um laço for deve ser feita usando os métodos next() e remove() do iterador.
- **Justificativa:** Em iteradores, `remove()` só pode ser chamado após `next()` e sem parâmetros, então o código proposto está incorreto ao tentar remover pelo índice dentro do laço.

## Exceções

### Questão 3

- **Resposta:** B
- **Alternativa:** -9
- **Justificativa:** `op1` em `CB` subtrai 10, `op2` soma `5/8` (igual a 0 na divisão inteira) e o `finally` incrementa para -9.

### Questão 4

- **Resposta:** A
- **Alternativa:** Um bloco opcional que contém o código a ser executado sempre, independentemente de ocorrer ou não uma exceção.
- **Justificativa:** `finally` garante a execução do trecho final após `try/catch`, servindo para liberar recursos mesmo sem exceção.

## Reuso de Classe

### Questão 6

- **Resposta:** E
- **Alternativa:** I, apenas.
- **Justificativa:** `this` referencia o próprio objeto; membros privados não são acessíveis pela subclasse e Java não suporta herança múltipla de classes.

### Questão 7

- **Resposta:** B
- **Alternativa:** II e IV
- **Justificativa:** Herança baseia classes em outras e agrupa relacionamentos; subclasses herdam automaticamente e os termos subclasse/superclasse estavam invertidos nas demais afirmações.

### Questão 8

- **Resposta:** E
- **Alternativa:** U e associar a uma variável da classe Q
- **Justificativa:** U é subclasse de S, que deriva de Q, logo instância de U pode ser referenciada por uma variável do tipo Q; as demais violam compatibilidade ou instanciam classe abstrata.

### Questão 9

- **Resposta:** B
- **Alternativa:** V – F – V.
- **Justificativa:** Há herança entre `Mobi` e `Veiculo`; `Veiculo` não é abstrata e pode ser instanciada; `getPortas` expõe dado privado via método público, exemplo de encapsulamento.

### Questão 10

- **Resposta:** D
- **Alternativa:** Herança.
- **Justificativa:** É a herança que permite reutilizar propriedades e métodos de uma classe em outra.
