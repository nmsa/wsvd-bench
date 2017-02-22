package pt.uc.dei.wsvdbench.tpcc.object;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author nmsa@dei.uc.pt
 */
@XmlType(name = "DeliveryResult", namespace = "http://tpcc.wsvdbench.dei.uc.pt/")
public class DeliveryResult implements Serializable {

    private String w_id;
    private String o_carrier_id;
    private int skippedDeliveries;
    private List<DistrictDelivery> districtDeliveryList;

    public DeliveryResult() {
    }

    public DeliveryResult(String w_id, String o_carrier_id, int skippedDeliveries, List<DistrictDelivery> districtDeliveryList) {
        this.w_id = w_id;
        this.o_carrier_id = o_carrier_id;
        this.skippedDeliveries = skippedDeliveries;
        this.districtDeliveryList = districtDeliveryList;
    }

    /**
     * @return the w_id
     */
    @XmlElement(namespace = "http://tpcc.wsvdbench.dei.uc.pt/", type = String.class)
    public String getW_id() {
        return w_id;
    }

    /**
     * @return the o_carrier_id
     */
    @XmlElement(namespace = "http://tpcc.wsvdbench.dei.uc.pt/", type = String.class)
    public String getO_carrier_id() {
        return o_carrier_id;
    }

    /**
     * @return the skippedDeliveries
     */
    @XmlElement(namespace = "http://tpcc.wsvdbench.dei.uc.pt/", type = Integer.class)
    public int getSkippedDeliveries() {
        return skippedDeliveries;
    }

    /**
     * @return the districtDeliveryList
     */
    @XmlElement(namespace = "http://tpcc.wsvdbench.dei.uc.pt/", type = DistrictDelivery.class)
    public List<DistrictDelivery> getDistrictDeliveryList() {
        return districtDeliveryList;
    }

    /**
     * @param w_id the w_id to set
     */
    public void setW_id(String w_id) {
        this.w_id = w_id;
    }

    /**
     * @param o_carrier_id the o_carrier_id to set
     */
    public void setO_carrier_id(String o_carrier_id) {
        this.o_carrier_id = o_carrier_id;
    }

    /**
     * @param skippedDeliveries the skippedDeliveries to set
     */
    public void setSkippedDeliveries(int skippedDeliveries) {
        this.skippedDeliveries = skippedDeliveries;
    }

    /**
     * @param districtDeliveryList the districtDeliveryList to set
     */
    public void setDistrictDeliveryList(List<DistrictDelivery> districtDeliveryList) {
        this.districtDeliveryList = districtDeliveryList;
    }
}
