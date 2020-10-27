## Observer

### Classificação

- É um padrão de projeto comportamental que define a forma de comunicação entre classes, permitindo a publicação de mudanças de estado. 

### Intenção

- Receber notificações sobre mudanças de estado em outros objetos quando estas mudanças forem relevantes.

### Aplicação

- Utilizado para permitir que um objeto publique mudanças de estado. Permite também que outros objetos se inscrevam para que sejam notificados sobre estas mudanças.
- Pode ser utilizado quando uma mudança a um objeto requer mudanças a outros e não se sabe quantos outros objetos podem sofrer modificações, ou quando um objeto deve ser capaz de avisar outros sem fazer suposições sobre quem são os objetos. 

### Estrutura

![Estrutura do Observer](http://www.linhadecodigo.com.br/artigos/img_artigos/DiogoSouza/ObserverJava/ObserverJava01.jpg)

### Participantes

- Subject: classe que possui a informação do estado que se deseja observar. 
- Observer: interace que define os métodos de notificação de interesse dos observadores.
- ConcreteObserverA e ConcreteObserverB: Classes concretas que observam a classe Subject


### Implementação

Nesta [implementação](https://github.com/diabrantes/ProgramacaoAvancadaCCO/tree/master/Observer/exemplo) o Observer foi utilizado para estabelecer a colaboração indireta entre os objetos de um editor de texto. Sempre que o objeto Editor for alterado, os assinantes serão notificados e as classes de Email e Log reagirão a essas notificações. 

