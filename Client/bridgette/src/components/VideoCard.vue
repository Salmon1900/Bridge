<template>
    
    <v-container>
        <v-card
            class="mx-auto"
            max-width="640"
        >
            <v-container>
                <v-row align="center">
                    <v-col cols="10" justify="end">
                        <v-card-text class="text--primary">
                            <div>{{ title }}</div>
                            <div>{{ description }}</div>
                         </v-card-text>
                    </v-col>
                    <v-col cols="2">
                        <v-btn class="mx-2" fab dark large color="teal darken-1"
                        @click="openVideo()">
                        <v-icon>mdi-play</v-icon>
                             </v-btn>
                    </v-col>
                </v-row>
            </v-container>
        </v-card>
        <div class="text-center">
            <v-dialog
            v-model="dialog"
            width="1525"
            height="1100"
            :scrollable="false"
            >

            <v-card jsutify="center" width="1800"> 
                <v-card-title
                    class="headline grey lighten-2"
                    primary-title
                    >
                    {{ title }}
                </v-card-title>
                <v-container justify="end">
                    <v-row justify="end">
                        <v-col>
                        <youtube 
                        v-if="dialog"
                        :video-id="videoId"
                        player-height="670"
                        player-width="1500" ></youtube>
                        </v-col>
                    </v-row>
                </v-container>

                <v-card-actions>
                    <v-spacer></v-spacer>
                    <v-btn
                        color="primary"
                        text
                        @click="dialog = false"
                    >
                        סגור
                    </v-btn>
                </v-card-actions>
            </v-card>
            </v-dialog>
        </div>
    </v-container>

</template>

<script>
export default {
    name: "video-card",
    props: {
        videoURL:  String,
        title: String,
        description: String
    },
    data() {
        return {
            videoId: this.$youtube.getIdFromURL(this.videoURL),
            dialog: false
        }
    },
    methods: {
        openVideo(){
            this.dialog = true
        }
    }
}
</script>

<style scoped>

</style>