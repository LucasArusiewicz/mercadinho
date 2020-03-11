# mercadinho
Execício aula 03 da disciplina de poo

# poo_aula_03

# APP

Criar aplicação para mercadinho, usuário vai poder simular compras


# Pessoa
 - codigo: int
 - nome: string

  - Pessoa()
  - toString()

# Compra
 - date: string
 - comprador: Pessoa
 - lista: ItemCompra

   - Compra(Pessoa)
   - Compra(Pessoa, date)
   - fecharCompra()
   - valorTotal()
   - comprar(Produto)
   - comprar(int, Produto)

# ItemCompra
 - prod: Produto
 - quant: int

  - ItemCompra(int, Produto)
  - valorTotal()

#  Produto
 - codigo: int
 - nome: string
 - preco: double

  - Produto()
