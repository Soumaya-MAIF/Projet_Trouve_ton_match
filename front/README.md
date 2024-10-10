# TROUVE TON MATCH

## Description
Le projet **Trouve ton match** est une application web construite avec un backend basé sur Spring Boot et un frontend basé sur React. Ce projet utilise Gradle comme outil de build pour le backend et npm pour gérer le frontend. Il est conçu pour fournir une architecture full-stack avec une séparation claire entre les deux couches.



## Prérequis

- **JDK 17**: Ce projet utilise Java 17
- **Gradle**
- **Node.js**: Requis pour le frontend basé sur React

## Installation

1. Clonez le dépôt du projet :

   ```bash
   git clone https://github.com/Soumaya-MAIF/Projet_Trouve_ton_match.git

2. Accédez au répertoire du projet : 

    ```bash
    cd ttm
3. Construisez le projet backend avec Gradle :

    ```bash
    ./gradlew build

4. Démarrez l'application Spring Boot en local :

    ```bash
    ./gradlew bootRun

5. Accédez au répertoire du frontend :

    ```bash
    cd front

6. Installez les dépendances du projet frontend :

    ```bash
    npm install

6. Démarrez l'application React en mode développement :

    ```bash
    npm start

## Scripts disponibles (Frontend)

Dans le répertoire front, vous pouvez exécuter les scripts suivants :

Pour lancer l'application en mode développement :

    npm install


Ouvrez http://localhost:3000 pour la voir dans votre navigateur

Les modifications dans le code seront rechargées automatiquement

Pour lancer les tests unitaires en mode interactif :

    npm test

Pour construit l'application :

    npm run build


## Tests
Pour exécuter les tests unitaires backend :

    ./gradlew test

Pour exécuter les tests unitaires frontend :

    npm test



