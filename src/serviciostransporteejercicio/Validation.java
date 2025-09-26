
package serviciostransporteejercicio;

public final class Validation {
    
    private Validation(){}
    
    public static void validateName(String name, String variableName){
        if(name.isBlank()|| name.isEmpty()||!name.matches("[a-z A-Z]+")){
            throw new IllegalArgumentException(variableName + " is not valid");
        }
    }
    
    public static void validateAge(int age){
        if(age<0){
            throw new IllegalArgumentException("The age must be positive");
        }
    }
    
    public static void validateStringNumbers(String str, String nameStr){
        if(!str.matches("[a-z A-Z 0-9-/]+")){
            throw new IllegalArgumentException(nameStr + " is not valid");
        }
    }
    
    public static void validateString(String str, String nameStr){
        if(str.isBlank()|| str.isEmpty()||!str.matches("[a-z A-Z]+")){
            throw new IllegalArgumentException(nameStr + " is not valid");
        }
    }
    
    public static void validatePositiveNumber(double number, String numberName){
        if(number<0){
            throw new IllegalArgumentException(numberName + " must be positive");
        }
    }
}
