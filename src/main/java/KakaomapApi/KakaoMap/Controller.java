package KakaomapApi.KakaoMap;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/map")
    public String map(){
        return "map";
    }
    @PostMapping("/ESS")
    public String ESS(){
        return "ESS";

    }
}
