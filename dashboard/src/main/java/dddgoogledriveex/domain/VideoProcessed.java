package dddgoogledriveex.domain;

import dddgoogledriveex.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String url;
    private Long fileId;
}
