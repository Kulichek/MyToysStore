package MyToyStore.Core.UI;

import MyToyStore.Core.MVP.ConsoleView;
import MyToyStore.Core.MVP.Model;
import MyToyStore.Core.MVP.Presenter;

public class App {

    static ConsoleView view = new ConsoleView();
    static Model model = new Model();
    static Presenter presenter = new Presenter(view, model);

    
    public static void startButtonClick() {
        
        boolean RUN = true;

        while (RUN) {
            String userChoice = presenter.showMenu();

            switch (userChoice) {
                case "1":
                    presenter.addToy();
                    break;
                case "2":
                    presenter.printToysFromBox();
                    break;
                case "3":
                    presenter.getPrizeToy();
                    break;
                case "4":
                    presenter.printPrizeToys();
                    break;
                case "5":
                    presenter.getPrizeToyFromQueue();
                    break;
                case "6":
                    presenter.setToyProbability();
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                case "0":
                    RUN = false;
                    presenter.exitApp();
                    break;
                default:
                    presenter.unknownCommand();
            }

        }


    }
    
    // public static void addNewToyBurronClick(){
        
    //     presenter.addToy();
    // }


    
}
