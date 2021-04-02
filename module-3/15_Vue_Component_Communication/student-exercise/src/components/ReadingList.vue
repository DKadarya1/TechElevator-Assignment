<template>
  <div class="book-container">
    <book-card v-for= "berk in dollarStoreBooks" v-bind:key="berk.isbn" v-bind:b="berk"/>
  </div>
</template>

<script>
import BookCard from './BookCard.vue';

export default {
    components: {
        BookCard
    },
    name: 'reading-list',

    computed : {
      dollarStoreBooks(){
        return this.$store.state.books;
      }
    },
    methods : {

    }
}
</script>



<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>