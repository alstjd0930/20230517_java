package kh.lclass.db.board.model.vo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AttachFileVo {
	private int bno ;
	private String filepate;
	private String fileno;
	
}
