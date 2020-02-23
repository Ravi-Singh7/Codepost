package com.ge.exercise2;

import java.util.Scanner;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ArrayQuadrantUtil {
	 private   char[][] Charector = null;
	private static final Logger logger = LogManager.getLogger(ArrayQuadrantUtil.class);

	    
	    public ArrayQuadrantUtil(char [][] Charector) {
	        this.Charector = Charector;
	    }
	    public char[] getQuadrantValuesfrist(int row, int column) {
	    	int num=0,temp=0;
	    	char [][] data=null;
	    	num=row/2; 
   		    temp=column/2;
   		    int i=0;
   		    data=new char[num][temp];
   		 char [] st = new char[row*row];
   		 for (int l2 = 0; l2<num; l2++) {
				for (int m = 0; m <temp; m++) {
					 data[l2 ][m]=Charector[l2 ][m];
					 st[i]= data[l2 ][m];
					 i++;
				}
			}
	    	return st;
	    }
	    
	    public char[] getQuadrantValuessecond(int row, int column) {
	    	int num=0,temp=0;
	    	char [][] data=null;
	    	num=row/2; 
   		    temp=column/2;
   		    int i=0,j=0;
   		    data=new char[num][temp];
   		 char [] st = new char[row*row];
   		for (int l2 =0; l2<num; l2++) {
			j=0;
			for (int m =temp; m <column; m++) {
				 data[l2 ][j]=Charector[l2 ][m];
				 st[i]= data[l2 ][j];
				 j++;
				 i++;
			}
		}
	    	return st;
	    }
	    
	    public char[] getQuadrantValuesthird(int row, int column) {
	    	int num=0,temp=0;
	    	char [][] data=null;
	    	num=row/2; 
   		    temp=column/2;
   		    int i=0;
   		    int j=0; 
   		    int k=0;
   		    data=new char[num][temp];
   		 char [] st = new char[row*row];
   		for (int l2 =num; l2<row; l2++) {
			j=k;
			for (int m = 0; m <temp; m++) {
				 data[j ][m]=Charector[l2 ][m];
				 st[i]= data[j ][m];
				 i++;
				 k=1;
			}
		}
	    	return st;
	    
	    }
	    public char[] getQuadrantValuesforth(int row, int column) {
	    	int num=0,temp=0;
    		int i=0,j=0,k=0,l=0;
    		char [] st = new char[row*row];
	    		 num=row/2; 
	    		 temp=column/2;
	    		 char [][]  data=new char[num][temp];		
	    			for (int l2 = num; l2<row; l2++) {
	    				j=k;
	    				l=0;
	    				k++;
						for (int m =temp; m <column; m++) {
							 data[j][l]=Charector[l2 ][m];
							 st[i]= data[j][l];
							 i++;
							 k=1;
							 l++;
						}
					}

	    	
	        return st;
	    }
	    public  Object[] printRowData(int row, int column,int number) {
	    	Object [][] data=new Object[row][column];
	    	for(int i = 0; i < row; i++)
	    	{
	      	    for(int j = 0; j < column; j++)
	            {
	      	      data[i][j]=Charector[i][j];
	            }}
	        return data[number];
	    }
	    
	    public Object[] printRow(int number) {
	    	Object [] data=null;
	    	data=printRowData(Charector.length,Charector.length,number);
	    	return data;
	    }
	    public char[] printColumnData(int row, int column,int number) {
	    	char[][] data=new char[row][column];
	    	for(int i = 0; i < column; i++)
	    	{
	      	    for(int j = 0; j <row ; j++)
	            {
	      	    	data[i][j]=Charector[j][i];	  	    	
	            }
	      	    }
	        return  data[number];    
	    }
	    public char[] printColumn(int number) {
	    	char [] data=null;
	    	data=printColumnData(Charector.length,Charector.length,number);
	    	return data;
	    }
	    public char[] getQuadrantValues(int row, int column) {
	    	char[] data=null;
	    	if(row==0 && column==0) {
	    		data=getQuadrantValuesfrist(Charector.length,Charector.length);
	    		return data;
	    	}
	    	else if(row==0 && column==1) {
	    		data=getQuadrantValuessecond(Charector.length,Charector.length);
	    		return data;
	    	}
	    	else if(row==1 && column==0) {
	    		data=getQuadrantValuesthird(Charector.length,Charector.length);
	    		return data;
	    	}
	    	else if(row==1 && column==1) {
	    		data=getQuadrantValuesforth(Charector.length,Charector.length);
	    		return data;
	    	}
	    	return null;
	    }
		        	
	    public static void main(String[] args) {	    	
	    	char [][] data= { {'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'},{'m','n','o','p'}}; 
	    	
			ArrayQuadrantUtil arrayQuadrantUtil=new ArrayQuadrantUtil(data);
			/**
	    	 * Called printRow method to print Row Data
	    	 */
			Object [] rowData=arrayQuadrantUtil.printRow(3);
			for (int i = 0; i < rowData.length; i++) {
				System.out.print(rowData[i]);
			}
			/**
			 * Called printColumn method to print Column data
			 */
			System.out.println(" ");
			char [] columnData=arrayQuadrantUtil.printColumn(3);
			for (int i = 0; i < columnData.length; i++) {
				System.out.print(columnData[i]);
			}
			/**
			 * Called getQuadrant method to print Quadrant data
			 */
			System.out.println(" ");
			char [] p=arrayQuadrantUtil.getQuadrantValues(1,0);
				for (int j = 0; j < p.length; j++) {
					System.out.print(p[j]);
				}
		
		}
}
