package demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by swift on 15/9/15.
 */
@Entity
@Table(name = "EVENT")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE", discriminatorType= DiscriminatorType.STRING)
@Where(clause="enabled=1")
public class Event implements Serializable {

    private static final long serialVersionUID = -1030217638673350831L;

    @JsonIgnore
    @JoinColumn(name = "PARENT_EVENT_ID", nullable = true)
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Event parentEvent;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "parentEvent")
    private Set<Event> childEvents = new HashSet<Event>();

    @JsonProperty
    @Transient
    private String codeValue;

    @JsonProperty
    @Transient
    private String codeType;

    @JsonProperty
    @Transient
    private String productSku;

    @JsonProperty
    @Transient
    private String productName;


    /**
     * Empty constructor
     */
    public Event() {
        super();
    }

    public String getCodeValue() {
        return codeValue;
    }

    public String getCodeType() {
        return codeType;
    }

    public String getProductSku() {
        return productSku;
    }

    public String getProductName() {
        return productName;
    }

    public Set<Event> getChildEvents() {
        return childEvents;
    }

    public void setChildEvents(Set<Event> childEvents) {
        this.childEvents = childEvents;
    }

    public Event getParentEvent() {
        return parentEvent;
    }

    public void setParentEvent(Event parentEvent) {
        this.parentEvent = parentEvent;
    }
}