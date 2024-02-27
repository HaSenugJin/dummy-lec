package shop.mtcoding.blog.resume;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class ResumeRepository {
    private final EntityManager em;



    @Transactional
    public void insertResume(Integer userId, String title, String career, String edu, String area, String position, String intro, String link) {
        String q = """
                insert into 
                resume_tb(user_id, title, career, edu, area, position, intro, link, created_at) 
                values(?, ?, ?, ?, ?, ?, ?, ?, now())
                """;
        Query query = em.createNativeQuery(q);
        query.setParameter(1, userId);
        query.setParameter(2, title);
        query.setParameter(3, career);
        query.setParameter(4, edu);
        query.setParameter(5, area);
        query.setParameter(6, position);
        query.setParameter(7, intro);
        query.setParameter(8, link);
        query.executeUpdate();
    }
}
