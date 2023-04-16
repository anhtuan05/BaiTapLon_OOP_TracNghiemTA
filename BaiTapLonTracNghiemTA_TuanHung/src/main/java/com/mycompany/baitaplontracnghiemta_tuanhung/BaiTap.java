
import java.util.ArrayList;
import java.util.List;

public class BaiTap {
    private static int dem=0;
    private String tenBaiTap;
    {
        this.tenBaiTap = String.format("BT%03d", ++dem);
    }
    private List<MutipleChoice> dSMutipleChoice;
    private List<Incomplete> dsIncomplete;
    private List<Conversation> dsConversation;
    
    public BaiTap() {
    }
    
    {
        this.dSMutipleChoice = new ArrayList<>();
        this.dsIncomplete = new ArrayList<>();
        this.dsConversation = new ArrayList<>();
    }
    
    public String hienThiBT(){
        return String.format("BaiTap: %s    ", this.tenBaiTap);
    }

    /**
     * @return the dSMutipleChoice
     */
    public List<MutipleChoice> getdSMutipleChoice() {
        return dSMutipleChoice;
    }

    /**
     * @param dSMutipleChoice the dSMutipleChoice to set
     */
    public void setdSMutipleChoice(List<MutipleChoice> dSMutipleChoice) {
        this.dSMutipleChoice = dSMutipleChoice;
    }

    /**
     * @return the dsIncomplete
     */
    public List<Incomplete> getDsIncomplete() {
        return dsIncomplete;
    }

    /**
     * @param dsIncomplete the dsIncomplete to set
     */
    public void setDsIncomplete(List<Incomplete> dsIncomplete) {
        this.dsIncomplete = dsIncomplete;
    }

    /**
     * @return the dsConversation
     */
    public List<Conversation> getDsConversation() {
        return dsConversation;
    }

    /**
     * @param dsConversation the dsConversation to set
     */
    public void setDsConversation(List<Conversation> dsConversation) {
        this.dsConversation = dsConversation;
    }  

    /**
     * @return the tenBaiTap
     */
    public String getTenBaiTap() {
        return tenBaiTap;
    }

    /**
     * @param tenBaiTap the tenBaiTap to set
     */
    public void setTenBaiTap(String tenBaiTap) {
        this.tenBaiTap = tenBaiTap;
    }
}
