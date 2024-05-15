//Numéros de téléphone
//Écrivez une fonction qui accepte un tableau de 10 entiers (entre 0 et 9) et
// qui renvoie une chaîne sous la
// forme d'un numéro de téléphone.

function CreatePhoneNumber(numero){
    //numéro de telephone avec le tableau

    const premiereParti = numero.slice(0, 3).join('');    
    const deuxiemeParti = numero.slice(3, 6).join('');     
    const troisiemeParti = numero.slice(6).join('');       
    return `(${premiereParti}) ${deuxiemeParti}-${troisiemeParti}`;
}

console.log(CreatePhoneNumber ([1, 2, 3, 4, 5, 6, 7, 8, 9, 0])) //-> "(123) 456-7890"

//La fonction join(delimiter) permet de convertir un tableau en chaîne de caractère






