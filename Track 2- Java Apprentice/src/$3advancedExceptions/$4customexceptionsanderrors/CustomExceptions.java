package $3advancedExceptions.$4customexceptionsanderrors;

public class CustomExceptions {
    public static void main(String[] args) {

        userRequest("avatars", "login");
//        userRequest("vatars", "login");
//        userRequest("admin", "delete");
//        userRequest("avatars", "delete");

    }

    public static void userRequest(String userId, String operation) {

        if (userId.startsWith("a")) {
            System.out.println("The username checks out...");
        } else {
            throw new InvalidUsernameException("The username is not in the correct format.");
        }

        if(operation.equals("edit") || operation.equals("delete")) {
            if(!userId.startsWith("admin")) {
                throw new IllegalAccessError("The user does not have the required persmission");
            }
        }

        System.out.println();
        System.out.format("The user %s has requested the %s operation.", userId, operation);
    }
}
