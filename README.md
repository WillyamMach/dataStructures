# Estruturas de Dados Dinâmicas

Este repositório contém implementações de estruturas de dados dinâmicas em Java, incluindo filas e pilhas, bem como exemplos de uso e testes.

## Estrutura do Diretório

* `structures`: Contém as implementações das estruturas de dados dinâmicas.
* `tests`: Contém classes de teste e exemplos de uso das estruturas de dados.

## Diretório: `structures`

### Arquivo: `DinamicQueue.java`

**Descrição:**
* A classe `DinamicQueue` representa uma fila dinâmica genérica.

**Métodos:**
* `DinamicQueue()`: Construtor que inicializa a fila.
* `add(T element)`: Adiciona um elemento ao final da fila.
* `pop()`: Remove o elemento do início da fila.
* `showValues()`: Exibe todos os valores presentes na fila.
* `Node<T>`: Classe interna que representa um nó na fila.

### Arquivo: `DinamicStack.java`

**Descrição:**
* A classe `DinamicStack` representa uma pilha dinâmica genérica.

**Métodos:**
* `DinamicStack()`: Construtor que inicializa a pilha.
* `push(T element)`: Adiciona um elemento ao topo da pilha.
* `pop()`: Remove o elemento do topo da pilha.
* `isEmpty()`: Verifica se a pilha está vazia.
* `listAllValues()`: Exibe todos os valores presentes na pilha.

### Arquivo: `List.java`

**Descrição:**
* A classe `List` representa uma lista encadeada genérica.

**Métodos:**
* `List()`: Construtor que inicializa a lista como vazia.
* `append(T element)`: Adiciona um elemento ao final da lista.
* `pop()`: Remove o primeiro elemento da lista.
* `isEmpty()`: Verifica se a lista está vazia.
* `listAllValues()`: Exibe todos os valores presentes na lista.

### Arquivo: `Node.java`

**Descrição:**
* A classe `Node` representa um nó em uma estrutura de dados.

**Métodos:**
* `Node(T element)`: Construtor que inicializa o nó com um elemento.
* `setNext(Node<T> next)`: Define o próximo nó na estrutura de dados.
* `getNext()`: Retorna o próximo nó na estrutura de dados.
* `setElement(T element)`: Define o elemento armazenado no nó.
* `getElement()`: Retorna o elemento armazenado no nó.

### Arquivo: `Queue.java`

**Descrição:**
* A classe `Queue` representa uma fila genérica.

**Métodos:**
* `Queue(int end)`: Construtor que inicializa a fila com a capacidade especificada.
* `add(T element)`: Adiciona um elemento ao final da fila.
* `remove()`: Remove e retorna o elemento na frente da fila.
* `isFull()`: Verifica se a fila está cheia.
* `isEmpty()`: Verifica se a fila está vazia.
* `showValues()`: Exibe os elementos atuais na fila.

### Arquivo: `Stack.java`

**Descrição:**
* A classe `Stack` representa uma pilha genérica.

**Métodos:**
* `Stack(int max)`: Construtor que inicializa a pilha com um tamanho máximo.
* `push(T el)`: Adiciona um elemento ao topo da pilha.
* `pop()`: Remove e retorna o elemento do topo da pilha.
* `isFull()`: Verifica se a pilha está cheia.
* `isEmpty()`: Verifica se a pilha está vazia.
* `listAllValues()`: Lista todos os valores da pilha.

## Diretório: `tests`

### Arquivo: `DecimalToBinary.java`

**Descrição:**
* A classe `DecimalToBinary` converte um número decimal para sua representação binária utilizando uma pilha dinâmica.

**Métodos:**
* `main(String[] args)`: Método principal que recebe um número decimal como argumento, realiza a conversão para binário e imprime a representação binária.
* `convertToBinary(int userEntry)`: Converte o número decimal fornecido para binário e armazena os valores binários na pilha.
* `printBinaryRepresentation()`: Imprime a representação binária armazenada na pilha.

### Arquivo: `DinamicQueueTest.java`

**Descrição:**
* A classe `DinamicQueueTest` testa a funcionalidade da classe `DinamicQueue`.

**Métodos:**
* `main(String[] args)`: Método principal que adiciona e remove elementos da fila dinâmica e exibe os valores.

### Arquivo: `DinamicStackTest.java`

**Descrição:**
* A classe `DinamicStackTest` testa a funcionalidade da classe `DinamicStack`.

**Métodos:**
* `main(String[] args)`: Método principal que adiciona e remove elementos da pilha dinâmica e exibe os valores.

### Arquivo: `DolarToBrlConversor.java`

**Descrição:**
* A classe `DolarToBrlConversor` converte um valor em Dólar para Real Brasileiro (BRL).

**Métodos:**
* `main(String[] args)`: Método principal que converte valores de Dólar para Real e exibe os valores convertidos.
* `calcBrlValue(double userEntry, double dolarValue)`: Calcula o valor convertido em Real Brasileiro (BRL).

### Arquivo: `ListTest.java`

**Descrição:**
* A classe `ListTest` testa a funcionalidade da classe `List`.

**Métodos:**
* `main(String[] args)`: Método principal que adiciona e remove elementos da lista encadeada e exibe os valores.

### Arquivo: `QueueTest.java`

**Descrição:**
* A classe `QueueTest` testa a funcionalidade da classe `Queue`.

**Métodos:**
* `main(String[] args)`: Método principal que adiciona e remove elementos da fila e exibe os valores.

### Arquivo: `StackTest.java`

**Descrição:**
* A classe `StackTest` testa a funcionalidade da classe `Stack`.

**Métodos:**
* `main(String[] args)`: Método principal que adiciona elementos à pilha até que ela esteja cheia, exibe os valores, remove todos os elementos e exibe os valores novamente.
