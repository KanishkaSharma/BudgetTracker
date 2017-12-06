/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package secure;

/**
 *
 * @author Himanshi-pc
 */
import java.security.SecureRandom;
import java.math.BigInteger;
public class random {
    static String randz()
    {
        String r;
         SecureRandom random = new SecureRandom();
         r=new BigInteger(25, random).toString(32);
         return r;
    }
}
