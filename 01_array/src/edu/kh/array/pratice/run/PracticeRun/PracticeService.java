package edu.kh.array.pratice.run.PracticeRun;

public class PracticeService {

 	public void practice1() {
		
		/*길이가 9인 배열을 선언 및 할당하고, 
		 * 1부터 9까지의 값을 반복문을 이용하여
		 * 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		 * 짝수 번째 인덱스 값의 합을 출력하세요. 
		 * (0 번째 인덱스는 짝수로 취급)		  
		 * */
		
 		    // 1. 길이가 9인 배열 선언 및 할당
 		    int[] arr = new int[9];

 		    // 2. 1부터 9까지 반복문으로 값 대입
 		    for (int i = 0; i < arr.length; i++) {
 		        arr[i] = i + 1;
 		    }

 		    // 3. 배열 요소 출력
 		    for (int i = 0; i < arr.length; i++) {
 		        System.out.print(arr[i] + " ");
 		    }
 		    System.out.println(); // 줄바꿈

 		    // 4. 짝수 번째 인덱스 합 구하기 (0번째도 짝수 취급)
 		    int sum = 0;
 		    for (int i = 0; i < arr.length; i++) {
 		        if (i % 2 == 0) { // 인덱스가 짝수인 경우
 		            sum += arr[i];
 		        }
 		    }

 		    // 5. 결과 출력
 		    System.out.println("짝수 번째 인덱스 합 : " + sum);
 		}
 	public void practice2() {
 		//길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
 		//순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
 		//홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
 		
 		    // 1. 길이가 9인 배열 선언 및 할당
 		    int[] arr = new int[9];

 		    // 2. 9부터 1까지 반복문으로 값 대입
 		    for (int i = 0; i < arr.length; i++) {
 		        arr[i] = 9 - i;  // i=0 -> 9, i=1 -> 8 ... i=8 -> 1
 		    }

 		    // 3. 배열 요소 출력
 		    for (int i = 0; i < arr.length; i++) {
 		        System.out.print(arr[i] + " ");
 		    }
 		    System.out.println(); // 줄바꿈

 		    // 4. 홀수 번째 인덱스 합 구하기 (0번째는 짝수로 취급)
 		    int sum = 0;
 		    for (int i = 0; i < arr.length; i++) {
 		        if (i % 2 == 1) {  // 인덱스가 홀수일 때만 합산
 		            sum += arr[i];
 		        }
 		    }

 		    // 5. 결과 출력
 		    System.out.println("홀수 번째 인덱스 합 : " + sum);
 		
 
	  
 	}
 	
 	public void practice3() {
 		/*사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
 		 * 	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
 		 */
 		
 		int[]arr = new int[]
 	}
	}

           
        
        
        
