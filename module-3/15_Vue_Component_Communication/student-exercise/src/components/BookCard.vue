<template>
  <div class="card" v-bind:class="{ read: b.read }">
    <h2 class="book-title">{{ b.title }}</h2>
     <h3 class="book-author">{{ b.author }}</h3>
    <img v-if="b.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + b.isbn + '-M.jpg'" />
    <!--
    <button @click="handleClick" v-if="!b.read" class="mark-read" >Mark Read</button>
    <button @click="handleClick" v-if="b.read" class="mark-unread" >Mark Unread</button>
    -->
    <button v-bind:class="b.read ? 'mark-read' : 'mark-unread'" v-on:click="handleClick">{{ b.read ? 'Mark Unread' : 'Mark Read' }}</button>
   
  </div>
</template>

<script>
export default {
    name: 'book-card',
    props: {
        b: Object
    },

    methods : {
        handleClick(){
            this.$store.commit("FLIP_READ_STATUS", this.b);
        }
        }
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