
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList al = new ArrayList();
        int input[] = {11, 22, 33, 44, 55, 66, 77, 88, 88, 99};

        // 判断al是否为空
        System.out.println("判断ArrayList是否为空：" + al.isEmpty());

        // 随机写入10个数字
        System.out.println("写入10个数字：");
        for (int i = 0; i < 10; i++) {
            int number = input[i];
            System.out.println("index: " + i + " value: " + number);
            al.add(number);
        }

        // 判断al是否为空
        System.out.println("判断ArrayList是否为空：" + al.isEmpty());

        // 获取al的大小
        System.out.println("获取ArrayList的大小：" + al.size());

        // 判断是否包含某个值
        System.out.println("判断是否包含 77：" + al.contains(77));
        System.out.println("判断是否包含 777：" + al.contains(777));

        // 查看 77 的下标
        System.out.println("查看 77 的下标：" + al.indexOf(77));
        System.out.println("查看 66 的下标：" + al.indexOf(66));

        // 修改某个下标的值
        System.out.println("把第一个数改成为 111 ：" + al.set(0, 111));
        al.printElements();

        // 删掉 77 值
        // 在这里 ArrayList 有两个函数名一样的重载函数
        // 所以我们需要将 int 77 强制转化城 Object
        // 或则我们在一开始 添加的时候换成其他类型的值，例如 string double
        System.out.println("删掉 77：" + al.remove((Object) 77));
        al.printElements();
        // 判断是否包含某个值
        System.out.println("再次判断是否包含 77：" + al.contains(77));
    }
}
