package automation.page.trizzenPage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Client {
    private String companyName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String website;
    private String VAT;
    private String GST;
    private String currencySymbol;
}
