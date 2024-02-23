package collections;

import java.util.*;
import java.io.*;

public class Str_To_List {

	public static void main(String[] args) throws IOException {
		String[] name = { "ana", "rock", "mick" };
		List<String> list = Arrays.asList(name);
		// way 1: print list
		System.out.println(list);

		// way 2: print list
		for (String li : list) {
			String str = li;
			System.out.print(str + " ");
		}
	}

}
