package modelo.cromosomas.funcion2;

import modelo.cromosomas.CromosomaBoolean;
import modelo.genes.GenBoolean;

public class CromosomaF2 extends CromosomaBoolean 
{

	public CromosomaF2(int n)
	{
		this.tol = 0.0;
		this.nVar = n;
		this.genes = new GenBoolean[n];
		this.fenotipo = new double[n];
	}
	
	public CromosomaBoolean copia() 
	{
		CromosomaF2 ret = new CromosomaF2(nVar);
		ret.aptitud = this.aptitud;
		ret.puntAcum = this.puntAcum;
		ret.puntuacion = this.puntuacion;
		ret.tol = this.tol;
		ret.lCrom = this.lCrom;
		ret.nVar = this.nVar;
		ret.fenotipo = new double[nVar];
		for(int i=0; i < this.nVar;++i)
			ret.fenotipo[i] = this.fenotipo[i];
		
		ret.genes = new GenBoolean[nVar];
		for(int i=0; i < this.nVar;++i)
			ret.genes[i] = this.genes[i].copia();
		
		return ret;
	}
	
	@Override
	public double evalua() 
	{
		resuelveFenotipo();
		double ret;
		double x = fenotipo[0];
		double y = fenotipo[1];
		ret = (2186 - Math.pow((x*x + y - 11),2) - Math.pow((x + y*y - 7),2)) / 2186;
		return ret;
	}


}