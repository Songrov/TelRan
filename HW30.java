package telran.homework;
/*
//1. Добавьте обработку ошибок в CardsController чтобы исключение возвращалось в осмысленном виде
// GET http://localhost:8080/cards/2
@GetMapping("/cards/{id}")
public Card getCardById(
        @PathVariable Long id
) {
    Card card = cardsRepository.findById(id).orElse(null);
    if(card == null) {
        throw new CardException("Card with id " + id + " not found", id);
    }
    return card;
}





@ExceptionHandler(value = {CardException.class})
protected ResponseEntity<Object> handleCardException(
        CardException ex,
        WebRequest request
) {
    Map<String, String> errors = new HashMap<>();
    errors.put("message", ex.getText());
    errors.put("card_id", ""+ex.getId());
    errors.put("path", request.getDescription(false));

    return handleExceptionInternal(
            ex,
            errors,
            new HttpHeaders(),
            HttpStatus.BAD_REQUEST,
            request
    );
}



// (x) 2. Добавьте в CardRepository метод, который вернет все комменты для всех товаров в карте

@Repository
public interface CommentsRepository extends CrudRepository<Comment, Long> {
    Iterable<Comment> findByProductId(Long productId);

    @Transactional // все изменения таблиц базы данных выполняются в рамках одной транзакции
    @Modifying // метод изменяет таблицы базы данных
    void deleteByProductId(long productId); // генерируется по 1 delete запросу на каждый коммент


    @Transactional
    @Modifying
    @Query(
            nativeQuery = true,
            value = "delete from comments where product_id=:productId"
    )
    void deleteAllProductComments(long productId);


    @Query(
            "select com from Comment com where com.product in " +
                    " (select c.products from Card c where c.id=:cardId) "
    )
    Iterable<Comment> getAllCardComments(long cardId);
}





//(x) 3. Добавьте в CardController вызов этого метода, чтобы для указанной карты возвращались все комменты для всех ее товаров
*/