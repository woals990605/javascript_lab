package site.metacoding.test5;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {
    // 다른 도메인의 자바스크립트 요청만 금지
    // @CrossOrigin걸면 허용
    @CrossOrigin // 자바스크립트 요청 허용!!
    @GetMapping("/number")
    public List<Integer> number() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // View Resolver 작동 (@Controller) = 파일을 찾아주는 친구
        // MessageConverter 작동 (@RestController) = JSON으로 변환해서 응답
        return list;// [1,2,3,4]
    }
}