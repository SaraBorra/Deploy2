package Deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/v1")
public class BasicController {
    @GetMapping
    public int getSum() {
        Random random = new Random();
        return random.nextInt(200) + random.nextInt(200);
    }
}