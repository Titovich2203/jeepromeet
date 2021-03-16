package sn.kader.controller;

import sn.kader.repository.DetailPrestationRepository;
import sn.kader.repository.PrestataireRepository;
import sn.kader.repository.PrestationRepository;
import sn.kader.repository.jdbc.DataSource;
import sn.kader.repository.jdbc.JdbcBasedPrestationRepository;
import sn.kader.repository.jdbc.MysqlDataSource;
import sn.kader.repository.ram.ArrayBasedDetailPrestationRepository;
import sn.kader.repository.ram.ListBasedPrestataireRepository;
import sn.kader.service.DisplayService;
import sn.kader.service.MenuService;
import sn.kader.service.console.ConsoleDisplayService;
import sn.kader.service.console.ScannerMenuService;


/**
 * End point destiné aux clients
 * Deux fonctionnalités (services)
 * 1 - Afficher le menu au client : ConsoleDisplayService
 * 2 - Lire les choix du client et afficher le sous-menu correspondant : ScannerMenuService
 */
public class ClientController {
    private final DisplayService displayService ;
    private final MenuService scannerMenuService ;

    public ClientController(){
        DetailPrestationRepository detailPrestationRepository = new ArrayBasedDetailPrestationRepository();
        DataSource dataSource = new MysqlDataSource();
        displayService = new ConsoleDisplayService(detailPrestationRepository);
        PrestationRepository prestationRepository = new JdbcBasedPrestationRepository(dataSource);
        PrestataireRepository prestataireRepository = new ListBasedPrestataireRepository();
        scannerMenuService = new ScannerMenuService(displayService, prestationRepository, prestataireRepository );
    }

    public void process(){

        displayService.afficherBienvenu();
        displayService.afficherMenuPrincipal();
        scannerMenuService.afficherMenu();
    }


}
