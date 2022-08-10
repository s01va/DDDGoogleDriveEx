package dddgoogledriveex.domain;

import dddgoogledriveex.domain.*;
import dddgoogledriveex.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;
    private List<String> keywords;
    private String fileId;

    public FileIndexed( aggregate){
        super(aggregate);
    }
    public FileIndexed(){
        super();
    }
    // keep

}
