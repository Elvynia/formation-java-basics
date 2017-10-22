/**
 * <h1>II - Types : les types et les variables</h1>
 * <p>
 * En algorithmie, il est souvent nécessaire de mémoriser temporairement une
 * information (écriture dans la mémoire vive), afin de pouvoir réutiliser cette
 * information (lecture dans la mémoire vive) à différents endroits dans les
 * instructions. Lorsque l'on utilise le langage Java, c'est la JVM qui s'occupe
 * d'allouer de l'espace mémoire pour stocker l'information contenu dans les
 * variables.
 * </p>
 * 
 * <h2>1 - Une variable</h2>
 * <p>
 * Stocker une information (souvent appelé <b>valeur</b> de la variable) en
 * mémoire nécessite deux choses : définir de quelle nature est l'information
 * stockée (le <b>type</b>), et définir un <b>identifiant</b> (nom unique).
 * <p>
 * Définir un type sert à récupérer l'information en l'analysant de la bonne
 * manière. En effet, lorsqu'une information est stockée en mémoire, elle n'est
 * qu'une suite de 0 et de 1 binaires, formant plusieurs octets. Ce message
 * binaire doit ensuite être interprété correctement selon si l'information
 * attendue est composée de chiffres, de lettres, ou autres.
 * </p>
 * <p>
 * L'identifiant de la variable permet d'y faire référence dans les instructions
 * du programme. Il doit être unique car il ne doit correspondre qu'à un seul
 * espace mémoire où l'information est stockée, si il y a plusieurs variables du
 * même nom, la machine ne saurait pas à quel endroit de la mémoire chercher la
 * valeur.
 * </p>
 * 
 * <h2>2 - Les identifiants</h2>
 * <p>
 * On parle fréquemment de 'id' comme abbréviation de l'anglais 'identifier', ce
 * qui fonctionne aussi en français. Id est un terme utilisé à beaucoup de
 * niveaux différents en informatique, et toujours pour signifier la même chose,
 * une valeur unique. Pour parler d'unicité, il faut cependant savoir quel est
 * le contexte, le cadre, la limite dans laquelle la valeur doit être unique. Il
 * y a donc pour chaque utilisation d'un identifiant, une limite à associer pour
 * donner du sens à l'unicité. Pour l'identifiant d'une variable, ceci est
 * déterminé par ce qu'on appelle la portée de la variable. Dans le langage
 * Java, une variable est toujours définie à l'intérieur d'un bloc de code
 * ({@link fr.formation.blocs}), et sa portée est égale au limites de ce bloc.
 * L'identifiant de la variable (plus souvent appelé le nom), doit donc être
 * unique parmis les autres noms de variables du même bloc de code.
 * </p>
 * 
 * <h2>3 - Les différents types de types...</h2>
 * <p>
 * En informatique on trouve souvent des concepts organisés en arboresence, un
 * peu comme un arbre généalogique. Lorsque l'on défini un terme général, on va
 * ensuite trouver d'autres termes plus précis qui seront des 'enfants' de ce
 * premier terme générique, afin de classer et catégoriser les éléments. Cette
 * manière de faire facilite grandement la compréhension des concepts
 * théoriques, mais nécessite une certaine habitude.
 * </p>
 * <p>
 * Pour déterminer précisément de quelle nature est l'information stockée par
 * une variable, on classe les types en deux grandes catégories : les primitifs
 * et les objets.
 * </p>
 * 
 * <p>
 * Pour la suite, regardez les packages présents dans 'fr.formation.types'.
 * </p>
 */
package fr.formation.types;