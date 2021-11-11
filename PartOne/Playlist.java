package PartOne;
import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Song One");
        desertIslandPlaylist.add("Song Two");
        desertIslandPlaylist.add("Song Three");
        desertIslandPlaylist.add("Song Four");
        desertIslandPlaylist.add("Song Five");
        desertIslandPlaylist.add("Song Six");
        desertIslandPlaylist.add("Song Seven");
        System.out.println(desertIslandPlaylist.toString());

        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove("Song Three");
        desertIslandPlaylist.remove("Song Six");

        System.out.println(desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist.toString());

        int indexA = desertIslandPlaylist.indexOf("Song One");
        int indexB = desertIslandPlaylist.indexOf("Song Seven");
        String tempA = "Song One";
        desertIslandPlaylist.set(indexA, "Song Seven");
        System.out.println(desertIslandPlaylist.toString());
        desertIslandPlaylist.set(indexB, tempA);
        System.out.println(desertIslandPlaylist.toString());
    }

}