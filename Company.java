
public class Company {

    public float interestRate(){

        return 0;
    }
}
class Deposit {
    //fields or data
    int bnkId;
    String bnkName;
    String bnkDistrict;
    int bnkPayment;

    //Constructor
    Deposit(int bnkId, String bnkName, String bnkDistrict, int bnkPayment) {
        this.bnkId = bnkId;
        this.bnkName = bnkName;
        this.bnkDistrict = bnkDistrict;
        this.bnkPayment = bnkPayment;
    }

    public int getBnkId() {
        return bnkId;
    }

    public String getBnkName() {
        return bnkName;
    }

    public String getBnkDistrict() {
        return bnkDistrict;
    }

    public int getBnkPayment() {
        return bnkPayment;
    }

    public String toString() {
        return bnkId + "\t" + bnkName + "\t" + bnkDistrict + "\t" + bnkPayment;
    }
}