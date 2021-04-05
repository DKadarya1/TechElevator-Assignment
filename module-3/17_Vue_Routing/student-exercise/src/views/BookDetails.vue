<template>
    <div>
        <book-details v-bind:book="theBook" />
    </div>
</template>

<script>
import BookDetails from '@/components/BookDetails';


export default {
    components: {
        BookDetails  
    },
    computed: {
        theBook() {
            return this.$store.state.books.find(b => b.isbn === this.$route.params.isbn);
        }
    }
}
</script>