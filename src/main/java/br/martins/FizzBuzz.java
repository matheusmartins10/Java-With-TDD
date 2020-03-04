package br.martins;

/**
 * FizzBuzz
 */
public class FizzBuzz {

      public String concat(int valor){
          if(valor <= 0){
              return "";
          }
          if(valor % 3 == 0 && valor % 5 == 0){
              return "FizzBuzz";
          }
          if(valor % 3 == 0){
              return "Fizz";
          }if(valor % 5 == 0){
              return "Buzz";
          }
          else{
              return valor + "";
          }
      }

}
