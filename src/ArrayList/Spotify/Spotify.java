package ArrayList.Spotify;
import java.util.Scanner;

public class Spotify {
    public static void main(String[] args) {

        SongList spotify = new SongList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your homemade Spotify! Choose an option: ");

        while (true) {
            System.out.println("1 - Add a new song ");
            System.out.println("2 - Remove a song");
            System.out.println("3 - Show all songs");
            System.out.println("4 - Edit a song ");
            System.out.println("5 - Search for a song ");
            System.out.println("6 - Exit the program");


            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input){
                case 1:
                    System.out.println("Enter title of song you want to add:");
                    String songTitleAdd = scanner.nextLine();
                    spotify.addSong(new Song(songTitleAdd));
                    break;
                case 2:
                    System.out.println("Enter title of song you want to remove:");
                    String songTitleRemove = scanner.nextLine();
                    spotify.removeSong(new Song(songTitleRemove));
                    break;
                case 3:
                    System.out.println("Here's your current playlist:");
                    for (int i = 0; i < spotify.songList.size(); i++) {
                        System.out.println((i + 1) + ". " + spotify.songList.get(i).toString());
                    }
                    break;
                case 4:
                    System.out.println("Enter the index of the song you want to edit (0-based):");
                    int index = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.println("Enter new title for the song:");
                    String newTitle = scanner.nextLine();
                    spotify.editTitle(index, newTitle);  // Edit title of the song at index
                    break;

                case 5:
                    System.out.println("Enter title of song you want to search for:");
                    String songTitleSearch = scanner.nextLine();
                        if (spotify.contains(songTitleSearch)) {
                            System.out.println("Yes, the song is on the list.");
                            break;
                        } else {
                            System.out.println("Sorry, the title is not on the list.");
                            continue;
                        }
                case 6:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}