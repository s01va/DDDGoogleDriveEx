package dddgoogledriveex.domain;

import dddgoogledriveex.infra.AbstractEvent;
import lombok.Data;
import java.util.Date;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private List&lt;String&gt; keywords;
    private String fileId;
}
