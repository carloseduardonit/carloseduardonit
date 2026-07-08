# Questionário - Vaga de QA

<!-- Estrutura padrão para triagem técnica e entrevista -->

## Objetivo

Breve propósito: triagem técnica para vaga de QA (manual e automação), com foco em Salesforce, automação e práticas de qualidade.

## Instruções

- Tempo estimado: 20–40 minutos
- Respostas objetivas; inclua exemplos e links quando possível (GitHub, Gists)
- Prefira português (PT-BR); indique se preferir inglês ou espanhol
- Use frases curtas e voz ativa (ex.: "Criei", "Executei", "Descrevo")

## Dados do Candidato

- Nome:
- Contato (telefone / e-mail):
- LinkedIn / GitHub:
- Tempo de experiência (anos):

## Resumo Profissional (2–3 linhas)

Resumo curto destacando foco em QA, plataformas dominadas e experiências relevantes.

## Competências Técnicas (marque e descreva)

- QA Manual: sim/não + exemplos de casos testados
- Automação: listar ferramentas e nível (Robot Framework, Cypress, Selenium)
- Testes de API: ferramentas e abordagens (Postman, Newman, contratos)
- Testes de performance: ferramentas e escopo (JMeter, k6)
- CI/CD: experiência com pipelines (GitHub Actions, GitLab CI, Jenkins)
- Banco de dados / SQL: nível e exemplos de queries usadas

## Ferramentas e Plataformas

Liste experiência com: Jira, Zephyr, Salesforce (Sales/Service Cloud), BrowserStack, Postman, JMeter, Git, Bitbucket/GitHub, Sentry/Datadog.

## Cenários Práticos (3 exercícios)

1) Gherkin (exemplo): escrever um cenário para "Usuário cadastra cliente e recebe confirmação por e-mail".

  Exemplo de resposta esperada:

  ```gherkin
  Feature: Cadastro de cliente

    Scenario: Cadastro com sucesso e confirmação por e-mail
     Given que o usuário está na página de cadastro
     When preenche os dados obrigatórios e confirma
     Then o sistema salva o cliente
     And o sistema envia um e-mail de confirmação para o endereço cadastrado
  ```

2) Bug report (analisar): forneça prioridade (Baixa/Média/Alta/Critical) e próximo passo.

  Template mínimo para análise:

  - Título:
  - Ambiente (dev/stage/prod):
  - Passos para reproduzir:
  - Resultado esperado:
  - Resultado atual:
  - Evidências (logs/prints):
  - Severidade / Prioridade:
  - Próximo passo sugerido:

3) Checklist mínimo para validar rotina de pricing:

- Validar regras de negócio (tabela de preços, descontos)
- Verificar cálculos com base contábil e impostos
- Testar integração com API externa (mock/contract)
- Validar rollback e mensagens de erro
- Testar permissões e casos de borda

## Perguntas Técnicas (objetivas)

- Explique a diferença entre smoke, sanity e regression tests (resuma em 1–2 frases).
- Quando usar mocks em testes de integração? Cite prós e contras.
- Como validar um fluxo de pricing que depende de API externa e de regras contábeis? (indique estratégias de teste e validação)
- Como você verifica impacto de dados contábeis na precificação (ex.: depreciação, CAPEX)?

## Perguntas Comportamentais / Processos

- Descreva um incidente crítico que você comunicou: ação tomada, comunicação e resultado.
- Como prioriza testes quando há limitação de tempo? Indique critérios objetivos.
- Como você registra e acompanha bugs até a resolução? Cite ferramentas e boas práticas.

## Critérios de Avaliação (sugestão)

- Técnica: 50% (respostas técnicas + perguntas)
- Prática: 30% (cenários e exemplos)
- Comportamental: 20% (comunicação e processo)

Escala: 0 = insuficiente; 1 = básico; 2 = bom; 3 = ótimo


## Observações do Entrevistador

- Espaço para anotações, decisão, score final e follow-up.

## Anexos / Evidências

- Links para repositório, prints, relatórios, planilhas e arquivos de teste.

---

