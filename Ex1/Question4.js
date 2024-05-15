
// Filtrer une liste
// Créez une fonction qui prend une liste d'entiers ou de chaînes de caractères et
// renvoie une nouvelle liste
// en ayant filtré uniquement les nombres.

function Filter_list(newList){
    //on verifie si l'element n'est pas nombre et un int si possible ou null sinon
    return newList.filter(item => !isNaN(parseInt(item)));
}

console.log(Filter_list ([1,2, 'a', 'b'])) // -> [1,2]
console.log(Filter_list ([1, 'a', 'b', 0,15]))// -> [1,0,15]
console.log(Filter_list ([1,2, 'aasf', '3', '124', 123]))// -> [1,2,123]
 
// la fonction parseInt(x) converti x en int si possible ou null sinon
