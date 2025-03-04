# Santander Dev Week 2025
Java RESTful API criada para a Santander Dev Week 

## Diagrama de Classes 

```mermaid
classDiagram
    class Usuario {
        +String nome
        +Account account
        +List~Feature~ features
        +Card card
        +List~News~ news
    }

    class Account {
        +String number
        +String agency
        +double balance
        +double limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +double limit
    }

    class News {
        +String icon
        +String description
    }

    Usuario "1" *-- "1" Account
    Usuario "1" *-- "N" Card
    Usuario "1" *-- "1" Feature : contains *
    Usuario "1" *-- "N" News : contains *
```
