package com.upchiapas.practica02;

import com.upchiapas.practica02.PrincipalProductos;
import java.util.Scanner;

public class PrincipalProductos{

    static Producto objetoProducto;

    static Producto[] arregloA;

    public static void main(String[] args){
        int op, tamano = 0;


        Scanner opc = new Scanner(System.in);

        do{
            System.out.println("Tienda Don Panchito");
            System.out.println("1. Ingresar producto \n2. Visualizar producto \n3. Buscar producto \n4. Salir");
            op = opc.nextInt();
            switch(op){
                case 1:
                    tamano = registrarProductos();
                    break;
                case 2:

                    if(tamano>0){
                        visualizarProductos(tamano);
                    }
                    else{
                        System.out.println("No hay nigun producto existente, favor de registrar los productos.. \n");
                    }
                    break;
                case 3:
                    if(tamano>0){
                        buscarProductos(tamano);
                    }
                    else{
                        System.out.println("No hay nigun producto existente, favor de registrar los productos..\n");
                    }
                    break;
                case 4:
                    System.out.println("Nos vemos OniChann.. UWU..");
                    break;
                default:
                    System.out.println("Opcion no valida..");
            }

        }while(op != 4);

    }

    public static int registrarProductos(){
        int cantidad, prec, exis;
        String producto;

        System.out.println("Cuantos productos desea ingresar: ");
        Scanner entrada = new Scanner(System.in);
        cantidad = entrada.nextInt();
        arregloA = new Producto[cantidad];
        for(int i=1;i<=cantidad;i++){
            System.out.println("Producto: ");
            producto =entrada.next();
            System.out.println("Precio: ");
            prec = entrada.nextInt();
            System.out.println("Existencia: ");

            exis = entrada.nextInt();
            objetoProducto = new Producto(producto, prec, exis);
            arregloA[i-1] = objetoProducto;
        }
        return cantidad;
    }

    public static void visualizarProductos(int cantidad){
        System.out.println("Producto:      Precio:    Cantidad:");
        for(int i = 0; i<cantidad;i++){
            System.out.print(arregloA[i].getNombre()+ "   ");
            System.out.print(arregloA[i].getPrecio()+ "   ");
            System.out.print(arregloA[i].getExistencia()+ "   ");
            System.out.println();

        }
    }

    public static void buscarProductos(int cantidad){
        for(int i=0; i<cantidad;i++){
            if(arregloA[i].getExistencia()<5){
                System.out.println("Productos menores a 5: ");
                System.out.println(arregloA[i].getNombre());
            }
        }
    }
}
