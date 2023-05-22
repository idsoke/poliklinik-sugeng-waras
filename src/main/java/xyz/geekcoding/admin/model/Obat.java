package xyz.geekcoding.admin.model;

import javax.persistence.*;

@Entity
@Table(name = "gc_obat")
public class Obat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String namaObat;
    private String keterangan;
    private String dosis;



}
