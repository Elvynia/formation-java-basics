// Cette ligne n'est pas du code, mais du commentaire, autrement dit du texte qui sera totalement ignoré par la machine qui interprète le code.
/*
 * Les caractères lignes 2 et 10 permettent d'écrire du commentaire sur plusieurs lignes.
 * Pour lire la suite de la documentation, il faut lire la javadoc, le commentaire qui 
 * apparaît en bleu au lieu du vert. La javadoc est une documentation destinée aux développeurs,
 * c'est pourquoi elle apparait directement dans les fichiers sources qui contiennent le code.
 * La javadoc n'est pas seulement du texte, elle peut contenir du code HTML, il ne faut donc pas 
 * lire le texte entre les lignes 12 et 84, mais utiliser Eclipse. Pour faire cela, il faut laisser
 * la souris en survol sur 'fr' à la ligne 85. 
 */

/**
 * <h1>Bienvenue dans le projet sur les bases de l'algorithmie et le langage
 * Java.</h1>
 * <ul>
 * <h2>Tout d'abord, apprenons à lire correctement les fichiers du projet :</h2>
 * <li>Un fichier dont l'extension est '.java' doit contenir du code source
 * Java, c'est un fichier texte destiné à être lu et modifé par l'humain.</li>
 * <li>Un fichier dont l'extension est '.class' doit contenir du code Java
 * binaire (souvent appelé bytecode), il n'est pas lisible par l'humain et est
 * destiné à être lu par une machine.</li>
 * <li><b>Tous</b> les caractères dans un fichier de code source sont important,
 * et <b>chaque mot</b> a un sens <u>logique</u></li>
 * <li>Eclipse et les éditeurs de code source de manière générale, utilisent une
 * coloration du texte intelligente qui sert à poser des repères pour l'oeil
 * humain. On appelle cela la coloration syntaxique, car les couleurs dépendent
 * des règles de syntaxe du code Java</li>
 * <li>Chaque fichier de code source doit être transformé en un fichier de code
 * binaire, on appelle cela la compilation (chaque '.java' produit un '.class').
 * Eclipse compile automatiquement votre code dès que vous le modifiez</li>
 * <li>Lorsque Eclipse souligne du code en rouge, c'est une erreur qui empêche
 * l'étape de compilation, il est alors impossible d'éxécuter le code, car les
 * fichiers '.class' ne peuvent pas être générés</li>
 * </ul>
 * 
 * <ul>
 * <h2>La structure du projet :</h2>
 * <li>Le dossier 'src' contient l'ensemble du code source (.java)</li>
 * <li>Le dossier 'bin' est créé par Eclipse pour générer les fichiers compilés
 * (.class)</li>
 * <li>La configuration d'Eclipse : dossier '.settings', fichiers '.classpath'
 * et '.project'</li>
 * </ul>
 * 
 * <h2>Premier point de vocabulaire Java : Les packages.</h2>
 * <p>
 * Lorsque l'on gère du code source, on a rapidement beaucoup de fichiers, il
 * devient donc nécessaire de ranger ces fichiers dans différents dossiers. Dans
 * ce projet, les différents exemples de code Java sont rangés dans des dossiers
 * différents, et ils portent chacun un nom significatif (c'est à dire que le
 * nom permet de retrouver le sens logique de se qui se trouve à l'intérieur).
 * </p>
 * <p>
 * Cette hierarchie de dossiers contenue dans 'src' représente les packages
 * Java. Chaque dossier représente donc un package Java. Pour ce projet, le
 * package "racine" (c'est à dire celui qui se trouve en haut de
 * l'arborescence), est celui dans lequel nous nous trouvons : le package 'fr'.
 * Il correspond au dossier du même nom qui se trouve dans 'src'.
 * </p>
 * <p>
 * Dans chaque fichier .java, la <b>première</b> instruction qui apparaît doit
 * <u>toujours</u> être celle du package. Chaque fichier Java doit donc déclarer
 * une instruction 'package xxx;' avec une valeur correspondant au dossier dans
 * lequel il se trouve. Contrairement aux chemins de dossiers/fichiers, pour
 * séparer les package 'parent/enfant' on utilise la syntaxe 'parent.enfant'. Le
 * chemin du dossier 'fr/formation' donne l'instruction 'package fr.formation;'.
 * </p>
 * <p>
 * Les noms de packages représentent très fréquemment des noms de domaines
 * Internet. Par exemple, le package racine est souvent 'com' (pour commercial),
 * 'org' (pour organisationnel), 'fr' (pour france, ou n'importe quelle
 * identifiant de pays), et c'est la même chose pour les noms de domaines. En
 * effet, les noms de domaines sont aussi hierarchiques, et pour un nom de
 * domaine 'mail.google.com', on a le domaine 'mail' qui se trouve à l'intérieur
 * du domaine 'google', et ce dernier se trouve à l'intérieur du domaine 'com'.
 * C'est donc 'com' qui est le domaine racine du site.
 * </p>
 * <p>
 * Prochaine javadoc à lire {@link fr.formation}
 * </p>
 * 
 * <ul>
 * <h2>Notes :</h2>
 * <li>Ce fichier 'package-info.java' est spécial, il sert à écrire la javadoc
 * correspondant au package Java dans lequel il se trouve.</li>
 * </ul>
 */
package fr;
