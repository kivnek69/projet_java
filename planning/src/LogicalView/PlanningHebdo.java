package LogicalView;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

public class PlanningHebdo {
    public static ArrayList<Enseignement>    eDT     = new ArrayList<Enseignement>();
    public ArrayList<Enseignant> listE        = Referentiel.getListAllEnseignant();
    public static ArrayList<Groupe>     listG        = Referentiel.getGroupeList();
    public DateFormatSymbols     weekDays     = new DateFormatSymbols(Locale.FRENCH);
    public String[]              joursSemaine = weekDays.getWeekdays();  
    boolean bon = false;
    int iPlanning = 0;

public void PlanningHebdo() {}

public void initPlanning(){                                                    //initialiser le planning
        for (int i = 1; i < this.joursSemaine.length; i++) {
	    if( !this.joursSemaine[i].equals("samedi") && !this.joursSemaine[i].equals("dimanche")  ){
		for (int j = 1; j <= 4 ; j++){
                    int heure = 9+(j-1)*3;
                    eDT.add(new Enseignement(this.joursSemaine[i],heure+"H00" ,true));
		}
            }
        }      
}

public void setPlanningHebdo() {
    this.initPlanning();
     int mG = 0; int j=0;
for(int i = 0; i<this.listE.size() && this.listE.get(i).getNbrCoursSemaine()> 0 ; i++){
            ArrayList<Cours> listCoursEnseignant = this.listE.get(i).getListCours();   ArrayList<Groupe> listGroupeEnseignant = this.listE.get(i).getListGroupe();
                for( j=0 ; j <listCoursEnseignant.size(); j++){              Cours varCours = listCoursEnseignant.get(j);
                    for( mG=0 ; mG<listGroupeEnseignant.size(); mG++){	Groupe varGroupe = listGroupeEnseignant.get(mG);
                           int lo_,hig_,low = 0,high = 4,lower = 0,random = 0, higher = 3;
                             do{
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                         /*   do{
                               random  = (int)(Math.random() * (higher-lower)) + lower;
                               lo_ = random;
                               random  = (int)(Math.random() * (high-low)) + low;
                               hig_ = random;
                               System.out.println("\nwhile ["+lo_+"]["+hig_+"]\n");
                             }while(this.listE.get(i).disponibilite[lo_][hig_]== true);
                             //this.listE.get(i).disponibilite[lower][higher] = true;
                              iPlanning = (lo_)*5 + (hig_+1);
                              */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                if(iPlanning==20){iPlanning =0; break;}
                                if (this.listE.get(i).isLibre(iPlanning)==false && this.listE.get(i).getListGroupe().get(mG).isLibre(eDT.get(iPlanning))==true && iPlanning<20){
                                        if(iPlanning<5){ lo_=0;hig_=iPlanning; }
                                            else if(iPlanning<10){ lo_=1;hig_=iPlanning-5; }
                                                else if(iPlanning<15) { lo_=2;hig_=iPlanning-10; }
                                                    else {lo_=3;hig_=iPlanning-15;}
                                                bon = true;
                                                eDT.get(iPlanning).setCoursPlanifie(""+varCours.getIntitule());
                                                eDT.get(iPlanning).cours.code = varCours.code;
                                                eDT.get(iPlanning).setEnseignantPlanifie(this.listE.get(i).getId());
                                                eDT.get(iPlanning).enseignant.code = this.listE.get(i).code ;
                                                
                                                eDT.get(iPlanning).setGroupePlanifie(varGroupe.getNomGroupe());
                                                eDT.get(iPlanning).libre = false;

                                                PlanningHebdo.listG.get(mG).setAgenda(eDT.get(iPlanning));

                                                this.listE.get(i).setAgenda(eDT.get(iPlanning));
                                                this.listE.get(i).getListGroupe().get(mG).setAgenda(eDT.get(iPlanning));
                                                this.listE.get(i).setNbrCoursSemaine( this.listE.get(i).getNbrCoursSemaine() - 1);
                                                this.listE.get(i).disponibilite[lo_][hig_] = true;
                                }
                                else{ System.out.println("\nConflit ["+lower+"]["+higher+"] "+ iPlanning +"\n"); }
                             iPlanning++;
                          }while(bon!=true);
                          bon = false; //iPlanning =0;
                    }
		}
           //if(i==this.listE.size()-1 )i=0;
	}
//    for(int m = 0; m<eDT.size(); m++){System.out.println("\n"+eDT.get(m).jour+"\n"+eDT.get(m).heureDebut+"\t"+eDT.get(m).cours.getIntitule()+"\t"+eDT.get(m).enseignant.getId()+"\t"+eDT.get(m).groupe.getNomGroupe() +"\n");}
}


public void afficherPlanning(){
Learn.jTextArea41.setText("");
    if(eDT.size()>0 && eDT.size()<24){
        Learn.jTextArea41.append("       Lun  Mar  Mer  Jeu  Ven");
        for(int i=0; i< eDT.size(); i++){
            Enseignement varCreneau = eDT.get(i);
	    if( i==0 )Learn.jTextArea41.append("\n09h00 ");
                else if(i==5)Learn.jTextArea41.append("\n12h00 ");
                    else if(i==10)Learn.jTextArea41.append("\n15h00 ");
                         else if(i==15)Learn.jTextArea41.append("\n18h00 ");

           if(varCreneau.getCoursPlanifie()==null) Learn.jTextArea41.append(" "+ varCreneau.getCoursPlanifie());
                else Learn.jTextArea41.append("  " + varCreneau.getCoursPlanifie()+"  ");           //+ "\t"+varCreneau.getEnseignantPlanifie()+ "\t");

        }
    }
 else Learn.jTextArea41.setText("Generation eDT échoué !");
    }
}