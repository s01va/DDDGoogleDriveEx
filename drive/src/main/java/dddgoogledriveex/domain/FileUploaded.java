package dddgoogledriveex.domain;

import dddgoogledriveex.domain.*;
import dddgoogledriveex.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Integer size;
    private Date createdTime;
    private String type;
    private String ownerId;

    public FileUploaded( aggregate){
        super(aggregate);
    }
    public FileUploaded(){
        super();
    }
    // keep

}
