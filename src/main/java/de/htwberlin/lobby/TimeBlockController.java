package de.htwberlin.lobby;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

@RestController
public class TimeBlockController {

    @GetMapping("/timeblocks")
    public ResponseEntity<List<TimeBlock>> timeBlocks() {
        return ResponseEntity.ok(List.of(
                new TimeBlock(1L, "Alex", DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(12, 0)),
                new TimeBlock(2L, "Luca", DayOfWeek.MONDAY, LocalTime.of(11, 0), LocalTime.of(14, 0)),
                new TimeBlock(3L, "Sara", DayOfWeek.MONDAY, LocalTime.of(16, 0), LocalTime.of(17, 0)),
                new TimeBlock(4L, "Luca", DayOfWeek.TUESDAY, LocalTime.of(9, 0), LocalTime.of(11, 0))
        ));
    }
}
