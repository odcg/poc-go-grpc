package com.capgemini.event.nantes.devfest2019.gojava;

import org.springframework.stereotype.Service;

@Service
public class JavaPrimeService {

    public static void main(String[] args) {
        JavaPrimeService javaPrimeService = new JavaPrimeService();
        System.out.println(javaPrimeService.prime(100));
    }


    public String prime(Integer borne_sup) {

        int i,j,nbr_int_premier=0;
        boolean []tableau_premiers = new boolean [borne_sup-1];

        for (i=0;i<=tableau_premiers.length-1;i++)
        {
            tableau_premiers[i]=true;
        }
        // le chiffre 2 est premier "par defaut", d'ailleurs, tous au debut.
        for (i=2;i<=borne_sup;i++)
        {
            if (tableau_premiers[i-2]==true){ // bypass les nbres non 1ers
                j=i+1;
                while (j<=borne_sup)
                {
                    if ((j%i)==0) tableau_premiers[j-2]=false;
                    j++;
                }
                nbr_int_premier++;
                if (nbr_int_premier%13!=0) System.out.print(i+" ");
                else System.out.println(i+" ");
            }
        }
		/*for (i=0;i<=tableau_premiers.length-1;i++)
		{
		    if (tableau_premiers[i]==true)
		    {
		 	    nbr_int_premier++;
		   	    if (nbr_int_premier%13!=0) System.out.print(i+2+" ");
		   	    	else System.out.println(i+2+" ");
		    }
		}*/
        System.out.println("");
        System.out.println("Nomre de nbr premiers : "+nbr_int_premier+" entre "+2+" et "+borne_sup);
        return "Nomre de nbr premiers : "+nbr_int_premier+" entre "+2+" et "+borne_sup;

    }
}
