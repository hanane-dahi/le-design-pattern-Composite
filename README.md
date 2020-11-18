# design patterns et architectures logicielles
Étude de cas : le design pattern Composite
L’objectif de cette étude de cas est d’introduire le design pattern Composite à travers un exemple et de discuter sa relation avec d’autres design patterns tels que le Singleton. Il s’agit de concevoir et développer une solution orientée objet pour gérer l’espace disque d’un utilisateur Windows. On suppose que l’espace disque de l’utilisateur est composé de fichiers et répertoires tel que :
Les fichiers et les répertoires sont contenus dans des répertoires et possèdent un nom et une taille en nombre d’octets.
L’utilisateur veut calculer la taille de ses fichiers et répertoires sans la stocker si c’est possible.
L’utilisateur veut aussi afficher les éléments de son espace de stockage avec leurs noms et leurs tailles.
