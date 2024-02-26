package shop.mtcoding.blog.resume;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

@Import(ResumeRepository.class)
@DataJpaTest
public class ResumeRepositoryTest {

    @Autowired
    private ResumeRepository resumeRepository;

    @Test
    public void findResumeAll() {
        Integer userId = 1;
        String title = "title1";
        String career = "career1";
        String edu = "edu1";
        String area = "area1";
        String position = "position1";
        String intro = "intro1";
        String link = "link1";
        resumeRepository.insertResume(userId,  title,  career,  edu,  area,  position,  intro,  link);
    }
}
