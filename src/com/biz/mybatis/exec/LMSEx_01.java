package com.biz.mybatis.exec;

import com.biz.mybatis.service.ScoreService;
import com.biz.mybatis.service.StdService;

public class LMSEx_01 {

	public static void main(String[] args) {

		StdService stdService =new StdService();
		ScoreService scoreService=new ScoreService();
		while(true) {
			System.out.println("=========================");
			System.out.println("빛나리 고교 학사 관리");
			System.out.println("-------------------------");
			
			// 학번검사를 하여 없으면 등록 있으면 다음으로 계속
			if(stdService.isNotStd()) stdService.inserStd();
			
			// 학번 변수 값읋 가져오기
			String st_num=stdService.getSt_num();
			// 성적을 입력하기 위해서 학번을 ScoreService에 Se
			scoreService.setSt_num(st_num);
			scoreService.viewScore(st_num);
			scoreService.insertScore(st_num);
			
			
			
			
			
		}
		
		
		
	}

}
