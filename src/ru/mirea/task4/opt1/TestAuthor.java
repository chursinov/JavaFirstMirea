package ru.mirea.task4.opt1;
public class TestAuthor {
    public static void main(String[] args){
        Author odin = new Author("Ivan Podlesny", "1234@gmail.com", 'M');
        odin.setEmail("123456@gmail.com");
        System.out.println(odin.toString());
    }
}
