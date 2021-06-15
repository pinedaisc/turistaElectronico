package com.pinedaisc.turista.negocio;

import java.util.Random;

import com.pinedaisc.turista.objetos.Terminal;

public class Tablero {

public static enum casillas {C0,C1,C2,C3,C4,C5,C6,C7,C8,C9,
				C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,
				C20,C21,C22,C23,C24,C25,C26,C27,C28,C29,
				C30,C31,C32,C33,C34,C35,C36,C37,C38,C39,
				C40,C41,C42,C43,C44,C45,C46,C47,C48,C49,C50}	

public static int[] dropdice(){
    int dices[] = {0,0,0};
	int max = 6;
    int min = 1;
    int range = max - min + 1;
    dices[0] = (int)(Math.random() * range) + min;
    dices[1] = (int)(Math.random() * range) + min;
    dices[2] = dices[0] + dices[1];
	return dices;
}

//TODO borra esto por favor
public static void main(String[] args) {
	int dados[] = dropdice();
	System.out.printf("%d, %d = %d",dados[0],dados[1],dados[2]);
	Terminal t1 = new Terminal();
	System.out.println(t1.getId());
	System.out.println(t1.toString());
	System.out.println(casillas.C15);
}
	
}
