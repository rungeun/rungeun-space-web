package space.rungeun.rungeun_project.repository;

import org.springframework.data.repository.CrudRepository;
import space.rungeun.rungeun_project.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
