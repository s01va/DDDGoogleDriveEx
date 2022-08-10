package dddgoogledriveex.domain;

import dddgoogledriveex.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Integer size;
    private Date createdTime;
    private String type;
    private String ownerId;
}
