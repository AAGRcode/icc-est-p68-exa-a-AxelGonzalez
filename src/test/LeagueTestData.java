package test;

import models.League;
import models.Team;
import models.Player;

public class LeagueTestData {

        /**
         * Crea el arreglo de ligas de prueba.
         *
         * Valores esperados de getTotalActiveGoals():
         * Liga Pro Ecuador = 42
         * Premier League = 67
         * La Liga Espana = 58
         * Serie A Italia = 35
         * Bundesliga = 74
         * Ligue 1 Francia = 29
         * MLS USA = 51
         * Liga MX Mexico = 46
         *
         * @return arreglo de 8 ligas
         */
        public static League[] createLeagues() {

                // ===== Liga Pro Ecuador: total active goals = 42 =====
                Player[] barcelonaPlayers = {
                                new Player("Gonzalo Mastriani", 15, true),
                                new Player("Byron Castillo", 4, false),
                                new Player("Damian Diaz", 10, true)
                };
                Player[] emelecPlayers = {
                                new Player("Joao Rojas", 11, true),
                                new Player("Alexis Zapata", 5, false),
                                new Player("Ivan Caicedo", 6, true)
                };
                Team[] lpeTeams = {
                                new Team("Barcelona SC", barcelonaPlayers),
                                new Team("Emelec", emelecPlayers)
                };
                League ligaProEcuador = new League("Liga Pro Ecuador", lpeTeams);

                // ===== Premier League: total active goals = 67 =====
                Player[] cityPlayers = {
                                new Player("Erling Haaland", 30, true),
                                new Player("Phil Foden", 12, false),
                                new Player("Kevin De Bruyne", 8, true)
                };
                Player[] arsenalPlayers = {
                                new Player("Bukayo Saka", 18, true),
                                new Player("Gabriel Martinelli", 10, false),
                                new Player("Kai Havertz", 11, true)
                };
                Team[] prlTeams = {
                                new Team("Manchester City", cityPlayers),
                                new Team("Arsenal", arsenalPlayers)
                };
                League premierLeague = new League("Premier League", prlTeams);

                // ===== La Liga Espana: total active goals = 58 =====
                Player[] madridPlayers = {
                                new Player("Vinicius Jr", 22, true),
                                new Player("Luka Modric", 5, false),
                                new Player("Jude Bellingham", 15, true)
                };
                Player[] barcelonaFCPlayers = {
                                new Player("Robert Lewandowski", 14, true),
                                new Player("Pedri", 5, false),
                                new Player("Raphinha", 7, true)
                };
                Team[] lleTeams = {
                                new Team("Real Madrid", madridPlayers),
                                new Team("FC Barcelona", barcelonaFCPlayers)
                };
                League laLiga = new League("La Liga Espana", lleTeams);

                // ===== Serie A Italia: total active goals = 35 =====
                Player[] interPlayers = {
                                new Player("Lautaro Martinez", 16, true),
                                new Player("Henrikh Mkhitaryan", 6, false),
                                new Player("Marcus Thuram", 9, true)
                };
                Player[] juventusPlayers = {
                                new Player("Dusan Vlahovic", 10, true),
                                new Player("Federico Chiesa", 8, false),
                                new Player("Adrien Rabiot", 5, false)
                };
                Team[] saiTeams = {
                                new Team("Inter Milan", interPlayers),
                                new Team("Juventus", juventusPlayers)
                };
                League serieA = new League("Serie A Italia", saiTeams);

                // ===== Bundesliga: total active goals = 74 =====
                Player[] bayernPlayers = {
                                new Player("Harry Kane", 35, true),
                                new Player("Leroy Sane", 10, false),
                                new Player("Jamal Musiala", 18, true)
                };
                Player[] dortmundPlayers = {
                                new Player("Niclas Fullkrug", 12, true),
                                new Player("Marco Reus", 8, false),
                                new Player("Emre Can", 9, true)
                };
                Team[] blaTeams = {
                                new Team("Bayern Munich", bayernPlayers),
                                new Team("Borussia Dortmund", dortmundPlayers)
                };
                League bundesliga = new League("Bundesliga", blaTeams);

                // ===== Ligue 1 Francia: total active goals = 29 =====
                Player[] psgPlayers = {
                                new Player("Kylian Mbappe", 14, true),
                                new Player("Marco Asensio", 7, false),
                                new Player("Lee Kang-in", 8, true)
                };
                Player[] monacoPlayers = {
                                new Player("Wissam Ben Yedder", 7, true),
                                new Player("Aleksandr Golovin", 5, false),
                                new Player("Takumi Minamino", 5, false)
                };
                Team[] l1Teams = {
                                new Team("PSG", psgPlayers),
                                new Team("Monaco", monacoPlayers)
                };
                League ligue1 = new League("Ligue 1 Francia", l1Teams);

                // ===== MLS USA: total active goals = 51 =====
                Player[] miamiPlayers = {
                                new Player("Lionel Messi", 22, true),
                                new Player("Sergio Busquets", 3, false),
                                new Player("Luis Suarez", 12, true)
                };
                Player[] galaxyPlayers = {
                                new Player("Riqui Puig", 10, true),
                                new Player("Gabriel Pec", 7, false),
                                new Player("Marco Reus", 7, true)
                };
                Team[] mlsTeams = {
                                new Team("Inter Miami", miamiPlayers),
                                new Team("LA Galaxy", galaxyPlayers)
                };
                League mls = new League("MLS USA", mlsTeams);

                // ===== Liga MX Mexico: total active goals = 46 =====
                Player[] americaPlayers = {
                                new Player("Henry Martin", 18, true),
                                new Player("Jonathan Rodriguez", 9, false),
                                new Player("Alvaro Fidalgo", 10, true)
                };
                Player[] chivasPlayers = {
                                new Player("Roberto Alvarado", 12, true),
                                new Player("Alexis Vega", 8, false),
                                new Player("Isaac Brizuela", 6, true)
                };
                Team[] lmxTeams = {
                                new Team("Club America", americaPlayers),
                                new Team("Chivas Guadalajara", chivasPlayers)
                };
                League ligaMX = new League("Liga MX Mexico", lmxTeams);

                return new League[] {
                                ligaProEcuador, // 42
                                premierLeague, // 67
                                laLiga, // 58
                                serieA, // 35
                                bundesliga, // 74
                                ligue1, // 29
                                mls, // 51
                                ligaMX // 46
                };
        }
}
