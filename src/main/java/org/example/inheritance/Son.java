package org.example.inheritance;

import java.io.FileNotFoundException;
import java.net.SocketException;

/**
 * 重写原来还可以重写爷爷的方法。
 */
public class Son extends Dad {
    public Son() {
        super("1");
        int a = super.b;
    }

    @Override
    public void ThrowableAlone() throws FileNotFoundException {
        try{
            throw new FileNotFoundException();
        }catch (FileNotFoundException e ){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }

}
