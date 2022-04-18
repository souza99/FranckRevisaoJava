public class ProductDTO {
    private Long id;
    private long barcode;
    private String name;
    private double value;
    private Date lifetime;

    public long getBarcode() {
        return barcode;
    }
    public Long getId() {
        return id;
    }
    public Date getLifetime() {
        return lifetime;
    }
    public String getName() {
        return name;
    }
    public double getValue() {
        return value;
    }
    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setLifetime(Date lifetime) {
        this.lifetime = lifetime;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setValue(double value) {
        this.value = value;
    }
}
