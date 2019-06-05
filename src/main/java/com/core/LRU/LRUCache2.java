package main.java.com.core.LRU;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache2 {


    // store keys of cache
    static Deque<Integer> dq;
    // store references of key in cache
    static HashSet<Integer> map;
    //maximum capacity of cache
    static int csize;

    LRUCache2(int n)
    {
        dq=new LinkedList<>();
        map=new HashSet<>();
        csize=n;
    }

    /* Refers key x with in the LRU cache */
    public void refer(int x)
    {
        if(!map.contains(x))
        {
            if(dq.size()==csize)
            {
                int last=dq.removeLast();
                map.remove(last);
            }
        }
        else
        {
            dq.remove(x);
        }
        dq.push(x);
        map.add(x);
    }

    // display contents of cache
    public void display()
    {
        Iterator<Integer> itr = dq.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }


    public static void main(String[] args) {
        LRUCache2 ca=new LRUCache2(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }
}
