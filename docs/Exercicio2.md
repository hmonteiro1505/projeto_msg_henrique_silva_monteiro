## Exercício 2 - Tabela de Conteúdos

### a)

``` java 
GET /api/livro/{livroId}/edicao/{edicaoId}/tabelaconteudos
```
- Retorna a Tabela de Conteúdos de uma determinada edição de um determinado livro, vai de acordo com o Diagrama de Classes
  fornecido.

### b)

- Exemplo de Estrutura de Response Body

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

