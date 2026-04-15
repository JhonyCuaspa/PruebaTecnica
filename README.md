# 🧪 Automatización de Inicio de Sesión (SauceDemo)

## 📌 Descripción

Este proyecto contiene la automatización de pruebas para el flujo de inicio de sesión de la aplicación web:
👉 https://www.saucedemo.com/

Se implementa utilizando el patrón **Screenplay** con **Serenity BDD**.

---

## 🎯 Objetivo

Evaluar la capacidad para diseñar y automatizar un conjunto de pruebas básicas sobre un flujo real en web, validando escenarios de inicio de sesión.

---

## ⚙️ Tecnologías utilizadas

* **Framework:** Serenity BDD (con Screenplay)
* **Lenguaje:** Java
* **Gestor de dependencias:** Gradle
* **Enfoque:** BDD

---

## 📂 Estructura del proyecto

```
src
├── main
│   └── java
│       └── com.saucedemo
│           ├── hook
│           ├── questions
│           ├── tasks
│           ├── userinterfaces
│           └── utils
│
├── test
│   ├── java
│   │   └── com.saucedemo
│   │       ├── runners
│   │       └── stepdefinitions
│   │
│   └── resources
│       └── features
│           ├── inicio-sesion.feature
│           ├── inicio-sesion-fallido.feature
│           └── validacion-campos-inicio-sesion.feature
│
└── serenity.conf
```

---

## 🚀 Alcance de la automatización

Se automatizaron los siguientes escenarios:

* ✅ Inicio de sesión exitoso
* ❌ Inicio de sesión fallido (contraseña inválida)
* ⚠️ Validación de campos obligatorios (usuario y contraseña)

---

## ▶️ Ejecución de pruebas

Para ejecutar las pruebas:

```bash
./gradlew clean test aggregate
```
---

## 📊 Reportes

Serenity genera reportes detallados en:

```
target/site/serenity/index.html
```
---

## 👨‍💻 Autor

Proyecto desarrollado como prueba técnica de automatización por Jhony Cuaspa.
