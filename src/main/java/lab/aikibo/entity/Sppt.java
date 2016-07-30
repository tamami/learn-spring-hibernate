package lab.aikibo.entity;

import java.math.BigInteger;
import java.io.Serializable;

public class Sppt implements Serializable {

  private String nop;
  private String thnPajak;
  private String nama;
  private String alamatOp;
  private BigInteger pokok;
  private BigInteger denda;

  public Sppt(String nop, String thnPajak, String nama, String alamatOp,
      BigInteger pokok, BigInteger denda) {
    this.nop = nop;
    this.thnPajak = thnPajak;
    this.nama = nama;
    this.alamatOp = alamatOp;
    this.pokok = pokok;
    this.denda = denda;
  }

  public String toString() {
    String result = "nop: " + nop + "\n" +
      "thn pajak: " + thnPajak + "\n" +
      "nama: " + nama + "\n" +
      "alamat op: " + alamatOp + "\n" +
      "pokok: " + pokok + "\n" +
      "denda: " + denda;
    return result;
  }

  public String getNop() {
    return nop;
  }

  public void setNop(String nop) {
    this.nop = nop;
  }

  public String getThnPajak() {
    return thnPajak;
  }

  public void setThnPajak(String thnPajak) {
    this.thnPajak = thnPajak;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getAlamatOp() {
    return alamatOp;
  }

  public void setAlamatOp(String alamatOp) {
    this.alamatOp = alamatOp;
  }

  public BigInteger getPokok() {
    return pokok;
  }

  public void setPokok(BigInteger pokok) {
    this.pokok = pokok;
  }

  public BigInteger getDenda() {
    return denda;
  }

  public void setDenda(BigInteger denda) {
    this.denda = denda;
  }

}
