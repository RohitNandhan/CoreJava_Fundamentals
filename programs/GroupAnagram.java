package PracticePrograms.coreJava.programs;
import java.util.*;

class GroupAnagram {

       




    public List<List<String>> groupAnagram(String[] strs) {
    	//strs=new String[] {"nan","ann","nna","aan"};
        Map<String, List<String>> map=new HashMap<>();
        
        for(String word:strs){
        	char[] chars=word.toCharArray();
        	Arrays.sort(chars);
        	String sortedWord= new String(chars);
        	
//        	if(!map.containsKey(sortedWord)) {
        		map.putIfAbsent(sortedWord, new ArrayList<>());
        	//	map.put(sortedWord, new ArrayList<>());
        		
//        	}
        	map.get(sortedWord).add(word);
             
        }


        return new ArrayList<>(map.values());
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int check = 0;
        String strs[] = new String[n];
        for(int i = 0 ; i < n ;i++) {
            strs[i] = scanner.next();
        }
        List<List<String>> result = new GroupAnagram().groupAnagram(strs);
        	System.out.println(result);
        for (int i = 0; i < result.size(); ++i) {
            for (int  j = 0; j < result.get(i).size(); ++j) {
                System.out.printf("%s ", result.get(i).get(j));
            }
            System.out.printf("\n");
        }
    }
}