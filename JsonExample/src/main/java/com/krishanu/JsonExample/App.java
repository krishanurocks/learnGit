package com.krishanu.JsonExample;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class App {
	public static void main(String[] args) {
		try {
			// JSONWriteExample jsonWriteExample = new JSONWriteExample();
			JSONReadExample jsonReadExample = new JSONReadExample();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}