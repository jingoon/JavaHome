package IfAndMethodEx;

import IfAndMethod.Person;
import IfAndMethod.TV;

public class MainEx {

	public static void main(String[] args) {

		TV lgtv = new TV();
		Person kim = new Person();
		kim.setTv(lgtv);
	System.out.println(kim.getTv().isPower()); //파워 초기값 확인
		kim.tvOnOff();			//tv켜기
		kim.tvOnOff(); 			//tv끄기
		kim.getTv().getTvInfo();//tv인포 볼륨과 채널확인
		kim.getTv().volUp();  	//볼륨 올리기
		kim.getTv().chUp();		//채널 올리기
		kim.getTv().getTvInfo();//tv인포 볼륨과 채널 안변하는지 확인
		kim.tvOnOff();			//tv켜기
		kim.getTv().setCh(999);	//채널 999로 변경
		kim.getTv().setVol(100);//볼륨 100으로 변경
		kim.getTv().getTvInfo();//tv인포 볼륨과 채널 변경 확인
		kim.getTv().chUp();		//채널업 999+1
		kim.getTv().volUp();	//볼륨업 100+1
		kim.getTv().getTvInfo();// 채널과 볼륨 0, 100 확인
		kim.getTv().setCh(0);	//채널 0로 변경
		kim.getTv().setVol(0);	//볼륨 0으로 변경
		kim.getTv().getTvInfo();//tv인포 볼륨과 채널 변경 확인
		kim.getTv().chDown();	//채널 다운 0-1
		kim.getTv().volDown();	//볼륨 다운 0-1
		kim.getTv().getTvInfo();//채널과 볼륨 999, 0 확인
		
	}

}
