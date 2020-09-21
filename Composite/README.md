## Composite

### Classificação

- É um padrão de projeto com a característica de possuir sua composiço hierarquica similar a de uma árvore, o que torna possível representar um objeto através da composição de outros similares. 

### Intenção

- O Composite é um padrão de projeto estrutural que permite compor objetos em uma estrutura semelhante a uma árvore e trabalhar com eles como se fosse um único objeto. Pode ser uma boa alternativa para a resolução de problemas que necessitam da construção de uma estrutura em árvore. O grande recurso do Composite é a capacidade de executar métodos recursivamente em toda a estrutura da árvore e resumir os resultados.

### Aplicação

- Muito utilizado para a representação de hierarquias de componentes em UI, menus com interfaces gráficas, criação de registros genéricos, criação de estruturas de arquivos ou diretórios, entre outros.

### Estrutura

- A estrutura de um **Composite** é, de forma geral, a composição de um objeto por várias "partes", ou seja, outros objetos. Este [diagrama](https://sparxsystems.com/images/screenshots/uml2_tutorial/CP01.GIF) representa um componente desenhado utilizando este padrão de projeto.

### Participantes

- Component: declara interface para objetos da composição, padroniza comportamentos comuns para todas as classes existentes e declara uma interface para acessar e gerenciar componentes filhos.
- Leaf: define o comportamento para objetos primitivos da composição. 
- Composite: Armazena componentes filhos, implementa operaçes relacionadas aos filhos que foram definidos pelo participante "Component".
- Client: Manipula objetos da composição através da interface Component.


### Implementação

Nesta [implementação](https://github.com/diabrantes/ProgramacaoAvancadaCCO/tree/master/Composite/exemplo) o composite foi utilizado para que fosse desenvolvido um sistema de arquivos contendo pastas e arquivos, onde é possível navegar pela árvore para obter seus itens e tamanhos.

