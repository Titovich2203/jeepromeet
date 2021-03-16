package sn.kader.service.console;

import sn.kader.domain.Prestataire;
import sn.kader.domain.Prestation;
import sn.kader.repository.PrestataireRepository;
import sn.kader.repository.PrestationRepository;
import sn.kader.service.DisplayService;
import sn.kader.service.MenuService;

import java.util.Scanner;

public class ScannerMenuService implements MenuService {
    private final DisplayService displayService;
    private final Scanner scanner;
    private final PrestationRepository prestationRepository;
    private final PrestataireRepository prestataireRepository;

    public ScannerMenuService(DisplayService displayService, PrestationRepository prestationRepository, PrestataireRepository prestataireRepository) {
        this.displayService = displayService;
        this.prestataireRepository = prestataireRepository;
        this.scanner = new Scanner(System.in);
        this.prestationRepository = prestationRepository;
    }


    private String lireChoix() {
        return scanner.next();
    }

    private void afficherMenu( String choix) {
        Prestation[] prestations = prestationRepository.getAll();
        if("l".equalsIgnoreCase(choix)){
            displayService.afficherListeServices(prestations);
            int idPrestation = scanner.nextInt();

            //get prestation by id
            Prestation prestation = prestationRepository.getById(idPrestation);
            //get prestataires by prestation
            Prestataire[] prestataires = prestataireRepository.getAllByPrestation(prestation);
            //afficher les prestataires qui fournissent ce service
            displayService.afficherPrestataires(prestation, prestataires);

            int idPrestataire = scanner.nextInt();
            Prestataire prestataire = prestataireRepository.findById(idPrestataire);
            if(2 == idPrestataire){
                displayService.afficherDetailsPrestation();

                int idDetailPrestation = scanner.nextInt();
                if(3 == idDetailPrestation){
                    displayService.afficherDetailsContrat();
                    displayService.afficherDemandeHeure();
                    String heure = scanner.next();
                    displayService.afficherConfirmation(heure);
                }
            }
        }
        //afficher le menu inconnu
        else {
            displayService.afficherOptionInconnue();
        }
    }

    public void afficherMenu() {
        String choix = lireChoix();
        afficherMenu(choix );
    }
}
