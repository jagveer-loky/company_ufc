package com.m_landalex.ufc.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Fighter extends AbstractObject {

	private WeightClass weightClass;
	private int ufcRanked;
	private String firstName;
	private String lastName;
	private int age;
	private Trainingteam trainingteam;
	private int wins;
	private int loses;
	private int undecided;
	
}
