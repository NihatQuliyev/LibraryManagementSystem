package service.impl;

import static util.MenuUtil.entryApp;
public class ManagementService implements service.ManagementService {


    @Override
    public void management() {
        short option = entryApp();
        while (true) {
            LibraryService library = new LibraryService();
            switch (option) {
                case 0:
                    System.exit(-1);
                case 1:
                    library.register();
                    break;
                case 2:
                    library.show();
                    break;
                case 3:
                    library.update();
                    break;
                case 4:
                    library.delete();
                    break;
                case 5:
                    library.findBookName();
                default:
                    System.out.println("Invalid option");

            }
        }
    }
}
