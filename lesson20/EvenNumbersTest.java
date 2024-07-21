package telran.homework.lesson20;


public class EvenNumbersTest {

    @Test
    public void testAllValuesAreEven() {
        List<Integer> odds = List.of(22, 12, 6);
        // Проверяем, что каждый элемент списка четный
        MatcherAssert.assertThat(odds, everyItem(Matchers.both(is((Integer i) -> i % 2 == 0)).and(is(Integer.class))));
    }
}
