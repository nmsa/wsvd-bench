package pt.uc.dei.wsvdbench.tpcapp.output;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - APP Benchmark Services
 *
 *
 *
 *
 * @author cnl@dei.uc.pt
 * @author nmsa@dei.uc.pt
 */
@XmlType(name = "ProductDetailPojo", namespace = "http://tpcapp.wsvdbench.dei.uc.pt/")
public class ProductDetailPojo {

    private Long itemId;
    private String itemTitle;
    private String authorFName;
    private String authorLName;
    private Date itemPubDate;
    private String itemPublisher;
    private String itemSubject;
    private String itemDesc;
    private String itemCost;
    private String itemSrp;
    private String itemAvail;
    private String itemIsbn;
    private String itemPage;
    private String itemBacking;
    private String itemDimensions;
    private byte[] imageBytes;

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getAuthorFName() {
        return authorFName;
    }

    public void setAuthorFName(String authorFName) {
        this.authorFName = authorFName;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getAuthorLName() {
        return authorLName;
    }

    public void setAuthorLName(String authorLName) {
        this.authorLName = authorLName;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getItemAvail() {
        return itemAvail;
    }

    public void setItemAvail(String itemAvail) {
        this.itemAvail = itemAvail;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getItemBacking() {
        return itemBacking;
    }

    public void setItemBacking(String itemBacking) {
        this.itemBacking = itemBacking;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getItemCost() {
        return itemCost;
    }

    public void setItemCost(String itemCost) {
        this.itemCost = itemCost;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getItemDimensions() {
        return itemDimensions;
    }

    public void setItemDimensions(String itemDimensions) {
        this.itemDimensions = itemDimensions;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = Long.class)
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getItemIsbn() {
        return itemIsbn;
    }

    public void setItemIsbn(String itemIsbn) {
        this.itemIsbn = itemIsbn;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getItemPage() {
        return itemPage;
    }

    public void setItemPage(String itemPage) {
        this.itemPage = itemPage;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = Date.class)
    public Date getItemPubDate() {
        return itemPubDate;
    }

    public void setItemPubDate(Date itemPubDate) {
        this.itemPubDate = itemPubDate;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getItemPublisher() {
        return itemPublisher;
    }

    public void setItemPublisher(String itemPublisher) {
        this.itemPublisher = itemPublisher;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getItemSrp() {
        return itemSrp;
    }

    public void setItemSrp(String itemSrp) {
        this.itemSrp = itemSrp;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getItemSubject() {
        return itemSubject;
    }

    public void setItemSubject(String itemSubject) {
        this.itemSubject = itemSubject;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = Byte.class)
    public byte[] getImageBytes() {
        return imageBytes;
    }

    public void setImageBytes(byte[] imageBytes) {
        this.imageBytes = imageBytes;
    }
}
