
import java.io.File;
import java.util.Scanner; import java.lang.reflect.Array;
class MainThread {
public static void main(String args[]){
FirstThread th1 = new FirstThread("word","File1.txt"); FirstThread th2 = new FirstThread("word","File2.txt"); CountingThread th3 = new CountingThread("File1.txt"); th1.start();
th2.start();
th3.start(); }
}
class FirstThread extends Thread{
File myObj;
String word;
Boolean isFound;
FirstThread(String word, String fileName){
this.word = word;
myObj = new File(fileName); isFound = false;
}
public void run(){ try{
Scanner myReader = new Scanner(myObj); while (myReader.hasNextLine()) {
String data = myReader.nextLine();
String spaceSplit[] = data.split(" ");
for(int i=0; i<spaceSplit.length ; i++ ){ if(spaceSplit[i].contains(word))
isFound = true; // break;
} if(isFound)
break; }
System.out.println(isFound); }catch(Exception e){
System.out.println(e.getMessage()); }
 } }
class CountingThread extends Thread{ File myObj;
int count;
String data = "";
CountingThread( String fileName){
myObj = new File(fileName);
count = 0; }
private String[] getUniqueKeys(String[] keys) {
String[] uniqueKeys = new String[keys.length]; uniqueKeys[0] = keys[0];
int uniqueKeyIndex = 1;
boolean keyAlreadyExists = false;
for(int i=1; i<keys.length ; i++) {
for(int j=0; j<=uniqueKeyIndex; j++) {
if(keys[i].equals(uniqueKeys[j])) {
keyAlreadyExists = true; }
} if(!keyAlreadyExists) {
uniqueKeys[uniqueKeyIndex] = keys[i];
uniqueKeyIndex++; }
keyAlreadyExists = false; }
return uniqueKeys; }
public void run(){
try{
Scanner myReader = new Scanner(myObj); while (myReader.hasNextLine()) {
data = data + myReader.nextLine() ; }

String[] keys = data.split(" "); String[] uniqueKeys;
uniqueKeys = getUniqueKeys(keys);
int i =0;
for(String key: uniqueKeys) {
i++;
if(key == null) {
break; }
for(String s : keys) {
if( s != null){ if(key.equals(s) ) {
count++; }
} }
System.out.println("["+key+"] : "+count); count=0; }
}catch(Exception e){ System.out.println(e.getMessage());
}
} }
