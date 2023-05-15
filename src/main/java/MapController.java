import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MapController {

    @GetMapping("/map")
    public String showMap(@RequestParam("address") String address, Model model) {
        // address를 이용하여 Kakao Maps JavaScript API를 사용하여 좌표를 얻는 로직 구현
        double latitude = 37.5665; // 임의의 위도 값
        double longitude = 126.9780; // 임의의 경도 값

        model.addAttribute("latitude", latitude);
        model.addAttribute("longitude", longitude);
        return "map";
    }
    @GetMapping("/ulsan")
    public String example(){
        return "gang";
    }

}
