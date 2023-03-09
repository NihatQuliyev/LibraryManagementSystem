package service.impl;
import service.LibraryManagementSystem;
import service.LibraryService;
import static util.MenuUtil.entry;
public class LibraryManagement implements LibraryManagementSystem {
    @Override
    public void management() {
        LibraryService libraryService = new service.impl.LibraryService();
        while (true){
            int option = entry();
            switch (option){
                case 1:
                    libraryService.register();
                    break;
                case 2:
                    libraryService.show();
                    break;
                case 3:
                    libraryService.update();
                    break;
                case 4:
                    libraryService.delete();
                    break;
                case 5:
                    libraryService.search();
                    break;
                case 6:
                    libraryService.storageToStock();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

    }
}
