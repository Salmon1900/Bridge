<template>
  <v-app>
    <v-app-bar app color="primary" dark>
      <div class="d-flex align-center">
        <router-link to="/" tag="v-btn">
          <v-btn color="green" flat value="feed">
            <span>Feed</span>
            <v-icon>question_answer</v-icon>
          </v-btn>
        </router-link>
      </div>

      <v-spacer></v-spacer>
    </v-app-bar>

    <v-content>
      <router-view />
    </v-content>
  </v-app>
</template>

<script>
export default {
    name: "Frame",
};
</script>

<style>
</style>