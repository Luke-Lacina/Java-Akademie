package local.luke;

public enum TypeOfVacation {
    WORKING("pracovní"), HOLIDAY("rekreační");
    private final String textVacation;

    TypeOfVacation(String textVacation) {
    this.textVacation = textVacation;
    }

    public String getTextVacation() {
    return textVacation;
    }
}
