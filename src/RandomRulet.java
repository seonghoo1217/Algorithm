import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomRulet {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		List<Integer> problem_list=new ArrayList<>();
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<18;i++){
			problem_list.add(Integer.parseInt(br.readLine()));
		}
		for (int i=0;i<3;i++){
			int index = (int) (Math.random() * (problem_list.size()));
			sb.append(problem_list.get(index)).append("\n");
		}
		System.out.println(sb);
	}
}
