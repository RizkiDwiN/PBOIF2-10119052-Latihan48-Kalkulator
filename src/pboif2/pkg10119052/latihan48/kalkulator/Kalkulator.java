package pboif2.pkg10119052.latihan48.kalkulator;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * kalkulator berbasis objek
 * 
 */
public class Kalkulator {
    public double value1,value2,add,minus,multiplication,division;

    Kalkulator(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
            }

    
    public double getValue1() {
        
        return value1 ;
    }

    public double getValue2() {
        return value2 ;
    }

    public double getAdd() {
        return add = value1+value2;
    }

    public double getMinus() {
        return minus = value1-value2;
    }

    public double getMultiplication() {
        return multiplication=value1*value2;
    }

    public double getDivision() {
        return division= (value1/value2);
    }
    
   public void hasil(){
       System.out.println("VALUE 1 = "+getValue1());
       System.out.println("VALUE 2 = "+getValue2());
       System.out.println("Project Calculator");
       System.out.println("This project shown you how to manage method in java");
       System.out.println("Result Add is = "+getAdd());
       System.out.println("Result Minus is = "+getMinus());
       System.out.println("Result Multipele is = "+getMultiplication());
       System.out.println("Result Division is = "+getDivision());
   }
}
