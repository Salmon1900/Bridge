<template>
  <v-app>
    <v-app-bar app color="teal darken-1" dark>
      <div class="d-flex align-center">
        <router-link to="/" tag="v-btn">
          <v-btn color="blue-grey darken-2" flat large>
            <span></span>
            <v-icon>mdi-exit-to-app</v-icon>
          </v-btn>
        </router-link>
      </div>

      <v-spacer></v-spacer>
    </v-app-bar>

    <v-content id="content">
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
#content {
  background-color: #FFFBE6;
}
</style>