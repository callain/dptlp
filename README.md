# Design Pattern Tête La Première

## Chapitre 1

### Base de l'OO

Abstraction
Encapsulation
Polymorphisme
Héritage

### Principes OO

Encapsulez ce qui varie.
Préférez la composition à l'héritage.
Programmes des interfaces, non des implémentations.

### Points d'impacts

- Connaître les bases de l’OO ne fait pas de vous un bon concepteur.
- Les bonnes conceptions OO sont souples, extensibles et faciles à maintenir.
- Les patterns vous montrent comment construire des systèmes OO de bonne qualité.
- Les patterns résument une expérience éprouvée de la conception objet.
- Les patterns ne contiennent pas de code, mais des solutions génériques aux problèmes de conception. Vous devez les adapter aux applications spécifiques.
- Les patterns ne sont pas inventés, ils sont découverts.
- La plupart des patterns et des principes traitent des problèmes de changement dans le logiciel.
- La plupart des patterns permettent à une partie d’un système de varier indépendamment de toutes les autres.
- On essaie souvent d’extraire ce qui varie d’un système et de l’encapsuler.
- Les patterns fournissent un langage commun qui peut optimiser votre communication avec les
  autres développeurs

## Chapitre 2

### Principes OO

Efforcez-vous de coupler faiblement les objets qui interagissent.

### Points d'impacts

Le pattern Observateur définit entre des objets une relation de type un-à-plusieurs.

- Les Sujets, alias Observables, mettent à jour les Observateurs via une interface commune.
- Les Observateurs sont faiblement couplés, au sens où l’Observable ne sait rien d’eux, en dehors du fait qu’ils implémentent l’interface Observer.
- Vous pouvez « pousser » ou « tirer » les données de l’Observable (tirer est considéré comme plus « correct »).
- Ne faites pas dépendre les observateurs de l’ordre des notifications.
- Java a plusieurs implémentations du pattern Observateur, notamment la classe généraliste Observable dans le package java.util.
- Attention aux problèmes potentiels de l’implémentation de java.util.Observable.
- N’ayez pas peur de créer votre propre implémentation d’Observable si nécessaire.
- Swing utilise intensivement le pattern Observateur, à l’instar de nombreux frameworks de création d’IHM.
- Vous trouverez le pattern à de nombreux autres endroits, en particulier les JavaBeans et RMI.

Note: L'interface Java Observer et la classe Java Observable sont dépréciés.  
(cf http://cr.openjdk.java.net/~iris/se/11/latestSpec/api/java.base/java/util/Observable.html)
