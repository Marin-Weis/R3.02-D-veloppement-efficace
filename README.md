# R3.02 – Développement efficace  
### Travaux Pratiques (TP1 à TP4) – Année 2025/2026  
**I.U.T. de Vannes – Département Informatique – BUT2**

Ce dépôt regroupe l’ensemble des **TPs du module R3.02 – Structures de données**, encadré par **J.-F. Kamp**.  
L’objectif est de mettre en pratique les notions vues en cours à travers l’implémentation en **Java 17** de différentes structures de données fondamentales (listes, tables de hachage, collections, arbres binaires) tout en respectant les **contrats de conception**, la **généricité**, et les **tests unitaires JUnit4**.

---



## Contenu du dépôt

### **TP1 – Liste chaînée**
Implémentation d’une **liste doublement chaînée avec sentinelle**.  
Création d’une interface `Liste.java` et d’une classe `ListeChainee.java`.  
Mise en œuvre des notions de **pré/post-conditions**, **invariants**, et d’une **classe interne `Element`**.  
Tests unitaires complets avec `TestListeChainee.java`.

---

### **TP2 – Table de Hachage**
Implémentation d’une **table de hachage simplifiée** à partir d’une interface `Table.java`.  
Gestion des **collisions par adressage linéaire circulaire**.  
Introduction d’une **classe interne privée `Tuple`**.  
Tests **JUnit4** et vérification des contrats.

---

### **TP3 – Classe Bag (Sac) et généricité**
Développement d’une **collection générique** `Sac<E>` conforme à l’API Java (`java.util.Collection`).  
Implémentation de la **classe interne `Element`** et d’un **itérateur interne `Itr`** gérant la synchronisation via un compteur de modifications.  
Exploration de la **généricité**, des **itérateurs multiples** et de la **compatibilité avec `AbstractCollection`**.  
Tests approfondis et validation des comportements de l’API Java.

---

### **TP4 – Arbre binaire ordonné et généricité**
Conception d’un **arbre binaire générique** `ArbreBinaire<E, T>` implémentant l’interface `Table<E, T>`.  
Implémentation de la **classe interne `Noeud`**, des **algorithmes d’insertion, recherche, suppression, clonage**, et de l’**affichage textuel/graphique**.  
Vérification de la **hauteur**, de l’**équilibrage (AVL)** et respect des principes de **récursivité**.  
Tests unitaires avec `TestArbreBinaire.java`.

---

## Objectifs pédagogiques
- Comprendre et implanter des **structures de données fondamentales**.  
- Appliquer les notions de **contrat, généricité, encapsulation, classes internes et itérateurs**.  
- Produire un code **propre, documenté (JavaDoc)**, **testé (JUnit4)** et **compilable sous Java 17**.  
- Développer la rigueur du **cycle conception → implémentation → test → validation**.

---

## Chronologie du cours

| Semaine | Sujet | TP associé | Rendu |
|:--:|:--|:--|:--|
| 36 | Cours 1 – Plan, outils, évaluations | — | — |
| 37 | Cours 2 – Liste chaînée | TP1 Liste chaînée | 13/09/2025 |
| 38 | Cours 3 – Table de hachage | TP2 Table de hachage | 20/09/2025 |
| 39 | Cours 4 – Types génériques | TP3 Classe Bag | 27/09/2025 |
| 40–41 | Cours 5–6 – Structures en arbre | TP4 Arbre binaire | 11/10/2025 |
