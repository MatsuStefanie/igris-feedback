# IGRIS 📬 Feedback System com Kafka, Spring Security e Spring Cloud

Sistema simples e escalável para envio e consumo de feedbacks de forma assíncrona, usando Apache Kafka, Spring Boot, Spring Security e Spring Cloud.

---

## 📌 Visão Geral

Este projeto permite que usuários autenticados enviem feedbacks, que são processados de forma assíncrona e visualizados por administradores. A arquitetura utiliza Kafka para desacoplar o envio e o processamento dos dados, promovendo escalabilidade e performance.

---

## 🧱 Arquitetura

- **Feedback Service**: Exposto via REST. Envia feedbacks autenticados e publica eventos no Kafka.
- **Consumer Service**: Escuta eventos no Kafka e salva os feedbacks no banco de dados.
- **Auth & Gateway**: Usa Spring Security + JWT e Spring Cloud Gateway para segurança e roteamento.
- **Spring Cloud Config (opcional)**: Centraliza a configuração dos serviços.

---

## ⚙️ Tecnologias Utilizadas

- ✅ Spring Boot
- ✅ Spring Security + JWT
- ✅ Spring Cloud Gateway
- ✅ Spring Kafka
- ✅ Apache Kafka
- ✅ MongoDB ou PostgreSQL
- ✅ Spring Cloud Config (opcional)

---

## 🔄 Fluxo de Funcionamento

1. O usuário se autentica e recebe um token JWT.
2. Envia um feedback via `POST /feedback`.
3. O serviço publica um evento `FeedbackSubmitted` no Kafka.
4. O Consumer Service escuta e armazena o feedback no banco.
5. O Admin pode visualizar os feedbacks via `GET /admin/feedbacks`.

---

## 🛣️ Endpoints Principais

| Método | Endpoint              | Acesso        | Descrição                    |
|--------|------------------------|---------------|------------------------------|
| POST   | `/feedback`            | `ROLE_USER`   | Envia um feedback            |
| GET    | `/admin/feedbacks`     | `ROLE_ADMIN`  | Lista feedbacks recebidos    |

---

## 🚀 Como Rodar o Projeto

Em breve...

---

## 🧠 Ideias Futuras

- Painel com WebSocket para feedbacks em tempo real
- Moderação e resposta a feedbacks
- Dashboards com métricas de feedback

---

## 📚 Aprendizados

Este projeto é uma ótima introdução prática para:
- Arquitetura orientada a eventos
- Segurança com JWT e roles
- Uso de Kafka com Spring
- Criação de microserviços com Spring Cloud

---

Feito com 💙 por Stefanie Souza Vidal
