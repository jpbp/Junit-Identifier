
public class IdentifierMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length == 0) {
			System.out.println("Uso: IdentifierMain <String>");
		}else {
			Identifier id = new Identifier();
			if(id.validateIdentifier(args[0])) {
				System.out.println("Valido");
			}else {
				System.out.println("Invalido");
			}
			
		}

	}

}
