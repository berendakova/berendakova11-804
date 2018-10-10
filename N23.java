import java.util.Scanner;
public class N23{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //число рядов
		int lights = 1;
		int spaces = n-1;
		String lightStr = "";//строка звездочек
		String spacesStr = "";//строка пробелов

		for ( int i = 1; i <= n; i++) {//кол-во строк
			spacesStr = "";
			lightStr = "";
			for (int j = 0; j < spaces; j++ ) {//кол-во пробелов
				spacesStr = spacesStr + " ";
			}
			for ( int z = 0; z < lights ; z++ ) {//кол-во звездочек
				lightStr += "*";
			}
		spaces--;
		lights+= 2;
		System.out.print(spacesStr+lightStr+spacesStr);
		System.out.println("");


		} 
			}  

		}	