package list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		String[] array = { "りんご", "ゴリラ", "らっぱ", "ごま" };
		// rrays.asListで変換できるげ
        List<String> list = Arrays.asList(array);

        
        final List<String> filterList1 = Arrays.asList(array).stream()
                .filter( o -> o.equals("ごま") )           
                .map( o -> o.toLowerCase() )        
                .collect( Collectors.toList() );
        
        // ごま
        filterList1.stream().forEach( System.out::println );
	}

}
