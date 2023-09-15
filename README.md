# ExemplosPOO

Objetos (real ou abstrato)
	ESTADO (dados)
	COMPORTAMENTO (ações)

POO (objeto)
	Por definição: Um objeto é um pedaço de software que possui atributos (estado) e métodos (comportamento)

Classes
	Representação de um conjunto de objetos que compartilham a mesma estrutura de atributos, métodos e relacionamentos. 
 
Condicional alternado (IF de outro jeito)
 	return condiçao ? valor_se_verdadeiro : valor_se_falso

Classe (
	É um conjunto de atributos e métodos que definem um objeto
)

Laços de repetição:
	For
	While
	Do While

for (inicialização; condição; incremento) {
	// instruções/codigo
}

while (condição) {
	// instruções/codigo
}

do {
	// instruções/codigo
} while (condição);

Associações entre classes
	Uma Associação define que uma classe faz parte da estrutura de outra classe.
	Na notação UML é representada por uma linha conectando as classes.
	(Unidirecional): A classe A contém um atributo da classe B. Já a classe B não possui atributo da classe A.
	(Bidirecional): A classe A contém um atributo da classe B e a classe B contém um atributo da classe A.

Collection
Existem vários tipos diferentes de Collections disponíveis na API de Collections do Java, cada uma com diferentes características e métodos específicos. 
Algumas das principais interfaces de Collection incluem: Set, Queue (filas), List (listas) e Map, que formam a base das coleções genéricas da linguagem Java.
	Em geral as Collections são estruturas dinâmicas, ou seja, podem crescer conforme a necessidade de expansão.
	Set: define uma coleção que não contém valores duplicados.
	Queue: define uma coleção que representa uma fila, ou seja, implementa o modelo FIFO (First-In, First-Out)
	List: define uma coleção ordenada que pode conter elementos duplicados.
	Map: define uma coleção coleção de pares chave-valor, em que cada chave é associada a um valor e não permite chaves duplicadas.

