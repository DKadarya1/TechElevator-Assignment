<template>
    <div>
        <h2>{{ book.title}}</h2>
        <h3>{{ book.author}}</h3>

    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />

        <p v-if="book.read">I have read this book"</p>
        <p v-else>I have not read this book"</p>


    </div>
</template>

<script>
export default {
    props:["book"]
        
    }

</script>
