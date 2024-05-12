package hello.service.repository;

import hello.service.domain.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class ItemRepositoryTest {

    @Autowired ItemRepository memberRepository;
    @Autowired EntityManager em;

    @Test
    public void save() throws Exception {
        Item item = new Item();
    }

}