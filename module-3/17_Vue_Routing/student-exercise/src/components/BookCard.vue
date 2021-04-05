<template>
  <div class="card" v-bind:class="{ read: book.read === true}">
    <h1 class="book-title">{{ book.title }}</h1>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <p class="book-author">{{ book.author }}</p>
        <button v-if="book.read ===false" class="mark-read" v-on:click = "toggleReadStatus()"> Mark Read</button>
        <button v-if="book.read ===true" class="mark-unread" v-on:click = "toggleReadStatus()"> Mark UnRead</button>
    </div>
</template>

<script>
export default {
    name: 'book-card',
    props: ['book'],
    methods: {
        toggleReadStatus(){
            this.$store.commit("TOGGLE_READ_STATUS", this.book);
        },
        addToReadingList(book) {
            let addedBook = Object.assign({ read: false }, book);
            delete addedBook.bestSeller;
            delete addedBook.newRelease;
            this.$store.commit('SAVE_BOOK', addedBook);
        }
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>