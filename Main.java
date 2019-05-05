public class Main{
	public static void main(String[] args){
	Mangga mangga = new Mangga("Mangga","Mangifera indica L", "Tunggal","keras,kuat","tunggang & cabang","Majemuk", "batu berdaging panjang","plantae","Tracheophyta","Magnoliopsida","Sapindales","Anacardiaceae","Mangifera L.", "Mangifera indica L." );
	mangga.keterangan();
	mangga.keterangan("Tumbuhan yang menghasilkan buah yang enak");
	mangga.tampil();
	System.out.println("----------");
	Singkong singkong = new Singkong("Singkong","Manihot utillissima", "Lonjong","bulat panjang, berkayu","umbian panjang","tdk ada", "tdk ada","plantae","Tracheabionta","Magnoliophyta","Magnoliopsida","Euphorbiales","Manihot Mill", "Manihot esculenta Crantz" );
	singkong.keterangan();
	singkong.keterangan("Tumbuhan yang menghasilkan umbi-umbian yang bergizi");
	singkong.tampil();
	System.out.println("----------");
	Jati jati = new Jati("Jati","Tectona grandis L.", "Silang,elips","besar,tinggi","tunggang, serabut","biseksual", "buah batu","plantae","Tracheophyta","Magnoliopsida","Lamiales","Lamiaceae","Tectona L. f.", "Tectona grandis L. f." );
	jati.keterangan();
	jati.keterangan("Tumbuhan yang menghasilkan kayu yang berkualitas");
	jati.tampil();
	}
}
