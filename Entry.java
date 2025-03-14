package com.assignment.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Entry {
	public static void main(String[] args) {
        System.out.println("Choose an option: ");
        System.out.println("1. Encrypt and Write to File");
        System.out.println("2. Read and Decrypt from File");
        int choice = ConsoleInput.getInteger();
        
        System.out.println("Enter the full path of the File: ");
        String fileName = ConsoleInput.getString();
//        C:\Users\psaee\Desktop\datafile.txt
        
        switch (choice) {
            case 1:
                encryptAndWriteToFile(fileName);
                break;
            case 2:
                readAndDecryptFromFile(fileName);
                break;
            default:
                System.out.println("Invalid choice! Exiting...");
        }
    }

    private static void readAndDecryptFromFile(String filename) {
        String encryptedData = readFile(filename);
        if (encryptedData.isEmpty()) {
            System.out.println("File is empty or not found.");
            return;
        }

        String decryptedData = decrypt(encryptedData);
        System.out.println("Decrypted Data: \n" + decryptedData);
    }
    
    private static void encryptAndWriteToFile(String filename) {
    	System.out.println("Enter the data to encrypt and store in file: ");
    	String data = ConsoleInput.getString();
    	String encryptedData = encrypt(data) + "\n";
    	
    	FileOutputStream fileOutputStream = null;
    	
    	try {
			fileOutputStream = new FileOutputStream(filename, true);
			fileOutputStream.write(encryptedData.getBytes());
			System.out.println("Encrypted data saved successfully!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null)
					fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    }

    private static String readFile(String filename) {
    	FileInputStream fileInputStream = null;
    	try {
			File objFile = new File(filename);
			fileInputStream = new FileInputStream(objFile);
				
			int size = (int)objFile.length();
			byte [] readData = new byte[size];
			fileInputStream.read(readData);
			return new String(readData);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null)
						fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "";
    }
    
    private static String encrypt(String data) {
        StringBuffer encryptedText = new StringBuffer();
        for (char c : data.toCharArray()) {
            encryptedText.append((char) (c + 10));
        }
        return encryptedText.toString();
    }

    private static String decrypt(String data) {
    	StringBuffer decryptedText = new StringBuffer();
        for (char c : data.toCharArray()) {
            decryptedText.append((char) (c - 10));
        }
        return decryptedText.toString();
    }
    
}