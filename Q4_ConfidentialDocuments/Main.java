interface Confidential {
}

class PublicDocument {
    String name;

    PublicDocument(String name) {
        this.name = name;
    }
}

class FinancialDocument implements Confidential {
    String name;

    FinancialDocument(String name) {
        this.name = name;
    }
}

class PersonalDocument implements Confidential {
    String name;

    PersonalDocument(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Object[] documents = {
            new PublicDocument("College Notice"),
            new FinancialDocument("Bank Statement"),
            new PersonalDocument("Personal File")
        };

        for (Object document : documents) {
            String name;
            if (document instanceof PublicDocument) {
                name = ((PublicDocument) document).name;
            } else if (document instanceof FinancialDocument) {
                name = ((FinancialDocument) document).name;
            } else {
                name = ((PersonalDocument) document).name;
            }

            if (document instanceof Confidential) {
                System.out.println(name + " - Confidential");
            } else {
                System.out.println(name + " - Not Confidential");
            }
        }
    }
}
