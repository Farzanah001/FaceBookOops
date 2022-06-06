package com.facebook;

import java.util.Scanner;

public class MainManagement extends MethodDeclaration {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        MainManagement manage=new MainManagement();
        byte choice;
      do{
          System.out.println("\n\n");
          System.out.println("\t\tFACEBOOK");
          System.out.println("1. View Home Feed");
          System.out.println("2. View Story");
          System.out.println("3. Add Story");
          System.out.println("4. Like Post");
          System.out.println("5. Comment on a Post");
          System.out.println("6. Share a Post");
          System.out.println("7. Give Friend Request");
          System.out.println("8. Accept Friend Request");
          System.out.println("9. Send Message");
          System.out.println("10. Open Messenger");
          System.out.println("11. Exit");
          System.out.println("\n\nEnter your Choice: ");
          choice= scan.nextByte();

          switch (choice){
              case 1:
                  manage.homeFeed();
                  break;
              case 2:
                  manage.viewStory();
                  break;
              case 3:
                  manage.addStory();
                  break;
              case 4:
                  manage.likePost();
                  break;
              case 5:
                  manage.commentPost();
                  break;
              case 6:
                  manage.sharePost();
                  break;
              case 7:
                  manage.requestFriend();
                  break;
              case 8:
                  manage.acceptFriendAccept();
                  break;
              case 9:
                  manage.sendMessage();
                  break;
              case 10:
                  manage.receiveMessage();
                  break;
          }
      }while (choice<=11);
    }
}