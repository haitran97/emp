package com.demo.emp.domain.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Job {
    private int id;
    private String title;
    private BigDecimal salaryIndex;

    @Id
    @Column(name = "id", table = "job")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", table = "job")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "salary_index", table = "job")
    public BigDecimal getSalaryIndex() {
        return salaryIndex;
    }

    public void setSalaryIndex(BigDecimal salaryIndex) {
        this.salaryIndex = salaryIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id &&
                Objects.equals(title, job.title) &&
                Objects.equals(salaryIndex, job.salaryIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, salaryIndex);
    }
}
