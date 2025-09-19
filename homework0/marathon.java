import java.util.TreeMap;
public class marathon{
	public static void main(String[] args){
 TreeMap<Integer, String> runnerMap = new TreeMap<>();
        runnerMap.put(120, "张三");  // 键为成绩(分钟)，值为姓名
        runnerMap.put(110, "李四");
        runnerMap.put(130, "王五");
        
        runners rn = new runners(runnerMap);
	System.out.println("NO.2:"+rn.getindex(2)[0]);
}
}
class runners{
TreeMap<Integer,String> runner =new TreeMap<>();
	public runners(TreeMap<Integer,String> runner){
		this.runner=runner;

}
	public Object[] getindex(int i){
	int k=0;
	for(var j:runner.entrySet()){
k++;
if(k==i)
return new Object[]{j.getKey(),j.getValue()};	
}
return null;
}	
	public int[] getbyname(String name){
int i=0;
	for(var j:runner.entrySet()){
	i++;
if(j.getValue().equals(name))return new int[]{i,j.getKey()};
}
return null;
}
}
