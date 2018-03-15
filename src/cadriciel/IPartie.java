package cadriciel;

/**
 * Interface représentant une partie de jeu.
 */
public interface IPartie {
    public boolean jouerTour();
    public boolean changerJoueur();
    public boolean changerTour();
    public Joueur[] obtenirClassement();
}
