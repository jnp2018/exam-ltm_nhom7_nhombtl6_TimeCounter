/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Admin
 */
public class Reset implements Runnable{
    private final ShareData shareData;
    public Reset(ShareData shareData){
        this.shareData = shareData;
    }
    @Override
    public void run() {
        this.shareData.reset();
    }
    
}
