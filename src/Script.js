function jouer() {

    // Générer un nombre aléatoire entre 1 et 100
    let nombreSecret = Math.floor(Math.random() * 100) + 1;

    let essais = 0;
    let maximumEssais = 10;
    let trouve = false;

    // Boucle de jeu
    while (!trouve && essais < maximumEssais) {

        let proposition = parseInt(
            prompt("Devinez un nombre entre 1 et 100 :")
        );

        essais++;

        // Vérification
        if (proposition === nombreSecret) {

            alert("Bravo ! Vous avez gagné en " + essais + " essais.");
            trouve = true;

        } else if (proposition < nombreSecret) {

            alert("Le nombre secret est plus grand.");

        } else {

            alert("Le nombre secret est plus petit.");
        }
    }

    // Si l'utilisateur perd
    if (!trouve) {
        alert(
            "Vous avez perdu ! Le nombre secret était : " + nombreSecret
        );
    }
}