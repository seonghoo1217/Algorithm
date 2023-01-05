import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RandomRulet {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		HashSet<Integer> problem_list1=new HashSet<>();
		HashSet<Integer> problem_list2=new HashSet<>();

		StringBuilder sb=new StringBuilder();
		for (int i=0;i<10;i++){
			problem_list1.add(Integer.parseInt(br.readLine()));
		}

		for (int i=0;i<10;i++){
			problem_list2.add(Integer.parseInt(br.readLine()));
		}

		List<Integer> list1=new ArrayList<>(problem_list1);
		List<Integer> list2=new ArrayList<>(problem_list2);


		sb.append("이분탐색 ============").append('\n');
		for (int i=0;i<2;i++){
			int index = (int) (Math.random() * (problem_list1.size()));
			sb.append(list1.get(index)).append("\n");
		}
		sb.append("완전탐색 ============").append("\n");
		for (int i=0;i<2;i++){
			int index = (int) (Math.random() * (problem_list2.size()));
			sb.append(list2.get(index)).append("\n");
		}
		System.out.println(sb);
	}
}