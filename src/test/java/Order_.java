import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Order_ {
    @Test
    public void given_an_empty_string_return_empty_string() {
        assertThat(Order.order("")).isEqualTo("");
    }

    @Test
    public void given_a_string_with_text_and_numbers_order_them() {
        assertThat(Order.order("is2aa Thi1s T4est 3a")).isEqualTo("Thi1s is2aa 3a T4est");
    }
}
