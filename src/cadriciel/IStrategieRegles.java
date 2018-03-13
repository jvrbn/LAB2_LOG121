package cadriciel;

public interface IStrategieRegles{

    Joueur[] calculerVainqueur(Jeu jeu);

    int calculerScoreTour(Jeu jeu);
}