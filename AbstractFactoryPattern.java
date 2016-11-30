package coreJava;

interface IHollywoodMovie {
	String MovieName();
}

interface IBollywoodMovie {
	String MovieName();
}

interface IMovieFactory {
	IHollywoodMovie GetHollywoodMovie();

	IBollywoodMovie GetBollywoodMovie();
}

class HollywoodActionMovie implements IHollywoodMovie {

	@Override
	public String MovieName() {
		return "Hollywood action movie";
	}

}

class HollywoodComedyMovie implements IHollywoodMovie {

	@Override
	public String MovieName() {
		return "Hollywood comedy movie";
	}
}

class BollywoodActionMovie implements IBollywoodMovie {

	@Override
	public String MovieName() {
		return "Bollywood action movie";
	}

}

class BollywoodComedyMovie implements IBollywoodMovie {

	@Override
	public String MovieName() {
		return "Bollywood comedy movie";
	}
}

// Action movie factory
class ActionMovieFactory implements IMovieFactory {

	@Override
	public IHollywoodMovie GetHollywoodMovie() {
		return new HollywoodActionMovie();
	}

	@Override
	public IBollywoodMovie GetBollywoodMovie() {
		// TODO Auto-generated method stub
		return new BollywoodActionMovie();
	}

}

// Comedy Movie Factory
class ComedyMovieFactory implements IMovieFactory {
	public IHollywoodMovie GetHollywoodMovie() {
		return new HollywoodComedyMovie();
	}

	public IBollywoodMovie GetBollywoodMovie() {
		return new BollywoodComedyMovie();
	}
}

public class AbstractFactoryPattern {

	public static void main(String[] args) {

		System.out.println("***Abstract Factory Pattern Demo***");

		ActionMovieFactory actionMovies = new ActionMovieFactory();

		IHollywoodMovie hAction = actionMovies.GetHollywoodMovie();
		IBollywoodMovie bAction = actionMovies.GetBollywoodMovie();
		System.out.println("\nAction movies are:");
		System.out.println(hAction.MovieName());
		System.out.println(bAction.MovieName());
		ComedyMovieFactory comedyMovies = new ComedyMovieFactory();
		IHollywoodMovie hComedy = comedyMovies.GetHollywoodMovie();
		IBollywoodMovie bComedy = comedyMovies.GetBollywoodMovie();
		System.out.println("\nComedy movies are:");
		System.out.println(hComedy.MovieName());
		System.out.println(bComedy.MovieName());

	}

}

//				Output
//======================================
//***Abstract Factory Pattern Demo***
//
//Action movies are:
//Hollywood action movie
//Bollywood action movie
//
//Comedy movies are:
//Hollywood comedy movie
//Bollywood comedy movie
