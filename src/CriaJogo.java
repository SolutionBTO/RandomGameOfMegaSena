import java.util.Random;
import java.util.TreeSet;

public class CriaJogo {
	
	public static void main(String[] args) {
		int quantidadeJogos = 1;
		
		if(args != null && args.length > 0)
			quantidadeJogos = Integer.valueOf(args[0]);
		
		System.out.println("Criando "+quantidadeJogos+" jogos\n\n");
		
		for (int i = 0; i < quantidadeJogos; i++) {
				
			TreeSet<Integer> sequence = new TreeSet<Integer>();
			
			do{
				int number = getRandomNumber();
				
				if(!sequence.contains(number) || !(number == 0))
					sequence.add(number);
				
			}while(sequence.size() !=6 );
			
			System.out.println(sequence.toString()
					.replaceAll(",", "")
					.replaceAll("\\[", "")
					.replaceAll("\\]", ""));
		
		}
	}
	
	public static int getRandomNumber() {
		return new Random().nextInt(60);
	}
}
