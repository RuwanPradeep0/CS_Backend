package CS.Backend.cs.backend.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
@RequiredArgsConstructor
@CrossOrigin("*")
public class DemoController {

    @GetMapping
    public String printText(){
        return "Demo controller";
    }


}
