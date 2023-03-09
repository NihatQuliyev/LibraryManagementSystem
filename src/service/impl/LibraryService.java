package service.impl;
import model.Library;
import static util.MenuUtil.*;
import static util.InputUtil.*;
import static helper.ServiceHelper.*;
import static globalData.GlobalData.libraries;
public class LibraryService implements service.LibraryService {
    @Override
    public void register() {
        int count = intInput("Enter the count: ");
        for (int i = 0; i < count; i++) {
            System.out.println(i+1 + " Book");
            libraries.add(fillLibrary());
        }
        System.out.println("Successfully\n");
    }
    @Override
    public void show() {
        if (libraries != null && libraries.size() != 0) {
            int option = entryShow();
            if (option == 1) {
                int number = 1;
                for (Library library : libraries) {
                    System.out.println(number++ + " book \n" + library.info());
                }
                if (libraries != null) {
                    number = 1;
                    detailBook();
                }
            } else if (option == 2) {
                int number = 1;
                for (Library library : libraries) {
                    if (library.getStockStatus() == 1) {
                        System.out.println(number++ + " book \n" + library.info());
                    }
                }
                if (libraries != null) {
                    number = 1;
                    detailBook();
                }
            }
        }
        else {
            System.out.println("Invalid option");
        }
    }
    @Override
    public boolean update() {

        return false;
    }
    @Override
    public boolean delete() {
        boolean isTrue = false;
        if (libraries != null && libraries.size() != 0) {
            int id = intInput("Enter the id :");
            for (Library library : libraries) {
                if (library.getId() == id) {
                    libraries.remove(library);
                    isTrue = true;
                }
            }
            if (isTrue == true) {
                System.out.println("Successfully");
            } else {
                System.out.println("Invalid id");
            }
        }
        else {
            System.out.println("Invalid option");
        }
        return isTrue;
    }
    public void search() {
        if (libraries != null && libraries.size() != 0) {
            byte option = entrySearch();
            switch (option) {
                case 1:
                    nameSearch();
                    break;
                case 2:
                    authorSearch();
                    break;
                case 3:
                    genreSearch();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
        else {
            System.out.println("Invalid option");
        }
    }
    @Override
    public void storageToStock() {
        if (libraries != null && libraries.size() != 0) {
            String bookName = stringInput("Enter the book name : ");
            for (Library library : libraries) {
                if (library.getName().equals(bookName)) {
                    library.setStockStatus((byte) 1);
                }
            }
        }
        else {
            System.out.println("Invalid option");
        }
    }
}