/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.run;

import com.itheima.bean.Business;
import com.itheima.bean.Customer;
import com.itheima.bean.Movie;
import com.itheima.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;


public class MovieSystem {
    /**
     * 1. 定义系统的数据容器用户存储数据，存储很多用户(客户对象，商家对象)
     */
    public static final List<User> ALL_USERS = new ArrayList<>();

    /**
     * 2. 存储系统全部商家和其拍片信息: 商家1 = [p1, p2, p3.....], 商家2 = [p1, p2, p3.....] ......
     */
    public static final Map<Business, List<Movie>> ALL_MOVIES= new HashMap<>();

    /**
     * 3. 利用静态代码块准备一些测试数据
     */
    static {
        Customer c = new Customer();
        c.setLoginName("ldh888");
        c.setPassWord("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Customer c2 = new Customer();
        c2.setLoginName("lsm888");
        c2.setPassWord("123456");
        c2.setUserName("黑马卢世猛");
        c2.setSex('男');
        c2.setMoney(10000);
        c2.setPhone("15928483552");
        ALL_USERS.add(c2);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);

        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b , movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassWord("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);

        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies3 = new ArrayList<>();
        ALL_MOVIES.put(b2 , movies3); // 现在商家b3的排面电影目前为空，b2 = []

        Business b3 = new Business();
        b3.setLoginName("lushimeng");
        b3.setPassWord("123456");
        b3.setUserName("黑马包租");
        b3.setMoney(10000);
        b3.setSex('男');
        b3.setPhone("1234567880");
        b3.setShopName("西南石油大学国际影城");
        b3.setAddress("成都市新都区新都大道八号");
        ALL_USERS.add(b3);

        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies4 = new ArrayList<>();
        ALL_MOVIES.put(b3, movies4);  // 现在商家b3的排面电影目前为空
    }

    /**
     * 4. 定义一个静态输入类
     */
    public static final Scanner SYS_SC = new Scanner(System.in);

    /**
     * 5. 定义一个用户静态类
     */
    public static User loginUser;
    public static Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");
    public static SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");



    public static void main(String[] args) {
        showMain();
    }

    /**
     * 首页展示
     */
    private static void showMain() {
        while (true) {
            System.out.println("==========================黑马电影首页=============================");
            System.out.println("1、登录");
            System.out.println("2、用户注册");
            System.out.println("3、商家注册");
            System.out.println("4、退出系统");
            System.out.println("请输入操作命令");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":  // 登录
                    login();
                    break;
                case "2":  // 用户注册
                    break;
                case "3":  // 商家注册
                    break;
                case "4":  // 退出系统
                    return;
                default:
                    System.out.println("输入命令有无，请重新确认输入~~");
            }
        }
    }

    /**
     * 登录功能
     */
    private static void login() {
        while (true) {
            System.out.println("请您输入登录名称：");
            String loginName = SYS_SC.nextLine();
            System.out.println("请您输入登录密码：");
            String passWord = SYS_SC.nextLine();

            // 1. 根据登录名称查询用户对象
            User user = getUserByLoginName(loginName);
            // 2. 判断用户对象是否存在，存在乃说明登录名称正确了
            if(user != null){
                // 3. 比对登录密码是否正确
                if(Objects.equals(user.getPassWord(), passWord)){
                    loginUser = user; // 赋值给全局静态类
                    // 3.1 判断是用户登录还是商家登录
                    if(user instanceof Customer){  // 用户登录
                        showCustomerMain();
                    }else {  // 商家登录
                        showBusinessMain();
                    }
                    return;  // 用户或者商家退出之后要返回到主页面当中，也就是showMain
                }else {
                    System.out.println("密码有毛病~~~");
                }

            }else {
                System.out.println("登录名称错误，请重新收输入~~~");
            }
        }

    }

