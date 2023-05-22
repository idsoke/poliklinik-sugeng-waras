package xyz.geekcoding.admin.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "gc_obat")
public class RekamMedis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private Date tanggalKunjungan;
    private Long idPasien;
    private Long idDokter;
    private String keteraangan;
    private String obat;



}
