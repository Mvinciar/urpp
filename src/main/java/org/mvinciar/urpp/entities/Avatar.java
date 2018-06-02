package org.mvinciar.urpp.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="AVATARS")
public class Avatar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="AVATAR_ID")
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LEVEL")
	private Integer level;
	
	@OneToMany
	private List<Item> items;
}
