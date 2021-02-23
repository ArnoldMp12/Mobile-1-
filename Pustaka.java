package com.Quis2;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Pustaka extends SQLiteOpenHelper {
 
	private static final String DATABASE_NAME = "buku.db";
	private static final int DATABASE_VERSION= 1;
	
	public Pustaka(Context context){
		super(context,DATABASE_NAME, null,DATABASE_VERSION);
	}
	
	
	@Override
	public void onCreate(SQLiteDatabase db){
		String sql = "CREATE TABLE buku(Kode_Buku integer primary key, "
				+"Judul_Buku text null, Pengarang text null, Kategori text null, Penerbit text null);";
		Log.d("Data","onCreate: " +sql);
		db.execSQL(sql);
		 
		sql = "INSERT INTO buku (Kode_Buku, Judul_Buku, Pengarang, Kategori, Penerbit)VALUES('B001', "
				+"'Sistem Operasi', 'Kusrini' , 'Analisis' , 'Andi Offset');";
		db.execSQL(sql);
		
		
		sql = "INSERT INTO buku (Kode_Buku, Judul_Buku, Pengarang, Kategori, Penerbit)VALUES('B002', "
				+"'Disain Grafis', 'Sutoyo' , 'Design' , 'Andi Offset');";
		db.execSQL(sql);
		
	
		sql = "INSERT INTO buku (Kode_Buku, Judul_Buku, Pengarang, Kategori, Penerbit)VALUES('B003', "
				+"'Pemograman Mobile', 'Wijayanto' , 'Pemograman' , 'Andi Offset');";
		db.execSQL(sql);
		
		
		sql = "INSERT INTO buku (Kode_Buku, Judul_Buku, Pengarang, Kategori, Penerbit)VALUES('B004', "
				+"'Pemograman Visual', 'Wijayanto' , 'Pemograman' , 'Andi Offset');";
		db.execSQL(sql);
		
		
		sql = "INSERT INTO buku (Kode_Buku, Judul_Buku, Pengarang, Kategori, Penerbit)VALUES('B005', "
				+"'UML', 'Kusrini' , 'Analisis' , 'Andi Offset');";
		db.execSQL(sql);
		
		
	}	
	
	@Override
	
	public void onUpgrade(SQLiteDatabase db, int argl, int arg2) {
	
	}
	
}