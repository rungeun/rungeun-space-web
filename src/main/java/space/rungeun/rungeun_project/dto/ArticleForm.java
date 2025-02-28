package space.rungeun.rungeun_project.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;
import space.rungeun.rungeun_project.entity.Article;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
