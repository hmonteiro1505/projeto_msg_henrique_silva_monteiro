# Exercício Prático – MSG

## Introdução

Este documento descreve a resolução do exercício prático proposto

- Na pasta **/src** do projeto, está todo o código relacionado à solução do exercício 1.
- Na pasta **/docs** do projeto, está a documentação e diagrama de classes relacionados à solução do exercício 2.
- Na pasta **/tests** do projeto são feitos alguns testes unitários simples para validar o comportamento do método genérico de somatório, garantindo a sua assertividade sem adicionar complexidade desnecessária.
- A solução foi desenvolvida com foco na **clareza do raciocínio**, **baixo acoplamento** e **reutilização**, conforme os requisitos apresentados.

---

## 1. Método Genérico de Somatório

Este método permite calcular o somatório de uma função definida pelo usuário sobre um intervalo de números inteiros. A implementação foi projetada para ser reutilizável e de baixo acoplamento, utilizando uma interface funcional para representar a função a ser aplicada.

### Detalhes da Implementação

- **Classe `Somatorio`**: Contém o método estático `calcular`, que realiza o somatório de uma função fornecida pelo cliente.
- **Interface `ISomatorio`**: Representa a função a ser aplicada a cada elemento do intervalo. O cliente pode fornecer qualquer implementação desta interface, permitindo flexibilidade e reutilização.

### Assinatura do Método

```java
public static int calcular(int inf, int sup, ISomatorio funcao)
```

### Parâmetros:
- **inf**: Limite inferior do intervalo (inclusivo).
- **sup**: Limite superior do intervalo (inclusivo).
- **funcao**: Função a ser aplicada a cada valor do intervalo.
- **Retorno**: O resultado do somatório.
- **Exceções**: Lança IllegalArgumentException se o limite inferior for maior que o limite superior



### Testes Unitários

Os testes para o método estão localizados na pasta **/tests** e validam os seguintes cenários:
- **Somatório simples**: Verifica o cálculo correto para uma função identidade.
- **Função constante**: Testa o somatório com uma função que retorna um valor constante.
- **Intervalo inválido**: Garante que uma exceção é lançada quando o limite inferior é maior que o superior.




## 2. API para Tabela de Conteúdos


### Endpoint

``` java 
GET /api/livro/{livroId}/edicao/{edicaoId}/tabelaconteudos
```

- Retorna a Tabela de Conteúdos de uma determinada edição de um determinado livro, conforme o diagrama de classes fornecido.

### Estrutura do Response Body

``` json
{
    "livroId": 1,
    "edicaoId": 2,
    "totalEntradas": 4,
    "tabelaConteudos": {
     "partes": [
       {
         "id": 1,
         "titulo": "Introdução",
         "pagina": 1,
         "ordem": 1,
         "capitulos": [
           {
             "id": 2,
             "titulo": "Conceitos Fundamentais",
             "pagina": 5,
             "ordem": 1,
             "subcapitulos": [
               {
                 "id": 3,
                 "titulo": "Arquitetura",
                 "pagina": 10,
                 "ordem": 1,
                 "seccoes": [
                   {
                     "id": 4,
                     "titulo": "Visão Geral",
                     "pagina": 12,
                     "ordem": 1
                   }
                 ]
               }
             ]
           }
         ]  
       }
     ]
   }
 }
```