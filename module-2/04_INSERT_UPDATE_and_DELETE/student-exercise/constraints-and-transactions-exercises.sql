-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
BEGIN TRANSACTION;
INSERT INTO actor 
(first_name, last_name) 
VALUES 
('HAMPTON', 'AVENUE'),
('LISA', 'BYWAY');
COMMIT;
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
BEGIN TRANSACTION;
INSERT INTO film
(title, description, release_year,language_id, length)
VALUES
('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in
ancient Greece', 2008, 1, 198);
COMMIT;

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
BEGIN TRANSACTION;
insert into film_actor (film_id, actor_id)
values (1001, 201);

insert into film_actor (film_id, actor_id)
values (1001, 202);
;

COMMIT;
-- 4. Add Mathmagical to the category table.
BEGIN TRANSACTION;
INSERT INTO category
(name)
Values
('Mathmagical');
COMMIT;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
BEGIN TRANSACTION;
UPDATE  film_category
SET category_id = 17
WHERE film_id IN
 (SELECT film_id FROM film WHERE title IN ('Euclidean PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE'));
 COMMIT;
 -- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
BEGIN TRANSACTION;
UPDATE film
SET rating ='G'
WHERE film_id IN
(SELECT film_id FROM film_category WHERE film_category.category_id = 17);

COMMIT;
-- 7. Add a copy of "Euclidean PI" to all the stores.
BEGIN TRANSACTION;
INSERT INTO inventory
(film_id, store_id)
VALUES
(1001, 1),
(1001, 2);
COMMIT;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- --Didn't Succeed becuase delete on table "film" violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor".
BEGIN TRANSACTION;
DELETE FROM film
WHERE film_id = 1001 AND title ='Euclidean PI';
COMMIT;

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- Didn't succeed becuase "ERROR: update or delete on table "category" violates foreign key constraint "film_category_category_id_fkey" on table "film_category".

BEGIN TRANSACTION;
DELETE FROM category
WHERE name = 'Mathmagical';
COMMIT;
-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- It did succeed because I believe there is nothing referenced from the film_category table.
BEGIN TRANSACTION;
DELETE FROM film_category
WHERE category_id IN
(SELECT category.category_id FROM category WHERE category.NAME = 'Mathmagical');
 COMMIT;
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
BEGIN TRANSACTION;
delete from category
where category.name = 'Mathmagical';

delete from film
where title = 'Euclidean PI';
COMMIT;
-- The delete did not succeed, becuase I think the film_id is still referenced by film_actor table.

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

--I think to be able to remove that we will have to delete the two film_actor insertions and two inventory insertions that we we made earlier.