// Moutons perdus
// Chaque semaine (vendredi et samedi soir), un fermier et son fils comptent les moutons revenus dans la
// cour de leur ferme. Ils comptent les moutons revenus le vendredi soir et ceux qui reviennent le samedi
// (Un mouton qui rentre le vendredi ne repart pas le samedi dans la colline).
// Le fermier connait bien sûr le nombre de moutons qu’il a en tout.
// Votre objectif est de calculer la quantité de moutons perdus (non revenus) après les 2 soirées.

function lostSheep(vendredi, samedi, total){

    const totalVendredi = vendredi.reduce((sum, monton) => sum + monton, 0);
    const totalSamedi = samedi.reduce((sum, monton) => sum + monton, 0);
    const totalRetour  = totalVendredi+totalSamedi;
    const perdus = total - totalRetour;
    return perdus;
}


console.log(lostSheep([1,2],[3,4],15)) // -> 5  //1+2=3 revenus vendredi, 7 samedi, il en manque 5
console.log(lostSheep([3,1,2],[4,5],21)) //-> 6
console.log(lostSheep([5,1,4],[5,4],29)) //-> 10
console.log(lostSheep([11,23,3,4,15],[7,14,9,21,15],300)) //-> 178

// la fonction [].concat([]) permet de concatener deux tableaux