<details>
  <summary>Respostas atuais (originais) — clique para expandir</summary>

  <!-- Conteúdo original preservado abaixo para referência. Mantive respostas em blocos "details" para fácil visualização. -->

  <details>
    <summary>Lista de sites (cadastro/atualizado currículo)</summary>

  - [X] [99jobs](https://99jobs.com/)
  - [X] [Solides](https://perfil.vagas.solides.com.br/)
  - [X] [Linkedin](https://www.linkedin.com/)
  - [ ] [Indeed](https://www.indeed.com.br/)
  - [ ] [Glassdoor](https://www.glassdoor.com.br/index.htm)
  - [ ] [Vagas.com](https://www.vagas.com.br/)
  - [ ] [Catho](https://www.catho.com.br/)
  - [ ] [Infojobs](https://www.infojobs.com.br/)
  - [ ] [Gupy](https://www.gupy.io/)

  </details>

  <details>
    <summary>1. Você chegou a entrar no site da Branddi? Se sim, o que você entendeu?</summary>

  ```text
  Sim, acessei o site da Branddi. Entendi que é uma empresa especializada em comunicação, marketing digital e branding, com foco em criar conexões autênticas entre marcas e pessoas por meio de estratégias criativas e tecnológicas.
  Gostei da forma como a Branddi alia inovação, design e propósito, valorizando a experiência do cliente e o impacto positivo das marcas.
  ```

  </details>

  <details>
    <summary>2. Você possui experiência comprovada como QA Engineer ou em função similar?</summary>

  ```text
  Sim. Atuei como Analista de Qualidade de Software (QA) em projetos nacionais e internacionais, com foco em testes manuais, funcionais e exploratórios, além de validações em Salesforce, ERP Microsoft Dynamics AX e APIs.
  Utilizei ferramentas como Jira, Zephyr, BrowserStack e Postman, aplicando metodologias ágeis como Scrum, BDD e BDT.
  Também realizei manutenções pontuais em código Apex, liderei temporariamente o time de QA e ministrei treinamentos internos sobre Salesforce.
  ```

  </details>

  <details>
    <summary>3. Por qual motivo você é a pessoa ideal para essa posição?</summary>

  ```text
  Sou um profissional comprometido, detalhista e multidisciplinar, com base sólida em QA, TI e Contabilidade, o que me permite compreender tanto o aspecto técnico quanto o de negócio.
  Tenho facilidade em entender regras complexas, garantir qualidade e promover a melhoria contínua.
  Além disso, possuo certificações Salesforce, venho estudando automação com Robot Framework e Cypress, e busco aplicar todo esse conhecimento para entregar valor real à empresa, com eficiência e qualidade.
  ```

  </details>

  <details>
    <summary>4. Experiência em Robot Framework e Python?</summary>

  ```text
  Tenho conhecimento em Robot Framework e Python, adquirido por meio de estudos e projetos pessoais. Embora ainda não tenha atuado profissionalmente com essas ferramentas, venho aplicando o que aprendo em automações de teste.
  ```

  </details>

  <details>
    <summary>5. CI/CD com automação de testes?</summary>

  ```text
  Ainda não atuei profissionalmente com integração de testes em CI/CD, mas venho estudando GitHub Actions para aplicar em pipelines de automação.
  Estou preparado para colocar esse conhecimento em prática e evoluir rapidamente na área.
  ```

  </details>

  <details>
    <summary>6. Testes de carga (JMeter, k6, Locust)?</summary>

  ```text
  Possuo experiência inicial com JMeter, adquirida em estudos e testes de aprendizado. Ainda não atuei em projetos profissionais, mas estou motivado para aplicar esse conhecimento em cenários reais.
  ```

  </details>

  <details>
    <summary>7. Experiência com Cypress?</summary>

  ```text
  Ainda não possuo experiência profissional com Cypress, mas venho estudando e desenvolvendo scripts em projetos pessoais.
  Estou me preparando para aplicar esses conhecimentos em um ambiente corporativo com foco em automação de testes.
  ```

  </details>

  <details>
    <summary>8. Tempo de experiência em testes (geral)?</summary>

  ```text
  Possuo cerca de 2 anos de experiência prática como QA Manual, atuando com testes funcionais, exploratórios e regressivos em ambientes Salesforce, ERP Microsoft Dynamics AX e integrações via API.
  ```

  </details>

  <details>
    <summary>9. Formação acadêmica</summary>

  | Nº  | Universidade       | Curso                                              | Início  | Fim      |
  |----:|:-------------------|:---------------------------------------------------|:-------:|:--------:|
  | 1️⃣ | UFF                | Ciências Contábeis                                 | 08/2021 | 12/2027  |
  | 2️⃣ | Estácio de Sá      | Análise e Desenvolvimento de Sistemas             | 08/2015 | 09/2017  |
  | 3️⃣ | Senac RJ           | Técnico em Contabilidade                           | 02/2012 | 12/2013  |
  | 4️⃣ | Senac RJ           | Técnico em Manutenção e Suporte de Informática     | 02/2010 | 12/2011  |

  </details>

  <details>
    <summary>10. Última remuneração e benefícios</summary>

  ```text
  - Salário base: R$ 3.825,00
  - Benefícios: R$ 1.700,00 (VA, VR, Plano de Saúde, Odontológico e Seguro de Vida).
  ```

  </details>

  <details>
    <summary>11. Pretensão salarial</summary>

  ```text
  Prefiro avaliar conforme a proposta da empresa. Estou aberto a negociações justas, levando em conta as responsabilidades do cargo e as oportunidades de crescimento.
  ```

  </details>

  <details>
    <summary>12. Superpoder</summary>

  ```text
  Minha capacidade de aprender rápido e me adaptar a diferentes contextos, unindo TI com visão analítica da contabilidade.
  ```

  </details>

  <details>
    <summary>13. Experiências (tabela)</summary>

  | Nº   | Empresa                | Cargo                 | Início   | Fim      | Site                        |
  |------|------------------------|-----------------------|----------|----------|-----------------------------|
  | 1️⃣   | BRQ Digital Solutions | Analista de Sistema   | 08/2021  | 09/2023  | [brq.com](https://www.brq.com/) |

  </details>

  <details>
    <summary>14. Domínio em Robot Framework</summary>

  ```text
  Tenho maior domínio em Robot Framework, com o qual venho desenvolvendo automações de testes funcionais e de API.
  Além disso, tenho conhecimento básico em Cypress e Selenium.
  ```

  </details>

  <details>
    <summary>15. Disponibilidade para início</summary>

  ```text
  Posso iniciar imediatamente após a aprovação no processo seletivo. Tenho total disponibilidade para integração rápida, com flexibilidade para remoto ou híbrido.
  ```

  </details>

  <details>
    <summary>16. Modelos de maturidade (RUP/CMMI/SPICE)</summary>

  ```text
  Não.
  ```

  </details>

  <details>
    <summary>17. Acessibilidade</summary>

  ```text
  Ainda não atuei diretamente com testes de acessibilidade, mas tenho estudado boas práticas de UX e inclusão digital.
  ```

  </details>

  <details>
    <summary>18. CPA-20</summary>

  ```text
  Ainda não possuo a certificação CPA-20, mas estou disposto a obtê-la caso seja necessária.
  ```

  </details>

  <details>
    <summary>19. Por que começou na Contabilidade?</summary>

  ```text
  Resposta do candidato (preencher).
  ```

  </details>

</details>