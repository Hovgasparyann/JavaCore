package homework.bracechecker;


public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char brace = text.charAt(i);
            int pop;
            switch (brace) {
                case '(':
                case '[':
                case '{':
                    stack.push(brace);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop != '(') {
                        System.out.println("Error: Closed " + brace + " but opened " + (char) pop + " at:" + i);
                    }
                    break;

                case '}':
                    pop = stack.pop();
                    if (pop != '{') {
                        System.out.println("Error: Closed " + brace + " but opened " + (char) pop + " at:" + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop != '[') {
                        System.out.println("Error: Closed " + brace + " but opened " + (char) pop + " at:" + i);
                    }
                    break;


            }
        }
    }
}














