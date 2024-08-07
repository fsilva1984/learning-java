package enums;

// enum is a list of objects
public enum StatesBrazilian {
  SAO_PAULO("SP", "São Paulo"),
  RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
  PERNAMBUCO("PE", "Pernambuco"),
  CEARA("CE", "Ceará"),
  PIAUI("PI", "Piauí");

  private String acronym;
  private String state;

  // constructor
  private StatesBrazilian(String acronym, String state) {
    this.acronym = acronym;
    this.state = state;
  }

  public String getAcronym() {
    return acronym;
  }

  public String getState() {
    return state;
  }

}
