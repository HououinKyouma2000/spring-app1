package org.example.springcourse;

public class ClassicalMusic implements Music{
    //
    private ClassicalMusic () {}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    //метод который будет запускаться при создании бина
    public void doMyInit() {
        System.out.println("Doing destroy");
    }
    //метод который запущеться перед удалением бина
    public void doMyDestroy() {
        System.out.println("Doing destruction");
    }
    @Override
    public String getSong() {
        return "Mozart";
    }
}
