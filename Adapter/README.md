## Adapter

### Classificação

- É um padrão estrutural que define uma estrutura que possibilita isolar partes do software quando se possui um código legado que precisará ser integrado com o código de outra aplicação. Para cenários deste tipo, faz-se necessário uma adaptação para que ambas as pontas se comuniquem sem que a estrutura de código de ambas seja danificada.

### Intenção

- Converter a interface de uma classe para alguma outra interface, possibilitando então que interfaces diferentes (incompatíveis) trabalhem em conjunto. 

### Aplicação

- Muito utilizado em cenários onde se precisa integrar duas pontas ou módulos em um software onde uma das partes possui uma estrutura de comunicação obsoleta que precisará ser adaptada. 

### Estrutura

[Exemplo da estrutura](https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter.png)

### Participantes

- Target: define a interface do domínio usada pelo cliente.
- Client: usa o objeto da interface Target, e visualiza somente o target.
- Adaptee: Define uma interface existente que precisará sofrer a adaptação.
- Adapter: Adapta a interface do Adaptee ao Target utilizado pela aplicação. 

### Implementação

- [Implementação do adapter](https://github.com/diabrantes/ProgramacaoAvancadaCCO/tree/master/Adapter/exemplo).

