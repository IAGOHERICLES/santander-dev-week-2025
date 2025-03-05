package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;
    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Feature>  featureLinst;
    @OneToMany(cascade = CascadeType.ALL)
    private List<News> news;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }
    public Card getCard() { return card; }
    public void setCard(Card card) { this.card = card; }
    public List<Feature> getFeatureLinst() { return featureLinst; }
    public void setFeatureLinst(List<Feature> featureLinst) {}
}
