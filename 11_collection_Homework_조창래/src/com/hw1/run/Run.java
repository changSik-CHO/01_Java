package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		
		List<Friend> friends = new ArrayList<>();
		
		
		friends.add(new Friend("짱구"));
		friends.add(new Friend("철수"));
		friends.add(new Friend("유리"));
		friends.add(new Friend("훈이"));
		friends.add(new Friend("맹구")); //ArrayList 객체 생성 후 추가
		
		Random random = new Random();
		int randomIndex = random.nextInt(friends.size()); 
		// 개인적인 생각으로는 랜덤으로 하나를 리스트에서 뽑아서
		// 골목대장 누군지 출력해야하니 
		// new 연산자 사용해서 랜덤 인덱스 사용해야함
		Friend leader = friends.get(randomIndex);
		
		leader.pickLeader();
		 
		
	}

}
