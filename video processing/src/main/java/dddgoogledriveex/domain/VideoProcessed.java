package dddgoogledriveex.domain;

import dddgoogledriveex.domain.*;
import dddgoogledriveex.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String url;
    private Long fileId;

    public VideoProcessed( aggregate){
        super(aggregate);
    }
    public VideoProcessed(){
        super();
    }
    // keep

}
