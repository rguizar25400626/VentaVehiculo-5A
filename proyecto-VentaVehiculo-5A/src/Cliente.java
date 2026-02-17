
/**
 *
 * @author Nappe
 */
public class Cliente {

    private String rs;
    private String rfc;
    private String email;

    public Cliente(String rs, String rfc, String email) {

        this.rs = rs;
        this.rfc = rfc;
        this.email = email;

    }

    @Override
    public String toString() {
        return "Razón Social: " + this.rs
                + "\nRFC: " + this.rfc
                + "\nE-mail: " + this.email;
    }

    public String razonSocial() {

        return this.rs;
    }

    public String rfc() {

        return this.rfc;
    }

    public String email() {

        return this.email;
    }

    public void setRazonSocial(String nrs) {
        this.rs = nrs;

    }

    public void setRfc(String nrfc) {
        this.rfc = nrfc;

    }

    public void setEmail(String nemail) {
        this.email = nemail;

    }
}
