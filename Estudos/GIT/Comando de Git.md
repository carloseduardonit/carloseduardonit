# Utilização do Git

## Configuração do Git

Para usar o Git corretamente, configure seu nome e e-mail apenas uma vez:

```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu.email@exemplo.com"
```

Se quiser ver a configuração atual:

```bash
git config --list
```

## Comandos Git básicos

### Inicializar um repositório local

```bash
git init
```

### Clonar um repositório remoto

```bash
git clone <url-do-repositorio>
```

### Atualizar o repositório local a partir do remoto

```bash
git pull
```

### Criar uma branch

```bash
git branch <nome-da-branch>
```

### Trocar para outra branch

```bash
git checkout <nome-da-branch>
```

### Criar e trocar para uma branch ao mesmo tempo

```bash
git checkout -b <nome-da-branch>
```

### Adicionar um arquivo específico ao stage

```bash
git add arquivo.txt
```

### Adicionar todos os arquivos modificados ao stage

```bash
git add .
```

### Comitar as alterações

```bash
git commit -m "Mensagem do commit"
```

### Enviar os commits para o repositório remoto

```bash
git push
```

### Exibir o status atual do repositório

```bash
git status
```

### Ver o histórico de commits

```bash
git log --oneline
```

## Dicas rápidas

- Use `git status` antes de cada commit para ver o que mudou.
- Use `git add .` para adicionar todas as alterações, ou `git add <arquivo>` para etapas específicas.
- Sempre escreva mensagens de commit claras e objetivas.

## Bibliografia

- [Post de Thiago Chave](https://www.linkedin.com/feed/update/urn:li:activity:6903496177233600512/?updateEntityUrn=urn%3Ali%3Afs_updateV2%3A%28urn%3Ali%3Aactivity%3A6903496177233600512%2CFEED_DETAIL%2CEMPTY%2CDEFAULT%2Cfalse%29)
- [🛠️ Guia Completo de Comandos para Git](https://www.linkedin.com/pulse/guia-completo-de-comandos-para-git-cristiano-ferreira-mothe-ey4ne/?trackingId=k9f75g41R0q%2Fqzjfr18Brw%3D%3D)
- [Post da Juliana Bitencourt](https://www.linkedin.com/feed/update/urn:li:activity:7224156821194776576/)
