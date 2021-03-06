package com.kosta.finalProject.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class MealId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "meal_date")
	private Date mealDate;
	
	// ManyToOne엔 Column 속성 사용 불가
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserVO user; // user_id가 들어올 곳
}
