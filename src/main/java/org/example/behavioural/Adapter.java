package org.example.behavioural;

interface Bird{
    void fly();
    
    void makeSound();
}

class HummingBird implements Bird
{
    @Override
    public void fly()
    {
        System.out.println("HummingBird is flying");
    }
    @Override
    public void makeSound()
    {
        System.out.println("Chirp....");
    }
}

interface Crow
{
    void squeak();
}

class PlasticCrow implements Crow
{
    @Override
    public void squeak()
    {
        System.out.println("Cawwwwwww....");
    }
}

class BirdAdapter implements Crow{
    Bird bird;
    public BirdAdapter() {}
    public BirdAdapter(Bird bird)
    {
        this.bird = bird;
    }
    @Override
    public void squeak()
    {
        bird.makeSound();
    }
}

public class Adapter
{
    public static void main(String[] args)
    {
        HummingBird sparrow = new HummingBird();
        Crow duck = new PlasticCrow();
        Crow birdAdapter = new BirdAdapter(sparrow);

        System.out.println("HummingBird");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("Crow");
        duck.squeak();

        System.out.println("Bird Adapter");
        birdAdapter.squeak();
    }
}
