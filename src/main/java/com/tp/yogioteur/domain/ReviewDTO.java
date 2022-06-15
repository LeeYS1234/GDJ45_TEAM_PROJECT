package com.tp.yogioteur.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ReviewDTO {
	// 업데이트 테스용
	//ㅁㅇㄹㄴㄴㄴ
	private Long reviewNo;
	private Long memberNo;
	private String reviewTitle;
	private String reviewContent;
	private Date reviewCreated;
	private Integer reviewRevNo;
}
