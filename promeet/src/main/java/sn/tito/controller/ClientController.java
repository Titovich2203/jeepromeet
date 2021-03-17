package sn.tito.controller;

import sn.tito.repository.DetailPrestationRepository;
import sn.tito.repository.PrestataireRepository;
import sn.tito.repository.PrestationRepository;
import sn.tito.repository.jdbc.DataSource;
import sn.tito.repository.jdbc.JdbcBasedPrestationRepository;
import sn.tito.repository.jdbc.MysqlDataSource;
import sn.tito.repository.ram.ArrayBasedDetailPrestationRepository;
import sn.tito.repository.ram.ListBasedPrestataireRepository;
import sn.tito.service.DisplayService;
import sn.tito.service.MenuService;
import sn.tito.service.console.ConsoleDisplayService;
import sn.tito.service.console.ScannerMenuService;


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
