//Tugas 2
//Muhamad Farhan Rajab
//191106041495

package Tugas_PBO;

public class Truk {
//	-muatan : double
	private double muatan;
//	-muatanmaks : double
	  private double muatanmaks;
//	+truk(beratmaks : double)
	  public Truk(double beratmaks){
		  muatanmaks = beratmaks;
	  }
//	+getMuatan() : double
	  public double getMuatan(){
		  return newtsToKilo(muatan);
	  }
//  +getMuatanMaks() : double
	  public double getMuatanMaks(){
		  return muatanmaks;
	  }
//	+tambahMuatan(berat : double) : boolean  
	  public boolean tambahMuatan(double berat){
		  if((newtsToKilo(muatan)+berat) < muatanmaks){
			  muatan = muatan+kiloToNewts(berat);
			  return true;
		  }
		  else{
			  return false;
		  }
	  }
//	+newtsTokilo(berat : double) : double
	   public double newtsToKilo(double berat){
		   berat = berat/9.8;
		   return berat;
	   }
//	+kiloToNewts(berat : double) : double
	   public double kiloToNewts(double berat){
		   berat = berat*9.8;
		   return berat;
	   }
}

