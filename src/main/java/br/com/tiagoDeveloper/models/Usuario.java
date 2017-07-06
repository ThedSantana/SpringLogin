package br.com.tiagoDeveloper.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Usuario {
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private String cpf;
	private String dataNasc;
	private int tel;
	private int cel;
	private int cep;
	private String rua;
	private int num;
	private String compl;
	private String bairro;
	private String cid;
	private String uf;
	private String email;
	private int perfil;

	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}


	public Usuario(Long id, String nome, String cpf, String dataNasc, int tel, int cel, int cep, String rua, int num,
			String compl, String bairro, String cid, String uf, String email) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.tel = tel;
		this.cel = cel;
		this.cep = cep;
		this.rua = rua;
		this.num = num;
		this.compl = compl;
		this.bairro = bairro;
		this.cid = cid;
		this.uf = uf;
		this.email = email;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}


	public int getTel() {
		return tel;
	}


	public void setTel(int tel) {
		this.tel = tel;
	}


	public int getCel() {
		return cel;
	}


	public void setCel(int cel) {
		this.cel = cel;
	}


	public int getCep() {
		return cep;
	}


	public void setCep(int cep) {
		this.cep = cep;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getCompl() {
		return compl;
	}


	public void setCompl(String compl) {
		this.compl = compl;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCid() {
		return cid;
	}


	public void setCid(String cid) {
		this.cid = cid;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public int getPerfil() {
		return perfil;
	}


	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + ", tel=" + tel
				+ ", cel=" + cel + ", cep=" + cep + ", rua=" + rua + ", num=" + num + ", compl=" + compl + ", bairro="
				+ bairro + ", cid=" + cid + ", uf=" + uf + ", email=" + email + "]";
	}
	
}
