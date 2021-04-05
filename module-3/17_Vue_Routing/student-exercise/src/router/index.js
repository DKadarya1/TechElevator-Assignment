import Vue from 'vue';
import VueRouter from 'vue-router';
import BookDetails from '@/views/BookDetails';

Vue.use(VueRouter);

const routes = [
{
  path: '/book/:isbn',
  name: 'book-details',
  component: BookDetails
}
];

const router = new VueRouter({
  mode: 'history',
  routes
});

export default router;
