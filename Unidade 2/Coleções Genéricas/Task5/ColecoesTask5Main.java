public class ColecoesTask5Main {
    public static void main(String[] args) {
        System.out.println("Resposta: B");
        System.out.println("Alternativa: int q = 0;\nIterator i = listaDePessoas.iterator();\nTecnicoDeTI t;\nwhile (i.hasNext()) {\nt = (Pessoa) i.next();\nif (t instanceof TecnicoDeTI)\nq++; }");
        System.out.println("Justificativa: O trecho percorre a lista com um Iterator e conta elementos do tipo TecnicoDeTI usando instanceof, que e a ideia correta para distinguir as subclasses.");
    }
}

