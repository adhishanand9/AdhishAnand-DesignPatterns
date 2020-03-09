package org.example.structural;

abstract class Game{
    abstract void initialize();

    abstract void start();

    abstract void end();

    public final void play(){
        initialize();
        start();
        end();
    }
}

class Checkers extends Game
{
    @Override
    void initialize()
    {
        System.out.println("Checkers Initialized");
    }
    @Override
    void start()
    {
        System.out.println("Checkers Started");
    }
    @Override
    void end()
    {
        System.out.println("Checkers Finished");
    }
}

class Cricket extends Game{
    @Override
    void initialize()
    {
        System.out.println("Cricket Initialized");
    }
    @Override
    void start()
    {
        System.out.println("Cricket Started");
    }
    @Override
    void end()
    {
        System.out.println("Cricket Finished");
    }
}

public class Template
{
    public static void main(String[] args) throws InstantiationException,IllegalAccessException,ClassNotFoundException
    {
        Class cls = Class.forName("org.example.structural.Checkers");
        Game game = (Game)cls.newInstance();
        game.play();
    }
}
