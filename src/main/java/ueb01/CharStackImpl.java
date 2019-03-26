package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {

   private char[]z;

    public CharStackImpl(){
    z = new char[0];
    }

    @Override
    public void push(char c) {
        char[]p = new char[z.length + 1];
        for(int i = 0; i<z.length; i++){
            p[i] = z[i];
        }
        p[z.length] = c;
        z = p;
    }

    @Override
    public char pop() {
        if(z.length == 0) {
            throw new NoSuchElementException();
        }
        char a = z[z.length-1];
        char[]p = new char[z.length-1];
        for(int i = 0; i<z.length-1; i++)
        { p[i] = z[i];
        }
        z =p;
        return a;
    }

    @Override
    public int size() {
        return z.length;
    }

}
