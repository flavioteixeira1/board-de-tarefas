Board de Tarefas

Um projeto de console para gerenciamento de tarefas utilizando um sistema de board (quadro) com colunas personalizáveis.

📋 Descrição


Este projeto implementa um sistema de board de tarefas onde é possível:

    Criar e gerenciar boards (quadros)

    Definir colunas personalizadas com diferentes tipos (INICIAL, FINAL, CANCEL, PENDING)

    Gerenciar cards (tarefas) entre as colunas

    Controlar bloqueios de tarefas com registro de motivo e data


🛠️ Tecnologias Utilizadas

    Java - Linguagem de programação

    Gradle - Gerenciamento de dependências e build

    MySQL - Banco de dados relacional

    JDBC - Conexão com o banco de dados

    Lombok - Redução de código boilerplate



📁 Estrutura do Projeto
text


src/main/java/dev/flavio/board/
├── persistence/
│   ├── entity/
│   │   ├── BoardEntity.java
│   │   ├── BoardColumnEntity.java
│   │   ├── BoardColumnKindEnum.java
│   │   ├── CardEntity.java
│   │   └── BlockEntity.java
│   └── config/
│       └── ConnectionConfig.java



🗄️ Configuração do Banco de Dados


1. Instalação do MySQL


Certifique-se de ter o MySQL instalado e em execução.

2. Criação do Banco de Dados


CREATE DATABASE board;

3. Configuração de Acesso

Crie um usuário com as credenciais especificadas na classe ConnectionConfig:


CREATE USER 'teste'@'localhost' IDENTIFIED BY 'teste';
GRANT ALL PRIVILEGES ON board.* TO 'teste'@'localhost';
FLUSH PRIVILEGES;


4. Estrutura das Tabelas


O projeto utiliza as seguintes entidades principais:

    BoardEntity: Representa um quadro de tarefas

    BoardColumnEntity: Colunas dentro de um board

    CardEntity: Tarefas/cards que podem ser movidos entre colunas

    BlockEntity: Registro de bloqueios de tarefas



⚙️ Configuração da Conexão


A configuração de conexão com o banco de dados está localizada em:
dev.flavio.board.persistence.config.ConnectionConfig


Configuração padrão:

java

var url = "jdbc:mysql://localhost/board";
var user = "teste";
var password = "teste";


Para alterar as configurações:



    Edite o arquivo ConnectionConfig.java


    Modifique as variáveis:


        url: Endereço do banco de dados

        user: Nome de usuário

        password: Senha do usuário



🚀 Como Executar

Pré-requisitos


    Java JDK 8 ou superior

    Gradle

    MySQL Server


Passos para execução:


    Clone o repositório:
    bash


git clone https://github.com/flavioteixeira1/board-de-tarefas.git

cd board-de-tarefas


Configure o banco de dados seguindo as instruções acima


Execute o projeto com Gradle:
bash


./gradlew run


ou
bash


gradle run


📊 Funcionalidades

Tipos de Colunas


    INITIAL: Coluna inicial onde as tarefas começam

    FINAL: Coluna final para tarefas concluídas

    CANCEL: Coluna para tarefas canceladas

    PENDING: Coluna para tarefas pendentes


Métodos Úteis



    getInitialColumn(): Retorna a coluna inicial do board

    getCancelColumn(): Retorna a coluna de cancelamento do board



🔧 Desenvolvimento


Compilação
bash

./gradlew build

Execução de testes

bash

./gradlew test



📝 Notas

    O projeto utiliza transações com autoCommit = false

    As entidades utilizam Lombok para geração automática de getters, setters, equals e hashCode

    O sistema é projetado para execução em console



🤝 Contribuição


Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