    /**
     * 商家登录界面
     */
    private static void showBusinessMain() {
        while (true) {
            System.out.println("============黑马电影商家界面===================");
            System.out.println("欢迎" + loginUser.getUserName() + (loginUser.getSex()=='男'? "先生" : "女士") + "进入系统~~~");
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showBusinessInfos();
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                    deleteMovie();
                    break;
                case "4":
                    // 修改电影信息
                    updateMovie();
                    break;
                case "5":
                    // 商家结束操作
                    return;
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     * 更新影片
     */
    private static void updateMovie() {
        // 1. 根据商家对象（就是登录的用户loginUser）,作为Map集合的键 提取对应的值就是其拍片信息：Map<Business, List<Movie>> ALL_MOVIES
        System.out.println("============================修改影片============================");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);  // 根据键找到对应的值

        if(movies.size() == 0){
            System.out.println("当前无片可以下架~~~~");
            return;
        }

        while (true) {
            // 2. 让用户选择需要下架的电影名称
            System.out.println("请您输入需要修改的电影名称：");
            String movieName = SYS_SC.nextLine();

            // 3. 查询该用户的电影集合中是否由该电影
            Movie movie = getMovieByName(movieName);
            if (movie != null){
                // 4. 修改它
                System.out.println("请您输入新的片名：");
                String name = SYS_SC.nextLine();
                System.out.println("请您输入新的主演：");
                String actor = SYS_SC.nextLine();
                System.out.println("请您输入新的电影时长：");
                String time = SYS_SC.nextLine();
                System.out.println("请您输入新的票价：");
                String price = SYS_SC.nextLine();
                System.out.println("请您输入新的票数：");
                String totalNumber = SYS_SC.nextLine();

                while (true) {   // 在输入时间有无的情况下不至于程序崩溃
                    System.out.println("请您输入新的影片放映时间：");
                    String stime = SYS_SC.nextLine();  // 一定要按照yyyy-MM-dd HH:mm:ss格式进行输入，要不然解析会出现异常

                    try {
                        movie.setName(name);
                        movie.setActor(actor);
                        movie.setTime(Double.valueOf(time));
                        movie.setPrice(Double.valueOf(price));
                        movie.setNumber(Integer.valueOf(totalNumber));
                        movie.setStartTime(SDF.parse(stime));

                        System.out.println("您已成功修改了" + "《" + movie.getName() + "》.");
                        showBusinessInfos();
                        return;
                    } catch (ParseException e) {
                        e.printStackTrace();
                        LOGGER.error("时间解析出现异常, 请检查时间输入格式是否按照yyyy-MM-dd HH:mm:ss格式进行输入的~~~");
                    }
                }
            }else {
                System.out.println("查无此片~~~");
                System.out.println("你是否想要继续(y/n):");
                String command = SYS_SC.nextLine();
                switch (command){
                    case "y":
                        break;
                    case "n":
                        System.out.println("好的~~~");
                        return;
                }
            }
        }
    }

    /**
     * 下架影片
     */
    private static void deleteMovie() {
        // 1. 根据商家对象（就是登录的用户loginUser）,作为Map集合的键 提取对应的值就是其拍片信息：Map<Business, List<Movie>> ALL_MOVIES
        System.out.println("============================下架影片============================");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);  // 根据键找到对应的值

        if(movies.size() == 0){
            System.out.println("当前无片可以下架~~~~");
            return;
        }

        while (true) {
            // 2. 让用户选择需要下架的电影名称
            System.out.println("请您输入需要下架的电影名称：");
            String movieName = SYS_SC.nextLine();

            // 3. 查询该用户的电影集合中是否由该电影
            Movie movie = getMovieByName(movieName);
            if (movie != null){
                movies.remove(movie);  // 下架该电影
                System.out.println("电影" + movie.getName() + "已经成功下架~~~");
                showBusinessInfos();  // 展示商家下架影片后信息
                return;
            }else {
                System.out.println("查无此片~~~");
                System.out.println("你是否想要继续(y/n):");
                String command = SYS_SC.nextLine();
                switch (command){
                    case "y":
                        break;
                    case "n":
                        System.out.println("好的~~~");
                        return;
                }
            }
        }
    }

    /**
     * 根据电影名字返回该电影对象
     * @param movieName
     * @return
     */
    private static Movie getMovieByName(String movieName){
        // 1. 根据商家对象（就是登录的用户loginUser）,作为Map集合的键 提取对应的值就是其拍片信息：Map<Business, List<Movie>> ALL_MOVIES
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);  // 根据键找到对应的值

        // 2. 遍历该用户的电影集合，查找是否由该电影名字
        for(Movie movie : movies){
            if(Objects.equals(movie.getName(), movieName)){
                return movie;
            }
        }

