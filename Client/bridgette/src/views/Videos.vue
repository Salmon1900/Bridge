<template>
  <v-card color="basil">
    <v-card-title class="text-center justify-center py-6">
      <h1 class="font-weight-bold display-3 basil--text">הסרטונים שלנו:</h1>
    </v-card-title>

    <v-tabs
      v-model="tab"
      background-color="transparent"
      color="basil"
      grow
    >
      <v-tab
        v-for="category in categories"
        :key="category.categoryId"
      >
        {{ category.categoryName }}
      </v-tab>
    </v-tabs>

    <v-tabs-items v-model="tab">
      <v-tab-item
        v-for="category in categories"
        :key="category.categoryId"
      >
        <v-card
          color="basil"
          flat
        >
          <v-card-text>{{ text }}</v-card-text>
          <video-deck
          :categoryId="category.categoryId"></video-deck>
        </v-card>
      </v-tab-item>
    </v-tabs-items>
  </v-card>
</template>

<script>
// import VideoCard from '../components/VideoCard.vue'
import VideoDeck from '../components/VideoDeck.vue'
  export default {
    name: "Videos",
    components: {
        VideoDeck
    },
    data () {
      return {
        tab: null,
        items: [
          'אחר', 'משחקים', 'אסטרטגיות',
        ],
        categories: [
            {
                categoryId: 1,
                categoryName: "אסטרטגיות"
            },
            {
                categoryId: 2,
                categoryName: "משחקים",
            },
            {
                categoryId: 3,
                categoryName: "אחר"
            }
        ],
        text: '',
      }
    },
  }
</script>
<style scoped>
.basil {
  background-color: #FFFBE6 !important;
}
.basil--text {
  color: #356859 !important;
}
</style>