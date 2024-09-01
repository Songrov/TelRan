



public class Comments {
/*
1. Добавьте в контроллер комментариев удаление комментария по идентификатору - DELETE для /comments/{id}
 */
    // удаление комментария по идентификатору
    @DeleteMapping("/comments/{id}")
    public ResponseEntity<Comments> deleteCommentsById(
            @PathVariable Long id
    ) {
        Comments comments = commentsRepository.findById(id).orElse(null);
        if (comments == null) {
            throw new IllegalArgumentException("Comments with id " + id + " not found");
        }

        // продукты сохранить
        productsRepository.saveAll(products);
        // удалить комментария
        commentsRepository.delete(comments);
        return ResponseEntity.noContent().build();
    }


/*
Добавьте изменение комментария по идентификатору - PUT для /comments/{id} c приемом json тела коммента для изменения
 */

    // изменение коментария по ее идентификатору
    // PUT http://localhost:8080/cards/1
    @PutMapping("/comments/{id}")
    public Comments updateComments(
            @PathVariable Long id,
            @RequestBody Comments commentsRequest
    ) {

        // замените имя в загруженной комментария
        comments.setName(commentsRequest.getName());
        // спасите измененную комментария
        return commentsRepository.save(comments);
    }

