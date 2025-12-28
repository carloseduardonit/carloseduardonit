# RF-01 — Registro de Lançamentos Financeiros com Partida Dobrada

## 1. Identificação

ID: RF-01
Nome: Registro de Lançamentos Financeiros com Partida Dobrada
Sistema: Controle Financeiro Pessoal (Salesforce)
Módulo: Contabilidade / Financeiro
Prioridade: Alta

## 2. Descrição

O sistema deve permitir o registro de lançamentos financeiros pessoais utilizando o método de partida dobrada, garantindo que todo lançamento possua, no mínimo, um débito e um crédito, com valores totais equivalentes, assegurando a integridade contábil das informações.

## 3. Atores

 - Usuário do Sistema (Pessoa Física)

# 4. Pré-condições

- As Contas Contábeis devem estar previamente cadastradas e ativas.
- O usuário deve possuir permissão para criar e editar lançamentos financeiros.
- O lançamento deve estar no status Rascunho para edição.

5. Pós-condições

O lançamento financeiro é registrado com sucesso.

Os saldos das contas contábeis envolvidas são atualizados automaticamente.

O lançamento passa para o status Confirmado.

A integridade da partida dobrada é preservada.

6. Fluxo Principal

O usuário cria um novo Lançamento Contábil.

O sistema permite o preenchimento das informações básicas (data, descrição, valor total e período).

O usuário adiciona dois ou mais Itens de Lançamento, informando:

Conta Contábil

Tipo (Débito ou Crédito)

Valor

O usuário altera o status do lançamento para Confirmado.

O sistema valida se a soma dos valores dos débitos é igual à soma dos valores dos créditos.

Estando a validação correta, o sistema confirma o lançamento.

O sistema atualiza automaticamente o saldo das contas contábeis envolvidas.

O sistema exibe mensagem de sucesso ao usuário.

7. Fluxos Alternativos
7.1 Soma de Débitos diferente da Soma de Créditos

O usuário tenta confirmar o lançamento.

O sistema identifica divergência entre débitos e créditos.

O sistema impede a confirmação do lançamento.

O sistema exibe a mensagem de erro:

“Lançamento inválido: a soma dos débitos deve ser igual à soma dos créditos.”

7.2 Conta Contábil Inativa

O usuário tenta selecionar uma conta contábil inativa.

O sistema bloqueia a seleção.

O sistema informa que apenas contas ativas podem ser utilizadas.

8. Regras de Negócio

RN-01: Todo lançamento deve possuir, no mínimo, um débito e um crédito.

RN-02: A soma dos débitos deve ser exatamente igual à soma dos créditos.

RN-03: Lançamentos confirmados não podem ser alterados ou excluídos.

RN-04: A atualização de saldo deve respeitar a natureza da conta (devedora ou credora).
