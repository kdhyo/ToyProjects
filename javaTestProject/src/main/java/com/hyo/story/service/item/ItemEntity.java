package com.hyo.story.service.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hyo.story.service.utils.dto.DefaultDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter @Setter @SuperBuilder @Entity
@Table(name = "item")
@NoArgsConstructor @AllArgsConstructor
public class ItemEntity extends DefaultDTO {

	@Id
	@Column(name = "item_id")
	protected String itemId;

	@Column(name = "item_name")
	protected String itemName;

	@Column(name = "color")
	protected String color;

	@Override
	public String getId() {
		return itemId;
	}

}
