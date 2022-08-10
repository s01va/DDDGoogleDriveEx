package dddgoogledriveex.domain;

import dddgoogledriveex.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class FileDeleted extends AbstractEvent {

    private Long id;
}
