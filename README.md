# Exercices - Apache Maven

## Exercice 1 - Découverte et Création du projet

### A. Découverte

Savez-vous quelles versions de Maven et du JDK sont utilisées pour construire vos projets ?

#### 1. Quelle commande faut-il exécuter pour connaître ces informations ?

..............................................................

#### 2. Exécuter la commande Maven et noter le résultat : 

..............................................................

### B. Créer un nouveau projet

La création d'un projet Maven peut se faire de deux manières :

* Manuellement, en créant la structure des répertoires et le fichier _pom.xml_ soi-même.

* Automatiquement, à l'aide des archetypes.

#### 1. Créer le projet _maven-training_ 

A l'aide des archetypes Maven, créer un nouveau projet en respectant les consignes suivantes :

* **Archetype** :  maven-archetype-quickstart 
* **Archetype version** : 1.4 (ou la dernière disponible)
* **groupId** : be.cocoding
* **artifactId** : maven-training
* **version** : 1.0-SNAPSHOT
* **Package** : be.cocoding

#### 2. Combien d'archetypes Maven vous ont été proposés ?

...................................................


## Exercice 2 - Phases du lifecycle

Imaginons un projet Maven ayant tous les plugins nécessaires à l'exécution de tests unitaires et d'intégration.

1. Quelle commande Maven exécuter pour :

* lancer les tests unitaires : ................................

* lancer les tests d'intégration : ...........................

2. Si la commande Maven `mvn clean package` est lancée, les tests sont-ils exécutés ? ......  
Pourquoi ? ................................................

3. Quelles sont les différentes phases Maven exécutées avec la commande Maven `mvn clean install` :  .....................................................................

## Exercice 3 - Reporting

#### 1. Ajout du reporting dans le pom.xml

Dans le projet _maven-training_ (créé dans l'exercice 1), ajouter une section **reporting** dans le fichier _pom.xml_.

Cette section doit définir le plugin `maven-project-info-reports-plugin` du groupe `org.apache.maven.plugins`.  
La version du plugin est **2.6**.

#### 2. Génération du reporting

* Quelle commande Maven faut-il exécuter pour générer les rapports ?

...............................................................

* Où trouve-t-on les rapports une fois la commande Maven terminée ?

...............................................................



## Exercice 4 - Profiles

Dans le projet **Multi Modules** des exercices, le profile `it` doit être défini afin de pouvoir exécuter les tests d'intégration avec le plugin **maven-failsafe-plugin**.

#### 1. Définir le profil `it`

Dans le fichier _pom.xml_ du projet Multi Modules **Demo App**, définir un nouveau profile ayant la valeur `it` comme **id**.  

Ce profile doit ajouter l'exécution, lors du _build_, du plugin suivant :  
* groupId:   org.apache.maven.plugins
* artefactId:  maven-failsafe-plugin
* version: 2.22.2

La définition du plugin doit mentionner également l'exécution des _goals_ suivants:

* integration-tests
* verify


Documentation du plugin:  https://maven.apache.org/surefire/maven-failsafe-plugin/

#### 2. Quelle est la commande pour exécuter `clean install` avec le profile `it` activé ?

...............................................................

#### 3. Lancer la commande Maven `clean install` avec et sans le profile `it` activé.  
Quelles sont les différences entre les deux builds ? 

...............................................................
