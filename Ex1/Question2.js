// Carte crédit – 4 derniers chiffres
// Habituellement, lorsque vous achetez quelque chose, on vous demande votre numéro de carte de crédit,
// votre numéro de téléphone ou votre réponse à une question secrète. Cependant, comme quelqu'un pourrait
// regarder par-dessus votre épaule, vous ne voulez pas que cela s'affiche sur votre écran. Votre tâche
// consiste à écrire une fonction maskify, qui modifie tous les caractères en '#' sauf les quatre derniers.


function maskify(carteCredit) {
    //verifie si inferieure ou egale à 4
    if (carteCredit.length <= 4) {
        return carteCredit;
    }
    const masquerParti = '#'.repeat(carteCredit.length - 4);
    const visibleParti = carteCredit.slice(-4);
    return masquerParti + visibleParti;
}

console.log(maskify('4556364607935616'));//-> '############5616'
console.log(maskify('1'));//-> '1'
console.log(maskify('11111'));//-> '#1111'

// La fonction "a".repeat(3) ecrit 3 fois la lettre "a"
// La fonction slice(index, lenght) decoupe une chaine de caracteres
