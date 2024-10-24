/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
class MultiThreadingThree extends Thread{
    int threadNumber;
    MultiThreadingThree(int tNo){
        this.threadNumber=tNo;
        
        
    }

    MultiThreadingThree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println("Task"+i+ "by ThreadNumber "+ threadNumber);
            try{
                Thread.sleep(1000);
                
            }
            catch(InterruptedException e){
        }
    }
}
}
public class MTCC {
    public static void main(String[] args){
        for(int i=1;i<8;i++){
            MultiThreadingThree mt1=new MultiThreadingThree(i);
            mt1.start();
        }
    }
    
}
