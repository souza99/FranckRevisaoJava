public class user {
    private Long id;
    private string password;
    private String userName;
    private String cpfCnpj;
    private String name;
    private String adress;
    private int number;
    private string cep;
    private String bairro;

    public String getAdress() {
        return adress;
    }
    public String getBairro() {
        return bairro;
    }
    public string getCep() {
        return cep;
    }
    public String getCpfCnpj() {
        return cpfCnpj;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public string getPassword() {
        return password;
    }
    public String getUserName() {
        return userName;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCep(string cep) {
        this.cep = cep;
    }
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setPassword(string password) {
        this.password = password;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
