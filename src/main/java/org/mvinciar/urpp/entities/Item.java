package org.mvinciar.urpp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ITEMS")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ITEM_ID")
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="PRICE")
	private Long price;
	
	public Item(String name, Long price) {
		this.name = name;
		this.price = price;
	}
}
