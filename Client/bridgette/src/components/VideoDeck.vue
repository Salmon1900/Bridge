<template>
    <v-container >
        <v-row>
            <v-col cols="4" v-for="video in videos" :key="video.videoId">
                <video-card
                :title="video.title"
                :description="video.description"
                :videoURL="video.videoURL"></video-card>
            </v-col>
        </v-row>
    </v-container>
</template>

<script>
import VideoCard from './VideoCard.vue'
export default {
    name: "video-deck",
    props: {
        categoryId: Number
    },
    components: {
        VideoCard
    },
    data() {
        return {
            videos: [
                {
                    videoId: 1,
                    title: "סרטון אחד",
                    description: "זה ההסבר על סרטון מספר אחד זה ההסבר על סרטון מספר אחד זה ההסבר על סרטון מספר אחד זה ההסבר על סרטון מספר אחד זה ההסבר על סרטון מספר אחד",
                    videoURL: "https://www.youtube.com/watch?v=2IomnCvxWzM"
                },
            ]
        }
    }
}
</script>

<style scoped>

</style>