<template>
  <div class="book-container">
    <router-link to="/"><router-link>
      
    <router-link v-for="b in $store.state.books" v-bind:key="b.isbn" v-bind:to="{name: 'book-details', params: {isbn:b.isbn} }">
      <book-card v-bind:book="b" />
    </router-link>
  </div>
</template>

<script>
import BookCard from '@/components/BookCard.vue';

export default {
    name: 'reading-list',
    components: {
        BookCard
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