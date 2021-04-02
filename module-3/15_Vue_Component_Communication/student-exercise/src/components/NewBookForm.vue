<template>
<div>
  <form class="new-book-form" @submit.prevent="addNewBook">
    <input type="text" name="title" class="title-input"  placeholder="Title" v-model="newBook.title" />
    <input type="text" name="author" class="author-input" placeholder="Author" v-model="newBook.author" />
    <input type="text" name="isbn" class="isbn-input" placeholder="ISBN" v-model="newBook.isbn" />

    <button type="submit">Add your book </button>

  </form>
</div>
</template>

<script>
export default {
    name: 'new-book-form',
    data() {
        return {
            newBook : {
                read: true
            }
        };
    },
    methods: {
        addNewBook() {
            this.$store.commit("ADD_BERK", this.newBook);
            
            
        }
    }
}
</script>

<style>
</style>