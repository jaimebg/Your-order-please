import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Order_ {
    @Test
    public void given_an_empty_string_return_empty_string() {
        assertThat(Order.order("")).isEqualTo("");
    }
}
