package org.example.structural;

interface Container
{
    IteratorDemo getIterator();
}

interface IteratorDemo{
    boolean hasNext();
    
    Object next();
}


class NameCollection implements Container {
    public String[] name = {"Adhish", "Rajat", "Karan", "Sidharth", "Rhea"};
    @Override
    public IteratorDemo getIterator() { return new IterateNameCollection(); }
    private class IterateNameCollection implements IteratorDemo
    {
        int n;
        @Override
        public boolean hasNext()
        {
            return n < name.length;
        }
        @Override
        public Object next() {
            if (this.hasNext())
                return name[n++];
            else
                return null;
        }
    }
}

public class NameIterator
{
    public static void main(String[] args)
    {
        NameCollection companyRepository = new NameCollection();
        for (IteratorDemo iter = companyRepository.getIterator(); iter.hasNext(); )
        {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
