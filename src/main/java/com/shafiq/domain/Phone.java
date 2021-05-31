package com.shafiq.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="phones")
public class Phone implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "model_num")
    private String modelNum;

    @Column(name="display_size")
    private float displaySize;

    @Column(name="processor_name")
    private String processorName;

    @Column(name="ram_size")
    private int ramSize;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public float getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(float displaySize) {
        this.displaySize = displaySize;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", modelNum='" + modelNum + '\'' +
                ", displaySize=" + displaySize +
                ", processorName='" + processorName + '\'' +
                ", ramSize=" + ramSize +
                '}';
    }
}
