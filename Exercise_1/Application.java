/* 
Nama 	: Kevin Prakarsa B R
NIM  	: 1301144169
Kelas	: IF-38-09 
*/

import java.util.Scanner;
	 
public class Application {
 private String AppName;
 private int AppSize;
	
 public Application(String AppName, int AppSize) {
  this.AppName = AppName;
  this.AppSize = AppSize;
 }
	
 public String getAppName() {
  return AppName;
 }
 	
 public int getAppSize() {
  return AppSize;
 }
 	
 public String toString() {
  return ("Application name : "+AppName+", with size : "+AppSize);
 }
}
