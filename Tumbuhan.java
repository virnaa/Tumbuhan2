class Tumbuhan {
	private String nama;
	private String namalatin;
	private String daun;
	private String batang;
	private String akar;
	private String bunga;
	private String buah;
	private String kingdom;
	private String divisi;
	private String kelas;
	private String ordo;
	private String famili;
	private String genus;
	private String spesies;
	
	public Tumbuhan(String nama, String namalatin, String daun, String batang, String akar, String bunga, String buah, String kingdom, String divisi, String kelas, String ordo, String famili, String genus, String spesies ){
		this.nama = nama;
		this.namalatin = namalatin;
		this.daun = daun;
		this.batang = batang;
		this.akar = akar;
		this.bunga = bunga;
		this.buah = buah;
		this.kingdom = kingdom;
		this.divisi = divisi;
		this.kelas = kelas;
		this.ordo = ordo;
		this.famili = famili;
		this.genus = genus;
		this.spesies = spesies;
	}
	
	public void keterangan(){
		System.out.println("Tumbuhan ");
	}
	
	public void keterangan(String ket){//overloading
		System.out.println(ket);
	}
	
	public void setNama(String namatumbuhan){
		nama=namatumbuhan;
	}
	
	public String getNama(){
		return nama;
	}
	public void setNamalatin(String namalatint){
		namalatin=namalatint;
	}
	
	public String getNamalatin(){
		return namalatin;
	}
	
	public void setDaun(String jenisdaun){
		daun=jenisdaun;
	}
	
	public String getDaun(){
		return daun;
	}
	
	public void setBatang(String jenisbatang){
		batang=jenisbatang;
	}
	
	public String getBatang(){
		return batang;
	}
	
	public void setAkar(String jenisakar){
		akar=jenisakar;
	}
	
	public String getAkar(){
		return akar;
	}
	
	
	public void setBunga(String jenisbunga){
		bunga=jenisbunga;
	}
	
	public String getBunga(){
		return bunga;
	}
	
	public void setBuah(String jenisbuah){
		buah=jenisbuah;
	}
	
	public String getBuah(){
		return buah;
	}
	
	public void setKingdom(String namakingdom){
		kingdom=namakingdom;
	}
	
	public String getKingdom(){
		return kingdom;
	}
	
	public void setDivisi(String namadivisi){
		divisi=namadivisi;
	}
	
	public String getDivisi(){
		return divisi;
	}
	
	public void setKelas(String namakelas){
		kelas=namakelas;
	}
	
	public String getKelas(){
		return kelas;
	}
	
	public void setOrdo(String namaordo){
		ordo=namaordo;
	}
	
	public String getOrdo(){
		return ordo;
	}
	
	public void setFamili(String namafamili){
		famili=namafamili;
	}
	
	public String getFamili(){
		return famili;
	}
	
	public void setGenus(String namagenus){
		genus=namagenus;
	}
	
	public String getGenus(){
		return genus;
	}
	
	public void setSpesies(String namaspesies){
		spesies=namaspesies;
	}
	
	public String getSpesies(){
		return spesies;
	}
	
	
	
	public void tampil(){
		System.out.println("nama : " +getNama());
		System.out.println("nama latin : " +getNamalatin());
		System.out.println("daun : " +getDaun());
		System.out.println("batang : " +getBatang());
		System.out.println("akar : " +getAkar());
		System.out.println("bunga : " +getBunga());
		System.out.println("buah : " +getBuah());
		System.out.println("kingdom : " +getKingdom());
		System.out.println("divisi : " +getDivisi());
		System.out.println("kelas : " +getKelas());
		System.out.println("ordo : " +getOrdo());
		System.out.println("famili : " +getFamili());
		System.out.println("genus : " +getGenus());
		System.out.println("spesies : " +getSpesies());
	}
}
