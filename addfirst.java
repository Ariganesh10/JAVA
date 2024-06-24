import java.util.LinkedList;
class Main{
    public static void main(String[]args){
        LinkedList<String>colors=new LinkedList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("Green");
        colors.addFirst("white");
        colors.addLast("purple");
        colors.clear();
        System.out.println("After clearing the elements");
        colors.add("black");
        colors.add("magenta");
        colors.add("Orange");
        colors.add("Grey");
        System.out.println("After adding new colors");
        colors.removeLast();
        colors.removeFirst();
        System.out.println(colors);
        System.out.println(colors.getFirst());
        System.out.println(colors.getLast());
        System.out.println(colors.size());
        colors.set(1,"meroun");
        System.out.println(colors);
        colors.add(1,"brown");
        System.out.println(colors);
    }
}
