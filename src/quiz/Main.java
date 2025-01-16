package quiz;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

       
        quiz.addQuestion(new Question(
        	    "Which of the following is not a principle of OOP?",
        	    new String[] {"Encapsulation", "Polymorphism", "Inheritance", "Compilation"},
        	    4
        	));

        	quiz.addQuestion(new Question(
        	    "Which feature of OOP allows creating a new class from an existing class?",
        	    new String[] {"Encapsulation", "Inheritance", "Polymorphism", "Abstraction"},
        	    2
        	));

        	quiz.addQuestion(new Question(
        	    "Which OOP principle is achieved by using private and public keywords?",
        	    new String[] {"Polymorphism", "Encapsulation", "Abstraction", "Inheritance"},
        	    2
        	));

        	quiz.addQuestion(new Question(
        	    "What does 'this' keyword represent in Java?",
        	    new String[] {
        	        "The current class instance",
        	        "The parent class instance",
        	        "A static method",
        	        "A local variable"
        	    },
        	    1
        	));

        	quiz.addQuestion(new Question(
        	    "Which of the following is a type of polymorphism in Java?",
        	    new String[] {
        	        "Compile-time polymorphism",
        	        "Runtime polymorphism",
        	        "Both Compile-time and Runtime",
        	        "None of the above"
        	    },
        	    3
        	));

        	quiz.addQuestion(new Question(
        	    "What is the process of defining a method in a subclass that already exists in the parent class?",
        	    new String[] {"Method Overriding", "Method Overloading", "Encapsulation", "Polymorphism"},
        	    1
        	));

        	quiz.addQuestion(new Question(
        	    "Which of the following is used to achieve abstraction in Java?",
        	    new String[] {"Abstract classes", "Interfaces", "Both Abstract classes and Interfaces", "None of the above"},
        	    3
        	));

        	quiz.addQuestion(new Question(
        	    "Which of the following is true about inheritance in Java?",
        	    new String[] {
        	        "Java supports multiple inheritance through classes.",
        	        "Java does not support inheritance.",
        	        "Java supports multiple inheritance through interfaces.",
        	        "Java supports multiple inheritance through both classes and interfaces."
        	    },
        	    3
        	));

        	quiz.addQuestion(new Question(
        	    "What is the purpose of a constructor in Java?",
        	    new String[] {
        	        "To initialize an object",
        	        "To call other methods",
        	        "To create a new class",
        	        "To override methods"
        	    },
        	    1
        	));

        	quiz.addQuestion(new Question(
        	    "Which of the following is true for an abstract class?",
        	    new String[] {
        	        "It cannot have abstract methods.",
        	        "It can be instantiated.",
        	        "It can have both abstract and concrete methods.",
        	        "It cannot have constructors."
        	    },
        	    3
        	));

        	quiz.addQuestion(new Question(
        	    "What does 'super' keyword in Java do?",
        	    new String[] {
        	        "Calls the constructor of the parent class",
        	        "Accesses the current object",
        	        "Accesses static members of the class",
        	        "Returns the value of a method"
        	    },
        	    1
        	));

        	quiz.addQuestion(new Question(
        	    "What is method overloading?",
        	    new String[] {
        	        "Defining multiple methods with the same name but different parameters",
        	        "Defining a method in a subclass that already exists in the parent class",
        	        "A feature that prevents the method from being overridden",
        	        "None of the above"
        	    },
        	    1
        	));

        	quiz.addQuestion(new Question(
        	    "Which keyword is used to prevent a method from being overridden?",
        	    new String[] {"final", "static", "const", "abstract"},
        	    1
        	));

        	quiz.addQuestion(new Question(
        	    "Which of the following statements about interfaces is correct?",
        	    new String[] {
        	        "Interfaces can have constructors.",
        	        "Interfaces support multiple inheritance.",
        	        "Interfaces can only have static methods.",
        	        "Interfaces cannot be extended."
        	    },
        	    2
        	));

        	quiz.addQuestion(new Question(
        	    "Which of the following is NOT a visibility modifier in Java?",
        	    new String[] {"public", "protected", "private", "global"},
        	    4
        	));

        	quiz.addQuestion(new Question(
        	    "What is encapsulation in Java?",
        	    new String[] {
        	        "Hiding the implementation details and showing only functionality",
        	        "Bundling data and methods operating on that data together",
        	        "Allowing multiple methods with the same name",
        	        "Providing a default behavior"
        	    },
        	    2
        	));

        	quiz.addQuestion(new Question(
        	    "How many types of constructors are available in Java?",
        	    new String[] {"1", "2", "3", "4"},
        	    2
        	));

        	quiz.addQuestion(new Question(
        	    "Which OOP principle allows using the same function name for different types of data?",
        	    new String[] {"Inheritance", "Encapsulation", "Polymorphism", "Abstraction"},
        	    3
        	));

        	quiz.addQuestion(new Question(
        	    "Which of the following is NOT true for static methods?",
        	    new String[] {
        	        "They can be called without creating an object.",
        	        "They can access instance variables directly.",
        	        "They belong to the class, not the object.",
        	        "They can call other static methods."
        	    },
        	    2
        	));

        	quiz.addQuestion(new Question(
        	    "What is the default access modifier in Java?",
        	    new String[] {"public", "protected", "private", "package-private"},
        	    4
        	));


       
        quiz.startQuiz();
    }
}

