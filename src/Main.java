public class Main {
    public static void main(String[] args) {
        String name = "Anshuman";
        String nameTemp = name;
        name += "Kumar"; // It will change name to AnshumanKumar, but the nameTemp will remain unchanged
        System.out.println("name : " + name); // AnshumanKumar
        System.out.println("nameTemp : " + nameTemp); // Anshuman




        StringBuilder newName = new StringBuilder("Anshuman");
        StringBuilder newNameTemp = newName;
        newName.append("Kumar"); // it will change newName to AnshumanKumar as well as newNameTemp also changed
        System.out.println("newName : "+ newName); // AnshumanKumar
        System.out.println("newNameTemp : " + newNameTemp); // AnshumanKumar
    }
}