# Apprendre les bases de l'algorithmie au travers du langage Java

Un algorithme est une suite d'instructions. Une instruction est une "phrase" d'action à effectuer par une machine. Afin d'exécuter un algorithme pour obtenir un résultat, il faut utiliser un langage compréhensible par la machine.

## Comment procéder

Pour apprendre à programmer en Java, vous avez besoin d'un PC où installer les logiciels suivants :
  - Git for Windows
  - Eclipse Java EE (version Oxygen)
  
Ouvrir une invite de comande windows (CMD.exe) et éxécuter les commandes suivantes :
  - mkdir LearnJava (création d'un dossier qui a pour nom 'LearnJava')
  - cd LearnJava (Aller dans le dossier 'LearnJava')
  - git clone https://github.com/Elvynia/formation-java-basics LesBases (Télécharge tout le projet, dont ce fichier que vous lisez, et le place dans un dossier 'LesBases'

Ouvrir Eclipse, menu File -> Import -> Existing Maven Projects -> Sélectionner le dossier 'LesBases', puis cliquer sur Finish.

Dans la vue Project Explorer à gauche, déplier le dossier du projet 'LesBases', et déplier le dossier 'src'. A l'intérieur de ce dossier se trouve tout le code source.

Pour commencez, ouvrez le fichier 'src/fr/package-info.java'.

## Les types primitifs en Java

### short, int et long
Représente des nombres entiers positifs ou négatifs, utilisant respectivement 2, 4 et 8 octets en mémoire.

### float et double
Représente des nombres réels (avec virgule) positifs ou négatifs, utilisant respectivement 4 et 8 octets en mémoire.

### byte
Un byte ne correspond pas à un type d'information en particulier, ce type est souvent utilise comme un tableau de 8 bits.

### char
Représente un caractère, on utilise l'apostrophe plutôt que les guillemets pour déclarer un char (Ex: char c = 'a').

### boolean
Représente une valeur "vraie" ou "fausse", on utilise pour cela les mots-clefs Java 'true' et 'false'. Les booléens sont fréquemment utilisés dans les blocs conditionnels.

## Les blocs de code Java

### if...else if...else
### for
### while
### do...while
### switch...case

## Vocabulaire

### Programmer et Développer
Ces deux termes sont utilisés pour parler d'écrire du code, mais on peut noter une différence entre ces deux mots. Programmer consiste à gérer le code (écrire, modifier, transformer, corriger, étendre...), mais développer sous-entends "programmer dans le contexte d'un sujet d'étude ou d'une problématique". Ce qui comprends bien plus que ce qui concerne le code, comme la compréhension du sujet, la réflexion et la création d'algorithmes (sans utiliser de code, juste avec des phrases pour "mettre à plat" votre réflexion).

### PC : Personal Computer
On parle de PC, d'ordinateur personnel, pour désigner les ordinateurs accessibles au grand public. En français comme en anglais, on parle souvent de "machine" et de "système" pour différencier la partie matérielle/électronique de la partie virtuelle/informatique.

### OS : Operating System
En français on parle de système d'exploitation, c'est le socle informatique qui fait le lien entre vous et les composants matériels de votre machine.

### JVM : Java Virtual Machine
La machine virtuelle de Java est un programme qui permet de simuler virtuellement une machine, un PC, à l'intérieur de votre PC. Cela permet à votre code Java d'être éxécuté à l'intérieur de la machine virtuelle, donc de manière détachée de votre PC. La JVM éxécute votre code Java, et lorsque votre code le nécessite, elle demande des informations ou des ressources au système (l'OS installé sur votre machine). L'installation d'une JVM est donc dépendante de l'OS de la machine ciblée.

### JRE : Java Runtime Environment
Distribution de Java contenant tout le nécessaire pour éxécuter des programmes Java.

### JDK : Java Development Kit
Distribution de Java contenant un JRE et tout ce qui est nécessaire pour développer en Java.
