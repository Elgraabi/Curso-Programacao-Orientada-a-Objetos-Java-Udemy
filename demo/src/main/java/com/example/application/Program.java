package com.example.application;

import java.sql.Connection;

import com.example.db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conect = DB.getConnection();
		DB.closeConnection();

	}

}
