# Product-MS

Neste microserviço é possível criar, alterar e visualizar estoques de quotações. 


### Pré-requisitos

Antes de começar, é preciso ter instalado em sua máquina as seguintes ferramentas:
Java 11 (Java version: 11.0.11) e Maven (Apache Maven 3.8.1). O código foi editado utilizando o Eclipse.

### 🎲 Rodando o Back End (servidor)

- Clone este repositório
- Acesse a pasta do projeto no terminal
- ...
- ...


### Formato das Requisições

O formato esperado de um stock é o seguinte:

```javascript
  {
  "id": "petr3",
  "quotes":
    {
    "2019-01-01" : "10",
    "2019-01-02" : "11",
    "2019-01-03" : "14"
    }
}
```
Durante a criação e alteração, os campos *id* é obrigatório. 

### Endpoints

O microserviço possui os seguintes endpoints para operação do estoque de quotações:


| Verbo HTTP  |  Resource path       |           Descrição               |
|-------------|:--------------------:|----------------------------------:|
| GET         |  /stock              |   Lista todo o stock de quotações |
| GET         |  /stock/{id}         |   Busca por um stock pelo ID      |
| POST        |  /stock              |   Salva um stock                  |
| POST        |  /stock/newquotation |   Insere uma quotação no stock    |

#### GET /stock

Esse endpoint retorna todos os stocks cadastrados.

Retorno:
```javascript
  {
    "id": "petr3",
    "quotes":
      {
        "2019-01-01" : "6.8",
        "2019-01-02" : "9.6"    
      }
  }

  {
    "id": "petr4",
    "quotes":
      {
        "2019-01-01" : "10",
        "2019-01-02" : "44"    
      }
  }
```
Em caso de algum erro de validação, a API retorna um HTTP 400 indicando uma requisição inválida. 

#### GET /stock\{id\}

Esse endpoint retorna todos o stock com o id fornecido.

Retorno:
```javascript
  {
    "id": "petr3",
    "quotes":
      {
        "2019-01-01" : "6.8",
        "2019-01-02" : "9.6"    
      }
  }  
```
Se o id fornecido não estiver cadastrado, a API retorna 404 Not Found. 

#### POST /stock

Esse endpoint salva um stock. O stock precisa conter obrigatoriamente o id, mas não precisa conter quotations. Se não existir quotações, retorna uma lista vazia, conforme mostrado no exemplo 1.

Entrada possível 1:
```javascript
  {
    {
    "id": "petr3",
    "quotes":
      {
            
      }
  }  
  }
```

Retorno da entrada possível 1:
```javascript
  {
      "id": "petr",
      "quotes": {}
  }
```

Entrada possível 2:
```javascript
  {
    {
    "id": "petr3",
    "quotes":
      {
        "2019-01-01" : "6.8",
        "2019-01-02" : "9.6"  
      }
    }  
  }
```
Retorno da entrada possível 2:
```javascript
  {
      "id": "petr",
      "quotes": 
        { 
        "2019-01-01" : "6.8",
        "2019-01-02" : "9.6"  
        }
  }
```

Se a inserção do stock ocorrer, a API retorna 201 Created e retorna o JSON do stock recém criado.

#### POST /stock/newquotation

Esse endpoint recebe o id, preço e data e insere essa quotação no stock com o id fornecido.

**Exemplo: stock/newquotation?id=petr&date=2019-01-03&price=10**

No exemplo anterior, será adicionada a quotação do dia 2019-01-03 com o preço 10 no stock com id petr.

| Query param |  Significado
|-------------|:----------------------------------------------:|
| id          | Id do stock que irá armazenar essa quotação    |
| date        | data da quotação                               |
| price       | preço oda quotação                             |


Stock com id petr antes da inclusão:
```javascript
  {
    "id": "petr",
    "quotes": {
        
    }
}
```

Retorno após a inclusão:
```javascript
  {
    "id": "petr",
    "quotes": {
        "2019-01-03": 10
    }
}
```

Se a inserção da quotação ocorrer, a API retorna 200 OK e o JSON do stock recém modificado, conforme mostrado anteriormente. Se o id não estiver cadastrado, a API retorna 404 Not Found.

**Importante: Se o stock já tiver uma quotação para a data especificada, o preço será sobreescrito**



