import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class RandomRulet {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		HashSet<Integer> problem_list=new HashSet<>();
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<15;i++){
			problem_list.add(Integer.parseInt(br.readLine()));
		}

		List<Integer> list=new ArrayList<>(problem_list);
		for (int i=0;i<3;i++){
			int index = (int) (Math.random() * (problem_list.size()));
			sb.append(list.get(index)).append("\n");
		}
		System.out.println(sb);
	}
}