/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
class MultiThreadingFive extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
                
            }
            catch(InterruptedException e){
        }
    }
}
}
public class MT {
    public static void main(String[] args){
        
       
        MultiThreadingFive mt1=new MultiThreadingFive();
            mt1.start();
        }
    }
    

