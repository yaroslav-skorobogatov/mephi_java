package pckg.lesson11.streams2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movie {
    private String title;
    private String genre;
    private long duration;

    @Override
    public String toString() {
        return title;
    }
}
