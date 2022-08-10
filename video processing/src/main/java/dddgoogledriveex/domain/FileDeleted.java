package dddgoogledriveex.domain;

import dddgoogledriveex.domain.*;
import dddgoogledriveex.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileDeleted extends AbstractEvent {

    private Long id;
    // keep

}
