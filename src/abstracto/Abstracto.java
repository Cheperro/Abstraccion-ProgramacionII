/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto;

/**
 *
 * @author chepe
 */
public class Abstracto {

    public static void main(String[] args) {
       Planta planta = new Planta();
       AnimalCarnivoro carnivoro = new AnimalCarnivoro();
       AnimalHervivoro hervivoro = new AnimalHervivoro();
       
       planta.comer();
       carnivoro.comer();
       hervivoro.comer();
    }
    
}
