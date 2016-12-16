import org.springframework.web.client.RestTemplate;

/**
 * Created by wangzz on 2016/12/13.
 */
public class Test {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8081/users";
        //Map<String, Object> searchParams = new HashMap<String, Object>();
        //searchParams.put("id", "1");
        //User user = restTemplate.postForObject(url, searchParams, User.class);
        String userStr = restTemplate.postForObject(url, null, String.class);
        //System.out.println(user.toString());
        System.out.println(userStr);
    }

}
