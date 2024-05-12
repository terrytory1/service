package hello.service.repository;

import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;


@Repository
public class memberRepository {


    private final EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }
}
