# Projeto de Automação de Testes Web do Blog do Agi

## Descrição

Este projeto é um exemplo de automação de testes, utilizando Selenium WebDriver com Java e TestNG, gerenciado pelo Maven. Ele ilustra como configurar e executar testes automatizados para a aplicação web "Blog do Agi", fornecendo uma base sólida para a criação de suítes de testes eficazes e escaláveis.

## Estrutura do Projeto

```plaintext
├── .github
│   └── workflows
│       └── gha-ci.yml
├── src
│   ├── main
│   │   ├── java
│   │   │    └── br
│   │   │        └── com
│   │   │            └── blogdoagi
│   │   │                └── pageobjects
│   │   │                    └── PesquisaObject.java
│   │   └── resources                   
│   └── test
│       ├── java
│       │   └── br
│       │       └── com
│       │            └── blogdoagi
│       │                └── test
│       │                    ├── BaseTest.java
│       │                    └── PesquisaTest.java
│       └── resources
│           └── testng.xml
├── .gitignore
├── pom.xml
└── README.md
```

## Pré-requisitos

* [Java JDK 11+](https://www.oracle.com/pt/java/technologies/javase/jdk11-archive-downloads.html)

* [Apache Maven 3.6+](https://maven.apache.org/docs/3.6.0/release-notes.html)

* [TestNG 7.10.2+](https://testng.org/)

* [Selenium Java 4.23.0+](https://www.selenium.dev/)

## Configuração do Ambiente

1 Clone o repositório:
```
git clone https://github.com/leonardomelgarejo/br.com.blogdoagi.git
cd projeto-automacao-selenium
```

2 Instale as dependências do Maven:
```
mvn clean install
```
## Estrutura dos Testes

* BaseTest.java: Classe base que configura o WebDriver e fornece métodos utilitários comuns.
* PesquisaTest.java: Yestes que navegam para a lupa de pesquisa e validam os resultados retornados.

## Executando os Testes
```
mvn clean test
```

## Relatórios de Testes

O relatório de teste será gerado na pasta target/surefire-reports/emailable-report.html e na aba Actions\Summary da sua respectiva execução do GHA-CI, no link com o nome Test Report. Você pode visualizar esses relatórios para obter detalhes sobre as execuções dos testes.

