package xyz.geekcoding.admin.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "gc_obat")
public class Pemeriksaan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private Date tanggalPemeriksaan;
    private Long idPasien;
    private Long idDokter;
    private String hasil_pemeriksaan;
    private String rekomendasiTindakLanjut;



}
