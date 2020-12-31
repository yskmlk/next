package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static TodoFunction  myTodoList  = new TodoFunction();

    public static void main(String[] args) {
	int command = 0;

	boolean exit = false;

	printCommand();
	while (!exit){
        System.out.println("Enter your choices/commands: ");
        command = scanner.nextInt();
        scanner.nextLine();

        switch (command){
            case 0:
                printCommand();
                break;

            case 1:
                myTodoList.printTodoList();
            case 2:
                addItem();
                break;
            case 3:
                updateItem();
                break;
            case 4:
                removeItem();
                break;
            case 5:
                searchItem();
                break;
            case 6:
                exit = true;
                break;

                default:
                    System.out.println(" please pic from only given fetures");


        }
    }


    }

    public static void printCommand(){
        System.out.println
                ("\n Commands: " +
                        "\n press 0 : To print instructions " +
                        "\n press 1 : To print all lists " +
                        "\n press 2 : To add list in todo " +
                        "\n press 3 : To modify item in ToDo " +
                        "\n press 4 : To remove item from Todo " +
                        "\n press 5 : To search an item from todo " +
                        "\n press 6 : To exit the app "  );


    }

    public static void addItem(){
        System.out.println("Enter Item to be added in ToDo List");
        myTodoList.addItem(scanner.nextLine());



    }


    public static void updateItem(){
        System.out.println("enter the item number: ");
        int index =scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Enter  new Item to be added");
        String myNewItem = scanner.nextLine();
        myTodoList.updateTodo(index -1 , myNewItem);
    }

    public static void removeItem(){
        System.out.println( " enter the item to be removed");
        int index = scanner.nextInt();
        scanner.nextLine();
        myTodoList.removeItem(index -1 );
    }



    public static void searchItem(){
        System.out.println("Enter string to be searched");
        String searchItem = scanner.nextLine();
        if (myTodoList.findItem(searchItem) == null)  {

            System.out.println(" Item was not found in your ToDo list");


        }else {
            System.out.println(searchItem  + "was found in your list");

        }

    }




}







