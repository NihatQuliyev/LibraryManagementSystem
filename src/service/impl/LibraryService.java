package service.impl;

import model.Library;

import static util.InputUtil.*;

import static globalData.GlobalData.libraryServices;
public class LibraryService implements service.LibraryService {
    static int id = 0;
    public static Library fillLibrary(){
        String bookName = stringInput("Enter the library name: ");
        String authorName = stringInput("Enter the author name: ");
        String genre = stringInput("Enter the genre name: ");
        short countPage = shortInput("Enter the library count");
        String language= stringInput("Enter the library language: ");
        short prise = shortInput("Enter the prise: ");
        boolean stockStatus  = false;
        Library library = new Library(++id,bookName,authorName,genre,countPage,language,prise,stockStatus);
        return library;
    }
    @Override
        public boolean register()  {
        short count = shortInput("How many Library register? : ");
        if(libraryServices == null) {
            libraryServices = new Library[count];
            for (int i = 0, k = 0; i < count; i++) {
                System.out.println("--------------");
                System.out.println(++k + " . Library");

                Library library = fillLibrary();
                if (library != null) {
                    libraryServices[i] = library;

                } else {
                    Library[] tempLibrary = libraryServices;
                    libraryServices = new Library[tempLibrary.length - (count - i)];
                    int n = 0;
                    for (Library newLibrary : tempLibrary) {
                        libraryServices[n] = newLibrary;
                        n++;

                    }
                }

            }
            System.out.println("--------------");
            System.out.println("register successfully");
        } else {
            Library[] tempLibrary = libraryServices;
            libraryServices = new Library[libraryServices.length + count];
            for (int i = 0, k = 0; i < libraryServices.length; i++) {
                if (i < tempLibrary.length) {
                    libraryServices[i] = tempLibrary[i];
                } else {
                    System.out.println("--------------");
                    System.out.println(++k + " . Library : ");
                    Library library = fillLibrary();
                    if (library != null) {
                        libraryServices[i] = library;
                    } else {
                        Library[] newLibrary = libraryServices;
                        libraryServices = new Library[newLibrary.length - (libraryServices.length - i)];
                        int n = 0;
                        for (Library newLibrary1 : newLibrary) {
                            libraryServices[n] = newLibrary1;
                            n++;
                        }
                    }
                }
            }
            System.out.println("--------------");
            System.out.println("register successfully");
        }
        return false;
    }

    @Override
    public void show()  {
        if(libraryServices == null || libraryServices.length == 0 ) {
        }
        else {
            for (int i = 0; i < libraryServices.length; i++) {
                System.out.println("----------");
                System.out.println(i + 1 + " . Library: ");
                System.out.println(libraryServices[i]);
            }
        }
    }

    public boolean delete()  {
        if (libraryServices == null  || libraryServices.length == 0){
        }
        else {
            long id = longInput("Enter the id: ");
            if (id>=libraryServices.length+1){
            }
            for (Library library : libraryServices) {
                if (library.getId() == id) {
                    Library[] tempLibrary = libraryServices;
                    libraryServices = new Library[tempLibrary.length - 1];
                    int k = 0;
                    for (Library newLibrary : tempLibrary) {
                        if (newLibrary.getId() == id)
                            continue;
                        libraryServices[k] = newLibrary;
                        k++;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean update() {

        return false;
    }
    public void findBookName() {
        if(libraryServices == null || libraryServices.length == 0){
        }
        else{
            String name = stringInput("Enter the book name: ");
            for (int i = 0; i < libraryServices.length; i++) {
                if (libraryServices[i].getBookName().contains(name)) {
                    System.out.println(libraryServices[i]);
                    System.out.println("------------");
                }
            }
        }
    }
}
