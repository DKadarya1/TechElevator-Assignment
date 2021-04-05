<template>
<div>
    <a href = # v-if= "showForm === false"
    v-on:click.prevent="showForm = true"> New Book Form </a>

  <form class="new-book-form" v-on:submit.prevent="addNewBook" v-if="showForm === true">
<div>
    <label for ="title">Title:</label>
    <input class="title-input" id="title" type="text" v-model="newBook.title" />
</div>
<div>
        <label for ="Author">Author:</label>
    <input class="author-input" id="Author" type="text" v-model="newBook.author" />
</div>
<div>
        <label for ="isbn">ISBN:</label>
    <input class="isbn-input" id="ISBN" type="text" v-model="newBook.isbn" />
</div>
<input type ="submit" value="Save" />
<input type="button" value="Cancel" v-on:click.prevent="resetForm" />
  </form>
</template>

<script>
export default {
    name: "new-book-form",
    data() {
        return {
           showForm: true,
           newBook: {
               read:false
           }
            }
    },
    methods: {
        addNewBook() {
            this.$store.commit("ADD_NEW_BOOK", this.newBook);
            this.resetForm(); 

        },
        resetForm(){
            this.showForm = false;
            this.newBook ={};
        }
    }
}
</script>

<style>
.new-book-form {
    margin: 20px;
}

.new-book-form input, .new-book-form button {
    margin: 10px;
    font-size: 1rem;
}
</style>