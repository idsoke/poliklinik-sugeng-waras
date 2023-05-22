package xyz.geekcoding.admin.model;

import javax.persistence.*;

@Entity
@Table(name = "gc_perawat")
public class JanjiTemu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
   }
