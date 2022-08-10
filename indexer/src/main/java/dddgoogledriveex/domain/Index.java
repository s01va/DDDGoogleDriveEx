package dddgoogledriveex.domain;

import dddgoogledriveex.IndexerApplication;
import dddgoogledriveex.domain.FileIndexed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Index_table")
@Data
public class Index {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ElementCollection
    @ElementCollection
    private List<String> keywords;

    private String fileId;

    @PostPersist
    public void onPostPersist() {
        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();
    }

    public static IndexRepository repository() {
        IndexRepository indexRepository = IndexerApplication.applicationContext.getBean(
            IndexRepository.class
        );
        return indexRepository;
    }

    public static void deleteIndex(FileDeleted fileDeleted) {
        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileDeleted.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);


         });
        */

    }
}
