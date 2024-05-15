// Nombre de personnes dans le bus
// Un bus se déplace en ville, il prend et/ou dépose certaines personnes à chaque arrêt.
// Vous recevez une liste d’entiers. Chaque élément comporte le nombre de personnes qui
// montent dans le bus (le premier élément) et le nombre de personnes qui en sortent (l
// deuxième élément).
// Le 2 e nombre du premier élément de la liste vaut toujours 0 car le bus est vide en arrivant
// au premier arrêt de bus. Votre tâche consiste à renvoyer le nombre de personnes encore
// dans le bus après le dernier arrêt.

function number(busStops) {
    let Passagers = 0;
    for (let i = 0; i < busStops.length; i++) {
        Passagers += busStops[i][0]; //ajoute ce qui montent
        Passagers -= busStops[i][1]; //ce qui sortent
    }
    return Passagers;
}


console.log(number([[10, 0], [3, 5], [5, 8]])); //Donne 5
console.log(number([[3, 0], [9, 1], [4, 10], [12, 2], [6, 1], [7, 10]])); //Donne 17
console.log(number([[3, 0], [9, 1], [4, 8], [12, 2], [6, 1], [7, 8]])); //Donne  21