        return null;
    }

    /**
     * 上架电影
     */
    private static void addMovie() {
        // 1. 根据商家对象（就是登录的用户loginUser）,作为Map集合的键 提取对应的值就是其拍片信息：Map<Business, List<Movie>> ALL_MOVIES
        System.out.println("============================上架影片============================");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);  // 根据键找到对应的值

        System.out.println("请您输入新片名：");
        String name = SYS_SC.nextLine();
        System.out.println("请您输入主演：");
        String actor = SYS_SC.nextLine();
        System.out.println("请您输入电影时长：");
        String time = SYS_SC.nextLine();
        System.out.println("请您输入票价：");
        String price = SYS_SC.nextLine();
        System.out.println("请您输入票数：");
        String totalNumber = SYS_SC.nextLine();

        while (true) {   // 在输入时间有无的情况下不至于程序崩溃
            System.out.println("请您输入影片放映时间：");
            String stime = SYS_SC.nextLine();  // 一定要按照yyyy-MM-dd HH:mm:ss格式进行输入，要不然解析会出现异常

            try {
                Movie movie = new Movie(name, actor, Double.valueOf(time), Double.valueOf(price), Integer.valueOf(totalNumber), SDF.parse(stime));
                movies.add(movie); // 把商家添加的电影放入到该商家的电影集合中去
                System.out.println("您已成功上架了" + "《" + movie.getName() + "》.");
                return;
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间解析出现异常, 请检查时间输入格式是否按照yyyy-MM-dd HH:mm:ss格式进行输入的~~~");
            }
        }
    }

    /**
     * 展示商家的详细：展示当前商家的信息
     */
    private static void showBusinessInfos() {
        System.out.println("=====================商家详情界面=====================");
        // 1. 根据商家对象(就是登录的用户loginUser)，作为Map集合的键 提取对应的值就是排片信息：Map<Business, List<Movie>> ALL_MOVIES
        Business business = (Business) loginUser;  // 多态的写法
        List<Movie> movies = ALL_MOVIES.get(business);  // 由键拿到值
        System.out.println(business.getShopName() + "\t\t 电话：" + business.getPhone() + "\t\t 地址：" + business.getAddress());
        if(movies.size() > 0){
            System.out.println("电影名称" + "\t\t" + "演员" + "\t\t" + "评分" + "\t\t" + "电影时长" + "\t\t" + "票价" + "\t\t" + "剩余票数" + "\t\t" + "开始时间");
            for(Movie movie : movies){
                System.out.println(movie.getName() + "\t\t" +
                        movie.getActor() + "\t\t" +
                        movie.getScore() + "\t\t" +
                        movie.getTime() + "\t\t" +
                        movie.getPrice() + "\t\t" +
                        movie.getNumber() + "\t\t" +
                        SDF.format(movie.getStartTime()));  // 转换日期
            }
        }else {
            System.out.println("您的店铺目前无片可排~~~~");
        }

    }

    /**
     * 用户登录界面
     */
    private static void showCustomerMain() {
        while (true) {
            System.out.println("============黑马电影客户界面===================");
            System.out.println("欢迎" + loginUser.getUserName() + (loginUser.getSex()=='男'? "先生" : "女士") + "进入系统," +
                    "您的余额为: " + loginUser.getMoney());
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showAllMovies();
                    break;
                case "2":
                    // 根据电影名称查询影片信息

                    break;
                case "3":
                    // 评分功能

                    break;
                case "4":
                    // 购票功能
                    buyMovie();

                    break;
                case "5":
                    // 退出系统
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     * 用户购票功能：先定位商家然后定位影片
     */
    private static void buyMovie() {
        showAllMovies();
        System.out.println("===============用户购票功能================");
        while (true) {
            System.out.println("请您输入需要买票的门店：");
            String shopName = SYS_SC.nextLine();

            // 1. 查询是否存在该商家。
            Business business = getBusinessByShopName(shopName);

            if(business == null){
                System.out.println("对不起，没有该店铺，请确认~~~");
            }else {
                // 2. 此商家全部排片
                List<Movie> movies = ALL_MOVIES.get(business);

                // 3. 判断是否存在上映的电影
                if(movies.size() > 0){
                    // 4. 开始进行选片，假设都有片和余票足够
                    System.out.println("请输入电影名称：");
                    String movieName = SYS_SC.nextLine();
                    for(Movie movie : movies){
                        if(Objects.equals(movie.getName(), movieName)){
                            // 5. 进行钱的计算
                            System.out.println("输入购买数量：");
                            String strTickets = SYS_SC.nextLine();
                            int tickets = Integer.valueOf(strTickets);
                            BigDecimal bigDecimal = new BigDecimal(tickets * movie.getPrice());
                            loginUser.setMoney(loginUser.getMoney() - bigDecimal.doubleValue());  // 重新设置用户的钱数
                            movie.setNumber(movie.getNumber() - tickets);  // 重新设置票数
                            business.setMoney(business.getMoney() + bigDecimal.doubleValue());  // 冲洗设置商家的钱数
                            System.out.println("购票成功~~");
                            return;
                        }
                    }

                }else {
                    System.out.println("该电影院关门了~~~");
                    System.out.println("是否要继续（y/n）?");
                    String command = SYS_SC.nextLine();
                    switch (command){
                        case "y":
                            break;
                        default:
                            System.out.println("好的~");
                            return;
                    }
                }
            }
        }
    }

    /**
     * 根据商家店铺名称查询商家对象
     * @param shopName
     * @return
     */
    public static Business getBusinessByShopName(String shopName){
        Set<Business> businesses = ALL_MOVIES.keySet();
        for(Business business : businesses){
            if(Objects.equals(business.getShopName(), shopName)){
                return business;
            }
        }
        return null;
    }

    /**
     * 真是全部商家和其排片信息
     */
    private static void showAllMovies() {
        System.out.println("============展示全部商家排片信息===================");
        // 方法1. 利用lambda表达式遍历map集合
        ALL_MOVIES.forEach(((business, movies) -> {
            System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone() + "\t\t地址：" + business.getAddress());
            System.out.println("\t\t\t片名\t\t\t主演\t\t\t时长\t\t\t评分\t\t\t票价\t\t\t余票数量\t\t\t放映时间");
            for(Movie movie : movies){
                System.out.println("\t\t\t" +
                        movie.getName() + "\t\t\t" +
                        movie.getActor() + "\t\t\t" +
                        movie.getTime() + "\t\t\t" +
                        movie.getScore() + "\t\t\t" +
                        movie.getPrice() + "\t\t\t" +
                        movie.getNumber() + "\t\t\t" +
                        movie.getStartTime());
            }
        }));

        // 方法2：先得到键的集合，然后由键得到值
//        Set<Business> businesses = ALL_MOVIES.keySet();
//        for(Business business : businesses){
//            System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone() + "\t\t地址：" + business.getAddress());
//            System.out.println("\t\t\t片名\t\t\t主演\t\t\t时长\t\t\t评分\t\t\t票价\t\t\t余票数量\t\t\t放映时间");
//
//            List<Movie> movies = ALL_MOVIES.get(business);  // 根据键得到值
//            for(Movie movie : movies){
//                System.out.println("\t\t\t" +
//                        movie.getName() + "\t\t\t" +
//                        movie.getActor() + "\t\t\t" +
//                        movie.getTime() + "\t\t\t" +
//                        movie.getScore() + "\t\t\t" +
//                        movie.getPrice() + "\t\t\t" +
//                        movie.getNumber() + "\t\t\t" +
//                        movie.getStartTime());
//            }
//        }
        // 方法3：把键值对当做一个整体一起获取进行访问
//        Set<Map.Entry<Business, List<Movie>>> entries = ALL_MOVIES.entrySet();
//        for(Map.Entry<Business, List<Movie>> entry : entries){
//            Business business = entry.getKey();  // 得到键
//            List<Movie> movies = entry.getValue();  // 得到值
//
//            System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone() + "\t\t地址：" + business.getAddress());
//            System.out.println("\t\t\t片名\t\t\t主演\t\t\t时长\t\t\t评分\t\t\t票价\t\t\t余票数量\t\t\t放映时间");
//            for(Movie movie : movies){
//                System.out.println("\t\t\t" +
//                        movie.getName() + "\t\t\t" +
//                        movie.getActor() + "\t\t\t" +
//                        movie.getTime() + "\t\t\t" +
//                        movie.getScore() + "\t\t\t" +
//                        movie.getPrice() + "\t\t\t" +
//                        movie.getNumber() + "\t\t\t" +
//                        movie.getStartTime());
//            }
//        }
    }

    /**
     * 根据登录名称获取该对象
     * @param loginName
     * @return
     */
    public static User getUserByLoginName(String loginName){
        for(User user : ALL_USERS){
            if(Objects.equals(loginName, user.getLoginName())){  // 利用Objects判断两个字符串是否相等，里面的字符串可以为null
                return user;
            }
        }

        return null;
    }
}























