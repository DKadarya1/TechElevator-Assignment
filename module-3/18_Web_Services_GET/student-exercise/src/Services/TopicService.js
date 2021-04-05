import axios from 'axios';

const ax =axios.create({
    baseURL: "http://localhost:3000"
});

export default {
    getTopics() {
        return ax.get("/topics");
    },
    getTopic(topicID) {
        return ax.get('/topics/${topicID}');
    }
}