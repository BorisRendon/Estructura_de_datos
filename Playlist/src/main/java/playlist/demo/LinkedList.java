package playlist.demo;




public class LinkedList {
    Node head;
    Node nowplaying;
    LinkedList(){
        this.head = null;
    }

    static class Node{
        Song data;
        Node next;
        Node previous;

        Node(Song so, Node nextt, Node prev){
            data=so;
            next = nextt;
            previous = prev;
        }
        public void CambioData(Song newd){
            data = newd;
        }

        public Node getPrevious() {
            return previous;
        }

        public Song getData(){
            return data;
        }
        public void chngnext(Node newNext){
            next=newNext;

        }
        public Node Getnext(){
            return next;
        }
    }
    public void   insert(Song added) {
       /* Node new_node = new Node(data);
        new_node.next = null;*/

        if (this.head == null) {
            Node firstnode = new Node(added,null,null);
            this.head=firstnode;
        } else {
            Node curr = this.head;
            while (curr.Getnext() != null) {
                curr = curr.Getnext();
            }
            Node newn = new Node(added,nowplaying,curr);
            curr.chngnext(newn);
        }
    }
    public String NextSong() {
        String sonando = "";
        if (this.nowplaying == null) {
            if(this.head == null){
                sonando = "La lista está vacia!";
            }else{
                sonando = this.head.getData().PlaySong();
                this.nowplaying=this.head;

            }

        }else{
            Node curr = this.nowplaying;
            if(curr.Getnext()==null){
                sonando = "Ya no hay mas canciones";
                this.nowplaying=null;
            }else{
                sonando = curr.Getnext().getData().PlaySong();
                this.nowplaying=curr.Getnext();
            }
        }
        return sonando;
    }
    public String PreviusSong(){
        Node curr = this.nowplaying;
        String sonando = "";
        if(curr == null){
            sonando = "There's no previus song";
            if (this.head == null){
                sonando= "There's no songs";
            }
        }else {
            if (curr.getPrevious() == null){
                sonando = "Estas en la primera cancion de la platylist, no hay previous.";
            }else{
                sonando=curr.getPrevious().getData().PlaySong();
                this.nowplaying = curr.getPrevious();
            }


        }


        return sonando;
    }

    public String PrintList(){
        String playlist = "------------------------------\n";
        if (this.head == null){
            playlist+= "La playlist está vacia";
        }else{
            Node curr = this.head;
            playlist+= this.head.getData().SongInfo()+"\n ----------------------\n";
            while (curr.Getnext()!=null){
                curr=curr.Getnext();
                playlist+= curr.getData().SongInfo()+"\n-------------------------\n";
            }
        }
        return playlist;
    }

    public String play(){
        Node curr = this.head;
        String play = " ";
        if (this.head == null){
            play = "la lista esta vacia";
        }else{
            play = curr.getData().PlaySong();
            this.nowplaying=curr;

        }
        return play;

    }

    /*public static void printList(LinkedList list){
        Node currentNode = list.head;
        System.out.println("Songs: ");
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode=currentNode.next;
            }
        }*/



}
