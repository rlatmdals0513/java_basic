package Day11;

public class Day11AccessModifier {
    public String publicField = "누구나 접근 가능";
    private String PrivateField = "클래스 내부에서만 접근 가능";

    public String getPrivateField(){
        return PrivateField;
    }
    public void setPrivateField(String value){
        PrivateField = value;
    }

}
